package it.unisa.diem.softeng.progettogruppo20.Struttura;

import java.util.LinkedList;
import java.util.List;

/**
 * @file Dato.java
 * @brief Classe astratta che contiene i metodi per modificare gli attributi di un oggetto di
 * tipo Dato.
 *
 * Questa classe ha come attributo una Lista e contitene i metodi astratti che
 * saranno riscritti dalle classi Email e Telefono.
 *
 * @author Matteo D'Onofrio
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
     * @brief metodo che controlla che la Stringa inserita in input sia
     * contenuta nella lista.
     *
     * @pre La lista non è vuota.
     * @post Viene restituito un booleano.
     * @invariant La lista non deve essere modificata.
     * @param[in] dato La stringa della quale verificare l'esistenza all'interno
     * della LinkedList.
     *
     * @return true se dato è presente altrimenti false.
     */
    public boolean contiene(String dato) {
        return dati.contains(dato);
    }

    /**
     * @brief metodo che aggiunge un dato all'interno della lista.
     *
     * See also: limiteRaggiunto()
     *
     * Questo metodo controlla se non è stato raggiunto il limite di 3 elementi
     * grazie al metodo limiteRaggiunto e in tal caso esegue una add del dato
     * che riceve in ingresso all'interno della LinkedList.
     *
     * @post Verrà modificata la LinkedList.
     * @param[in] dato La stringa da aggiungere alla LinkedList.
     * @see limiteRaggiunto()
     * @return true se l'aggiunta è andata a buon fine altrimenti false.
     */
    protected void aggiungiDato(String dato) {
        if(dato=="")
            return;
        else
            dati.add(dato);
    }
    
    public List<String> getDati() {
        return dati;
    }
    
}
