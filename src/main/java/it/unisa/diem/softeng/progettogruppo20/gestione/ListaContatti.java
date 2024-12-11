/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import java.util.Set;
import java.util.TreeSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @file ListaContatti.java
 * @brief Classe che contiene i contatti organizzati in una Collection Set.
 *
 * Questa classe contiene una lista di contatti organizzati in una Collection di
 * tipo TreeSet<Contatto> e i metodi necessari a svolgere operazioni su di essa.
 *
 * @author Fabrizio D'Errico
 * @date December 06, 2024
 * @version 1.0
 */
public class ListaContatti {

    private Set<Contatto> elenco;

    /**
     * @brief Costruttore.
     *
     * Inizializzazione della struttura della collection.
     *
     */
    public ListaContatti() {
        this.elenco = new TreeSet<Contatto>();
    }

    /*
        public Set<Contatto> getElenco(){
        return elenco;
        }
     */
    
    /**
     * @brief Metodo che verifica che non ci sono numeri di telefono duplicati
     * 
     * 
     * questo metodo verifica che all'interno della struttura dati non siano presenti duplicati tramite il controllo dei numeri di telefono:
     * viene fatta scorrere la struttura, si accede al telefonoN e lo si confronta con quello passato in input.
     * 
     * @pre  La struttura deve essere popolata
     * @post Il metodo ritorna true se il numero è già presente
     * @invariant la struttura non viene modificata
     * 
     * @param[in] telefono1 Eventuale numero di telefono del Contatto su cui viene fatto il controllo
     * @param[in] telefono2 Eventuale numero di telefono del Contatto su cui viene fatto il controllo
     * @param[in] telefono3 Eventuale numero di telefono del Contatto su cui viene fatto il controllo
     * @return true se l'operazione ha successo, altrimenti false
     */
    private boolean verificaDuplicatiTelefono(String telefono1, String telefono2, String telefono3) {

        boolean presente = false;

        for (Contatto cnt : elenco) {

            for (String telefono : cnt.getTel().getDati()) {

                if (telefono1 != null && (!telefono.isEmpty()) && telefono.equals(telefono1)) {

                    presente = true;

                }

                if (telefono2 != null && (!telefono.isEmpty()) && telefono.equals(telefono2)) {

                    presente = true;

                }

                if (telefono3 != null && (!telefono.isEmpty()) && telefono.equals(telefono3)) {

                    presente = true;

                }

            }
        }

        return presente;
    }
/**
 * @brief Metodo che verifica che non ci sono indirizzi email duplicati
 * 
 * Questo metodo verifica che all'interno della struttura dati non siano presenti duplicati tramite il controllo degli indirizzi email:
 * viene fatta scorrere la struttura, si accede all'indirizzo emailN e lo si confronta con quello passato in input.
 * 
 * 
 * @pre La struttura deve essere popolata
 * @post Il metodo ritorna true se l'indirizzo email è già presente
 * @invariant la struttura non viene modificata
 * 
 * @param[in] email1 Eventuale indirizzo email del Contatto su cui viene fatto il controllo
 * @param[in] email2 Eventuale indirizzo email del Contatto su cui viene fatto il controllo
 * @param[in] email3 Eventuale indirizzo email del Contatto su cui viene fatto il controllo
 * 
 * @return true se l'operazione ha successo, altrimenti false
 */
    private boolean verificaDuplicatiEmail(String email1, String email2, String email3) {

        boolean presente = false;

        for (Contatto cnt : elenco) {
            for (String email : cnt.getEmail().getDati()) {

                if (email1 != null && (!email.isEmpty()) && email.equals(email1)) {

                    presente = true;

                }

                if (email2 != null && (!email.isEmpty()) && email.equals(email2)) {

                    presente = true;

                }

                if (email3 != null && (!email.isEmpty()) && email.equals(email3)) {

                    presente = true;

                }

            }

        }
        return presente;
    }

    /**
     * @brief Metodo che aggiunge un contatto alla lista.
     *
     * Il metodo verifica che non sia presente già un contatto con le stesse
     * informazioni, scorre la lista e ,nel caso in cui il riscontro fosse
     * positivo, viene aggiunto il nuovo contatto.
     *
     * @pre Il contatto non deve essere già presente in rubrica
     * @pre nome o cognome non devono essere nulli.
     * @post Il contatto viene aggiunto.
     *
     * @param[in] nome Eventuale nome del contatto che si vuole aggiungere.
     * @param[in] cognome Eventuale cognome del contatto che si vuole
     * aggiungere.
     * @param[in] telefono1 Uno degli eventuali numeri di telefono che si vogliono aggiungere 
     * @param[in] telefono2 Uno degli eventuali numeri di telefono che si vogliono aggiungere 
     * @param[in] telefono3 Uno degli eventuali numeri di telefono che si vogliono aggiungere 
     * @param[in] email1 Uno degli eventuali indirizzi email che si vuole aggiungere
     * @param[in] email2 Uno degli eventuali indirizzi email che si vuole aggiungere
     * @param[in] email3 Uno degli eventuali indirizzi email che si vuole aggiungere
     *
     */
    public void aggiungiContatto(String nome, String cognome, String telefono1, String telefono2, String telefono3, String email1, String email2, String email3) {
        boolean presente = false;

        if (!verificaDuplicatiEmail(email1, email2, email3) && !verificaDuplicatiTelefono(telefono1, telefono2, telefono3)) {
            Contatto c = new Contatto(nome, cognome, telefono1, telefono2, telefono3, email1, email2, email3);
            elenco.add(c);

        } else {
            System.out.println("\n DATO PRESENTE");
            presente = false;
        }

    }

    /**
     * @brief Cerca il contatto.
     *
     * Data una sottostringa di nome, cognome oppure entrambe, ritorna un array
     * di contatti.
     *
     * @pre Il contatto deve essere presente nella lista.
     * @post Il contatto viene restituito.
     * @invariant La lista non deve essere modificata.
     *
     * @param[in] nome Nome o sottostringa del contatto da cercare.
     * @param[in] cognome Cognome o sottostringa del contatto da cercare.
     * @return lista di contatti.
     */
    public ListaContatti cercaContatto(String nome, String cognome) {
        ListaContatti listaFiltrata = new ListaContatti();

        for (Contatto c : elenco) {
            if ((nome.isEmpty() || c.getNome().toLowerCase().contains(nome.toLowerCase())) && (cognome.isEmpty() || c.getCognome().toLowerCase().contains(cognome.toLowerCase()))) {
                
                listaFiltrata.aggiungiContatto(c.getNome(), c.getCognome(), c.getTel().getDati().get(0), c.getTel().getDati().get(1), c.getTel().getDati().get(2),
                                                c.getEmail().getDati().get(0), c.getEmail().getDati().get(1), c.getEmail().getDati().get(2));
            }
        }
        return listaFiltrata;
    }

    /**
     * @brief Rimuove un contatto.
     *
     * Il metodo permette di rimuovere un contatto dalla lista tramite remove,
     * dopo aver verificato che il contatto sia effettivamente presente.
     *
     * @pre Il contatto deve essere presente nella lista.
     * @post Il contatto viene rimosso dalla lista.
     *
     * @param[in] c Contatto da rimuovere
     * @see cercaContatto()
     *
     */
    public void rimuoviContatto(Contatto c) {
        elenco.remove(c);
    }

    /**
     * @brief Modifica un contatto.
     *
     * Il metodo permette di modificare un contatto: cerca il contatto da
     * modificare, scorre la lista dei contatti per verificare che i dati non
     * siano presenti in altri utenti e, nel caso in cui non lo fossero,
     * modifica il contatto invocando il metodo modifica() nella classe
     * Contatto.
     *
     * @pre Il contatto deve essere presente nella lista.
     * @post Il contatto viene modificato.
     * @invariant La dimensione della lista resta invariata.
     *
     * @param[in] nomeVecchio Nome che serve a cercare il contatto nella lista.
     * @param[in] nomeNuovo Nome che viene eventualmente sostituito al
     * precedente.
     * @param[in] cognomeVecchio Cognome che serve a cercare il contatto nella
     * lista.
     * @param[in] cognomeNuovo Cognome del contatto che viene eventualmente
     * sostituito al precedente.
     * @param[in] emailVecchia Indirizzo email precedente.
     * @param[in] emailNuova Indirizzo email nuovo che viene eventualmente
     * sostituito al precedente.
     * @param[in] telefonoVecchio Numero di telefono precedente.
     * @param[in] telefonoNuovo Numero di telefono nuovo eventualmente
     * sostituito al precedente.
     *
     * @see cercaContatto()
     * @see modifica()
     *
     *
     * @return true quando il contatto viene modificato, altrimenti false
     */
    public boolean modificaContatto(Contatto c, String nomeNuovo, String cognomeNuovo, String telNuovo1, String telNuovo2, String telNuovo3, String emailNuova1, String emailNuova2, String emailNuova3) {

       if (!verificaDuplicatiEmail(emailNuova1, emailNuova2, emailNuova3) && !verificaDuplicatiTelefono(telNuovo1, telNuovo2, telNuovo3)) {
            
            /*c.setNome(nomeNuovo);
            c.setCognome(cognomeNuovo);
            
            c.getEmail().getDati().set(0, emailNuova1);
            c.getEmail().getDati().set(1, emailNuova2);
            c.getEmail().getDati().set(2, emailNuova3);
            
            c.getTel().getDati().set(0, telNuovo1);
            c.getTel().getDati().set(1, telNuovo2);
            c.getTel().getDati().set(2, telNuovo3);*/
            
            rimuoviContatto(c);
            aggiungiContatto(nomeNuovo, cognomeNuovo, telNuovo1, telNuovo2, telNuovo3, emailNuova1, emailNuova2, emailNuova3);
            
            
        }
       
       
        
        return true;
    }

    @Override
    public String toString() {

        StringBuffer sb = new StringBuffer();

        sb.append("NOME,COGNOME,TELEFONO1,TELEFONO2,TELEFONO3,EMAIL1,EMAIL2,EMAIL3");

        for (Contatto c : elenco) {
            sb.append(formattazioneCSV(c.getNome())).append(",");
            sb.append(formattazioneCSV(c.getCognome())).append(",");
            for (String telefono : c.getTel().getDati()) {
                sb.append(formattazioneCSV(telefono)).append(",");
            }
            for (String email : c.getEmail().getDati()) {
                sb.append(formattazioneCSV(email)).append(",");
            }
        }
        return sb.toString();
    }

    private String formattazioneCSV(String valore) {
        if (valore == null) {
            return "";
        }
        if (valore.contains(",") || valore.contains("\n") || valore.contains("\"")) {
            return "\"" + valore.replace("\"", "\"\"") + "\"";
        }

        return valore;
    }

    public Set<Contatto> getElenco() {
        return elenco;
    }

}
