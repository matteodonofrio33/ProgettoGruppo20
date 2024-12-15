package it.unisa.diem.softeng.progettogruppo20.Struttura;

import java.util.LinkedList;
import java.util.List;

/**
 * @file Dato.java
 * @brief Classe astratta che contiene i metodi per modificare gli attributi di
 * un oggetto di tipo Dato.
 *
 * Questa classe ha come attributo una Lista utile per contenere i dati del
 * contatto.
 *
 * @author Contaldo Luigi, Cocco Luigi, D'Errico Fabrizio, D'Onofrio Matteo.
 * @date December 06, 2024
 * @version 1.0
 */
public abstract class Dato {

    private List<String> dati;

    /**
     * @brief Costruttore.
     *
     * Crea una LinkedList di stringhe chiamata dati.
     */
    public Dato() {
        dati = new LinkedList<String>();
    }

    /**
     * @brief Metodo che controlla che la Stringa inserita in input sia
     * contenuta nella lista.
     *
     * @pre La lista non è vuota.
     * @post Viene restituito un booleano.
     * @param[in] dato La stringa della quale verificare l'esistenza all'interno
     * della LinkedList.
     *
     * @return true se dato è presente altrimenti false.
     */
    public boolean contiene(String dato) {
        return dati.contains(dato);
    }

    /**
     * @brief Metodo che aggiunge un dato all'interno della lista.
     *
     * @pre La lista di Dato non deve avere più di tre elementi.
     * @post La stinga passata in input sarà aggiunta alla LinkedList.
     * @param[in] dato La stringa da aggiungere alla LinkedList.
     * @invariant i dati già presenti nella LinkedList non devono essere
     * modificati.
     */
    public abstract void aggiungiDato(String dato);

    public List<String> getDati() {
        return dati;
    }

}
