/**
 * @file Contatto.java
 * @brief si occupa della creazione e gestione di un oggetto di Contatto
 *
 * per l'implementazione dell'ordinamento è stato utilizzato un compareTo(..)
 * implementando l'interfaccia Comparable
 *
 * @author Luigi Cocco
 * @date December 6, 2024
 * @version 1.0
 */
package it.unisa.diem.softeng.progettogruppo20.Struttura;

public class Contatto implements Comparable {

    private String nome;
    private String cognome;
    private Dato tel;
    private Dato email;

    /**
     * @brief Crea un oggetto di tipo Contatto
     *
     * See also: Telefono(), Email(), aggiungiDato()
     *
     * Per email e telefono chiama aggiungiDato(..)
     *
     * @pre 'nome!=null || cognome!=null' non possono essere entrambi null
     * @post L'oggetto contatto è stato creato
     *
     *
     * @param[in] nome è il nome del Contatto
     * @param[in] cognome è il cognome del Contatto
     * @param[in] telefono è il numero del Contatto
     * @param[in] email è l'email del Contatto
     * @see Telefono()
     * @see Email()
     * @see aggiungiDato()
     */
    public Contatto(String nome, String cognome, String telefono, String email) {
        this.nome = nome;
        this.cognome = cognome;
        this.tel = new Telefono();
        this.email = new Email();

        this.tel.aggiungiDato(telefono);
        this.email.aggiungiDato(email);
    }

    /**
     * @brief modifica il contatto attuale con i parametri nuovi
     *
     * See also: modificaDato()
     *
     * Se il parametroNuovo è non nullo allora sovrascrive il parametroVecchio
     * Se devono essere modificate l'emailVecchia oppure il telefonoVecchio
     * allora viene invocato modificaDato(..)
     *
     * @pre ' nomeNuovo!=null || cognomeNuovo!=null || emailNuova!=null ||
     * telefonoNuovo!=null '
     * @post il contatto è stato modificato
     * @invariant i dati del contatto ai quali sono associati (parametroNuovo ==
     * null) non devono essere modificati
     *
     * @param[in] nomeNuovo sovrascrive il nome dell'istanza corrente
     * @param[in] cognomeNuovo sovrascrive il cognome dell'istanza corrente
     * @param[in] emailVecchia è l'email che si vuole sovrascrivere
     * @param[in] emailNuova è l'email che sovrascrive emailVecchia
     * @param[in] telefonoVecchio è il numero di telefono che si vuole
     * sovrascrivere
     * @param[in] telefonoNuovo è il numero di telefono che sovrascrive
     * telefonoVecchio
     * @see modificaDato()
     * @return se la modifica è avvenuta con successo ritorna true, altrimenti
     * false
     */
    protected boolean modifica(String nomeNuovo, String cognomeNuovo, String emailVecchia, String emailNuova, String telefonoVecchio, String telefonoNuovo) {

        return true;
    }

    @Override
    public int compareTo(Object o) {
        Contatto c = (Contatto) o;

        if (!this.cognome.equals(c.cognome)) {
            return this.cognome.compareTo(c.cognome);
        } else {
            return this.nome.compareTo(c.nome);
        }
    }

    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Dato getTel() {
        return tel;
    }

    public Dato getEmail() {
        return email;
    }
    
    
}
