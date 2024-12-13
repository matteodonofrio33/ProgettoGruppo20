package it.unisa.diem.softeng.progettogruppo20.gestione;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

/**
 * @file ListaContatti.java
 * @brief Classe che contiene i contatti organizzati in una Collection di tipo
 * Set.
 *
 * Questa classe contiene una lista di contatti organizzati in una Collection di
 * tipo TreeSet<Contatto> e i metodi necessari a svolgere operazioni su di essa.
 *
 * @author Contaldo Luigi, Cocco Luigi, D'Errico Fabrizio, D'Onofrio Matteo.
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



    /**
     * @brief Metodo che aggiunge un contatto alla lista.
     *
     * See also: Contatto().
     * @pre nome e cognome non possono essere entrambi vuoti.
     * @post Il contatto viene aggiunto al TreeSet.
     *
     * @param[in] nome Eventuale nome del contatto che si vuole aggiungere.
     * @param[in] cognome Eventuale cognome del contatto che si vuole
     * aggiungere.
     * @param[in] telefono1 Eventuale numero di telefono del contatto.
     * @param[in] telefono2 Eventuale numero di telefono del contatto.
     * @param[in] telefono3 Eventuale numero di telefono del contatto.
     * @param[in] email1 Eventuale email del contatto.
     * @param[in] email2 Eventuale email del contatto.
     * @param[in] email3 Eventuale email del contatto.
     * @see Contatto()
     */
    public void aggiungiContatto(String nome, String cognome, String telefono1, String telefono2, String telefono3, String email1, String email2, String email3) {

        Contatto c = new Contatto(nome, cognome, telefono1, telefono2, telefono3, email1, email2, email3);
        elenco.add(c);

    }

    /**
     * @brief Cerca i contatti contenenti le sottostringhe di cognome o nome.
     *
     * @post lista di contatti che contiene i contatti cercati.
     * @invariant La lista non deve essere modificata.
     *
     * @param[in] nome Nome o sottostringa del contatto da cercare.
     * @param[in] cognome Cognome o sottostringa del contatto da cercare.
     * @return Un oggetto di ListaContatti filtrata tramite le sottostringhe di
     * cognome o nome.
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
     * @brief Rimuove un contatto dalla lista.
     *
     * @pre Il contatto dev'essere presente nella lista.
     * @post Il contatto viene rimosso dalla lista.
     *
     * @param[in] c Contatto da rimuovere
     */
    public void rimuoviContatto(Contatto c) {

        elenco.remove(c);
    }

    /**
     * @brief Modifica un contatto.
     *
     * See also: rimuoviContatto(), aggiungiContatto().
     *
     * Il metodo verifica che i dati da modificare non siano presenti
     * all'interno dello stesso contatto e nel caso in cui non siano presenti
     * procede con la modifica.
     *
     * @pre Il contatto è presente nella lista.
     * @post Il contatto viene modificato.
     * @invariant La dimensione della lista resta invariata.
     *
     * @param[in] c E' il contatto che dev'essere modificato.
     * @param[in] nomeNuovo Nome del contatto che sostituisce il vecchio.
     * @param[in] cognomeNuovo Cognome del contatto che sostituisce il vecchio.
     * @param[in] telNuovo1 Telefono che sostituisce il precedente.
     * @param[in] telNuovo2 Telefono che sostituisce il precedente.
     * @param[in] telNuovo3 Telefono che sostituisce il precedente.
     * @param[in] emailNuova1 Email che sostituisce la precedente.
     * @param[in] emailNuova2 Email che sostituisce la precedente.
     * @param[in] emailNuova3 Email che sostituisce la precedente.
     *
     * @see rimuoviContatto()
     * @see aggiungiContatto()
     *
     *
     * @return true quando il contatto viene modificato, altrimenti false
     */
    public boolean modificaContatto(Contatto c, String nomeNuovo, String cognomeNuovo, String telNuovo1, String telNuovo2, String telNuovo3, String emailNuova1, String emailNuova2, String emailNuova3) {

        //if (!verificaDuplicatiEmail(emailNuova1, emailNuova2, emailNuova3) && !verificaDuplicatiTelefono(telNuovo1, telNuovo2, telNuovo3)) {
        rimuoviContatto(c);
        aggiungiContatto(nomeNuovo, cognomeNuovo, telNuovo1, telNuovo2, telNuovo3, emailNuova1, emailNuova2, emailNuova3);
        //}

        return true;
    }

    public Set<Contatto> getElenco() {
        return elenco;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ListaContatti other = (ListaContatti) obj;
        if (!Objects.equals(this.elenco, other.elenco)) {
            return false;
        }
        return true;
    }

}
