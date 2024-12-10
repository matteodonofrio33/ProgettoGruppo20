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
    private boolean contiene(String dato) {
        if(!(dati.contains(dato)))
            return false;
                  
        return true;
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
        dati.add(dato);
    }

    /**
     * @brief metodo che rimuove un dato dalla lista.
     *
     * Questo metodo controlla che il dato sia contenuto nella lista e in tal
     * caso lo rimuove con una remove.
     *
     * @post Viene eliminato il dato.
     * @param[in] dato La stringa da eliminare dalla LinkedList.
     */
    protected void rimuoviDato(String dato) {

        dati.remove(dato);
        
    }

    /**
     * @brief metodo astratto che modifica un dato all'interno della lista.
     *
     * See also: aggiungiDato(), rimuoviDato()
     *
     * Questo metodo prende in input il dato vecchio, lo elimina grazie al
     * metodo rimuoviDato() e al suo posto aggiunge il dato nuovo preso in input
     * con il metodo aggiungiDato().
     *
     * @pre datoVecchio è presente nella lista.
     * @post La lista avrà uno dei suoi parametri modificato.
     * @invariant La dimensione della lista deve rimanere invariata.
     * @param[in] datoVecchio Il dato da eliminare dalla lista.
     * @param[in] datoNuovo Il dato da aggiungere alla lista.
     * @see aggiungiDato()
     * @see rimuoviDato()
     * @return true se la modifica è andata a buon fine altrimenti false.
     */
    protected abstract boolean modificaDato(String datoNuovo, String datoVecchio);

    /**
     * @brief metodo che controlla se è stato raggiunto il massimo di 3 stringhe
     * all'interno della lista.
     *
     * @post Viene restituito un booleano.
     * @invariant La lista non deve essere modificata.
     * @return true se il limite è stato raggiunto altrimenti false.
     */
    private boolean limiteRaggiunto() {
        
        int c=0;
        for(String d : dati) {
            c++;
        }
        if(c==3)
            return true;
        return false;
    }

    
    
    /**
     * @brief metodo astratto che restituisce il tipo del dato.
     *
     * @pre La lista non è vuota.
     * @post Il metodo chiamante ottiene il tipo del dato
     * @return una stringa contenente "Email" se si tratta di un oggetto della
     * classe Email altrimenti "Telefono".
     */
    protected abstract String getTipo();

    public List<String> getDati() {
        return dati;
    }
    
}
