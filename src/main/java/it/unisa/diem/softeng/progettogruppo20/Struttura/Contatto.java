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
     * @param[in] telefono1 Uno degli eventuali numeri di telefono del Contatto
     * @param[in] telefono2 Uno degli eventuali numeri di telefono del Contatto
     * @param[in] telefono3 Uno degli eventuali numeri di telefono del Contatto
     * @param[in] email1 Uno degli eventuali indirizzi email del Contatto
     * @param[in] email2 Uno degli eventuali indirizzi email del Contatto
     * @param[in] email3 Uno degli eventuali indirizzi email del Contatto
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


    @Override
    public int compareTo(Contatto c) {

        if (!this.cognome.equals(c.cognome)) {
            return this.cognome.compareTo(c.cognome);
        } else {
            return this.nome.compareTo(c.nome);
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
        
        return this.cognome.equals(c.cognome) && this.nome.equals(c.nome);
    

    
        
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
