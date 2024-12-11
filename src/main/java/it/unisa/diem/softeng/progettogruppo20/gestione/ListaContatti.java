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

    private boolean verificaDuplicatiTelefono(String telefono1, String telefono2, String telefono3) {

        boolean presente = false;

        for (Contatto cnt : elenco) {
            if (!telefono1.isEmpty() && (!telefono1.equals(cnt.getTel().getDati().get(0)))) {

                if (cnt.getTel().contiene(telefono1)) {

                    presente = true;
                }
            }

            if (!telefono2.isEmpty() && (!telefono2.equals(cnt.getTel().getDati().get(1)))) {

                if (cnt.getTel().contiene(telefono2)) {
                    presente = true;
                }
            }

            if (!telefono3.isEmpty() && (!telefono3.equals(cnt.getTel().getDati().get(2)))) {
                
                if (cnt.getTel().contiene(telefono3)) {
                    presente = true;
                }
            }

        }

        return presente;
    }

    private boolean verificaDuplicatiEmail(String email1, String email2, String email3) {

        boolean presente = false;

        for (Contatto cnt : elenco) {
            if (!email1.isEmpty() && (!email1.equals(cnt.getEmail().getDati().get(0)))) {
                if (cnt.getEmail().contiene(email1)) {
                    presente = true;
                }
            }

            if (!email2.isEmpty() && (!email2.equals(cnt.getEmail().getDati().get(1)))) {
                if (cnt.getEmail().contiene(email2)) {
                    presente = true;
                }
            }

            if (!email3.isEmpty() && (!email3.equals(cnt.getEmail().getDati().get(2)))) {
                if (cnt.getEmail().contiene(email3)) {
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
     * @param[in] telefono Eventuale numero di telefono del contatto che si
     * vuole aggiungere.
     * @param[in] email Eventuale indirizzo email del contatto che si vuole
     * aggiungere.
     *
     * @return true quando l'aggiunta ha esito positivo, altrimenti false
     */
    public void aggiungiContatto(String nome, String cognome, String telefono1, String telefono2, String telefono3, String email1, String email2, String email3) {

        Contatto c = new Contatto(nome, cognome, telefono1, telefono2, telefono3, email1, email2, email3);
        elenco.add(c);

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
     * @return true quando la rimozione ha esito positivo, altrimenti false
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

            rimuoviContatto(c);
            aggiungiContatto(nomeNuovo, cognomeNuovo, telNuovo1, telNuovo2, telNuovo3, emailNuova1, emailNuova2, emailNuova3);
        }

        return true;
    }

    public Set<Contatto> getElenco() {
        return elenco;
    }

}
