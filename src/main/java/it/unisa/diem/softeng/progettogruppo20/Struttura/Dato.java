package it.unisa.diem.softeng.progettogruppo20.Struttura;

import java.util.LinkedList;
import java.util.List;

/**
 * @file Dato.java
 * @brief Classe astratta che contiene i metodi per modificare un oggetto di
 * tipo Dato.
 *
 * Questa classe ha come attributo una Lista e contitene i metodi astratti che
 * saranno riscritti dalle classi Email e Telefono, ed essendo una classe
 * astratta si potrà aggiungere alla classe Contatto qualsiasi attributo
 * creandone una relativa classe che estende questa cclasse e ne riscrive i
 * metodi astratti.
 *
 * @author Matteo D'Onofrio
 * @date December 06, 2024
 * @version 1.0
 */
public abstract class Dato {

    private List<String> dati;

    /**
     * @brief Costruttore. Crea una LinkedList di stringhe chiamata dati.
     */
    public Dato() {
        dati = new LinkedList<String>();
    }

    /**
     * @brief metodo che controlla che il dato inserito in input sia contenuto
     * nella lista.
     *
     * Questo metodo scorre la LinkedList e restituisce true se la stringa
     * inserita in input è contenuta in essa altrimeti false.
     *
     * @pre La lista non è vuota.
     * @post Viene restituito un booleano.
     * @invariant La lista non deve essere modificata.
     * @param[in] dato La stringa della quale verificare l'esistenza all'interno
     * della LinkedList.
     *
     * @return true o false.
     */
    private boolean isContenuto(String dato) {
        return true;
    }

    /**
     * @brief metodo che aggiunge un dato all'interno della lista.
     *
     * Questo metodo controlla se non è stato raggiunto il limite di 3 elementi
     * grazie al metodo limiteRaggiunto e in tal caso esegue una add del dato
     * che riceve in ingresso all'interno della LinkedList.
     *
     * @post Verrà modificata la LinkedList.
     * @param[in] dato La stringa da aggiungere alla LinkedList.
     * @see limiteRaggiunto()
     * @return true o false.
     */
    protected boolean aggiungiDato(String dato) {
        return true;
    }

    /**
     * @brief metodo che rimuove un dato dalla lista.
     *
     * Questo metodo controlla che il dato sia contenuto nella lista e in tal
     * caso lo rimuove con una remove.
     *
     * @post Viene eliminato il dato se presente.
     * @param[in] dato La stringa da eliminare dalla LinkedList.
     */
    protected void rimuoviDato(String dato) {

    }

    /**
     * @brief metodo che modifica un dato all'interno della lista.
     *
     * Questo metodo prende in input il dato vecchio, lo elimina grazie al
     * metodo rimuoviDato() e al suo posto aggiunge il dato nuovo preso in input
     * con il metodo aggiungiDato().
     *
     * @pre datoVecchio è presente nella lista.
     * @post La lista avrà uno dei suoi parametri modificato.
     * @invariant La dimensione della lista deve rimanere invariata.
     * @param[in] datoVecchio Il dato da eliminare dalla lista.
     * @param[in] datoVecchio Il dato da aggiungere alla lista.
     * @see aggiungiDato()
     * @see rimuoviDato()
     * @return true o false.
     */
    protected abstract boolean modificaDato(String datoNuovo, String datoVecchio);

    /**
     * @brief metodo che controlla se è stato superato il massimo di dati.
     *
     * Questo metodo controlla la dimensione della lista se è uguale a 3
     * restistuisce true altrimenti false.
     *
     * @post Viene restituito un booleano.
     * @invariant La lista non deve essere modificata.
     * @return true o false.
     */
    private boolean limiteRaggiunto() {
        return true;
    }

    /**
     * @brief metodo che restituisce il tipo del dato.
     *
     * Questo metodo se è fa rifereimento ad un oggetto della classe Email
     * restitusice "Email", altrimenti se fa riferimento ad un oggetto della
     * classe Telefono restuisice "Telefono".
     *
     * @pre La lista non è vuota.
     * @post Il metodo chiamante saprà di che tipo è il dato presente
     * nell'oggetto di tipo Contatto.
     * @invariant La lista non è vuota.
     * @return una stringa contenente "Email" o "Telefono".
     */
    protected abstract String getTipo();

}
