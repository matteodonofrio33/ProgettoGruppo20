/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import java.util.Set;
import java.util.TreeSet;

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
     * @param[in] telefono Eventuale numero di telefono del contatto che si
     * vuole aggiungere.
     * @param[in] email Eventuale indirizzo email del contatto che si vuole
     * aggiungere.
     *
     * @return true quando l'aggiunta ha esito positivo, altrimenti false
     */
    public boolean aggiungiContatto(String nome, String cognome, String telefono, String email) {

        boolean flag;
        Contatto c = new Contatto(nome, cognome, telefono, email);

        flag = elenco.add(c);
        if (!flag) {
            return false;
        }

        return true;
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
        return null;
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
     * @return true quando la rimozione ha esito positivo, altrimenti false
     */
    public boolean rimuoviContatto(Contatto c) {
        return true;
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
    public boolean modificaContatto(String nomeVecchio, String nomeNuovo, String cognomeVecchio, String cognomeNuovo, String emailVecchia, String emailNuova, String telefonoVecchio, String telefonoNuovo) {
        return true;
    }
    
    @Override
    public String toString() {
        
        StringBuffer sb=new StringBuffer();
        
        sb.append("NOME,COGNOME,TELEFONO1,TELEFONO2,TELEFONO3,EMAIL1,EMAIL2,EMAIL3");
        
        for(Contatto c : elenco) {
            sb.append(formattazioneCSV(c.getNome())).append(",");
            sb.append(formattazioneCSV(c.getCognome())).append(",");
            for(String telefono : c.getTel().getDati()){  
                sb.append(formattazioneCSV(telefono)).append(",");  
            }
            for(String email : c.getEmail().getDati()){
                sb.append(formattazioneCSV(email)).append(",");
            }
        }
        return sb.toString();
    }
    
    private String formattazioneCSV(String valore) {
        if(valore==null)
            return "";
        if(valore.contains(",") || valore.contains("\n") || valore.contains("\"")) {
            return "\"" + valore.replace("\"", "\"\"") + "\"";
        }
        
        return valore;
    }

    public Set<Contatto> getElenco() {
        return elenco;
    }
    
    
    
}
