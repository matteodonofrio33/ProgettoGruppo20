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

public class Contatto implements Comparable<Contatto> {

    private String nome;
    private String cognome;
    private Telefono tel;
    private Email email;

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
    public Contatto(String nome, String cognome, String telefono1, String telefono2, String telefono3, String email1, String email2, String email3) {
        this.nome = nome;
        this.cognome = cognome;
        this.tel = new Telefono();
        this.email = new Email();

        this.tel.aggiungiDato(telefono1);
        this.tel.aggiungiDato(telefono2);
        this.tel.aggiungiDato(telefono3);
        this.email.aggiungiDato(email1);
        this.email.aggiungiDato(email2);
        this.email.aggiungiDato(email3);
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
     *
    protected boolean modifica(String nomeNuovo, String cognomeNuovo, String emailVecchia, String emailNuova, String telefonoVecchio, String telefonoNuovo) {

        return true;
    }
*/
    
    
    @Override
    public int compareTo(Contatto c) {

        if (!this.cognome.toLowerCase().equals(c.cognome.toLowerCase())) {
            return this.cognome.toLowerCase().compareTo(c.cognome.toLowerCase());
        } else {
            return this.nome.toLowerCase().compareTo(c.nome.toLowerCase());
        }

    }

    @Override
    public boolean equals(Object o) {
        if (o == null) {
            return false;
        }

        if (this == o) {
            return true;
        }

        
        if (!(o instanceof Contatto)) {
             return false;
        }
         
        Contatto c = (Contatto) o;
        
        return this.cognome.toLowerCase().equals(c.cognome.toLowerCase()) && this.nome.toLowerCase().equals(c.nome.toLowerCase());
    

    
        
    }
    
    public String getNome() {
        return nome;
    }

    public String getCognome() {
        return cognome;
    }

    public Telefono getTel() {
        return tel;
    }

    public Email getEmail() {
        return email;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }
    
    

}
