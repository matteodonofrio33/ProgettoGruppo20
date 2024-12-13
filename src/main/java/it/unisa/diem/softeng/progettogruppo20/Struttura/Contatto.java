/**
 * @file Contatto.java
 * @brief Si occupa della creazione e gestione di un oggetto di Contatto
 *
 * @author Contaldo Luigi, Cocco Luigi, D'Errico Fabrizio, D'Onofrio Matteo.
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
     * @brief Crea un oggetto di tipo Contatto.
     *
     * See also: Telefono(), Email(), aggiungiDato().
     *
     * @pre nome e cognome non possono essere entrambi vuoti.
     * @post L'oggetto di Contatto è stato creato.
     * 
     * @param[in] nome Nome del Contatto.
     * @param[in] cognome Cognome del Contatto.
     * @param[in] telefono1 Eventuale numero di telefono del contatto.
     * @param[in] telefono2 Eventuale numero di telefono del contatto.
     * @param[in] telefono3 Eventuale numero di telefono del contatto.
     * @param[in] email1 Eventuale email del contatto.
     * @param[in] email2 Eventuale email del contatto.
     * @param[in] email3 Eventuale email del contatto.
     * @see Telefono().
     * @see Email().
     * @see aggiungiDato().
     * 
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
     * @brief Stabilisce il criterio di ordinamento del TreeSet prima per il cognome e poi per il nome. 
     * 
     * Passato il contatto in input, il metodo tratta tutti i caratteri maiuscoli e minuscolo allo stesso modo.
     * 
     * @param [in] c Contatto con i dati da comparare. 
     * @return int. 
     */
    
    @Override
    public int compareTo(Contatto c) {

        if (!this.cognome.toLowerCase().equals(c.cognome.toLowerCase())) {
            return this.cognome.toLowerCase().compareTo(c.cognome.toLowerCase()); 
        } else {
            return this.nome.toLowerCase().compareTo(c.nome.toLowerCase());
        }

    }

    
    /**
     * @brief Stabilisce che due contatti sono uguali se hanno stesso nome e cognome.
     * 
     * @param[in] o.  
     * @return boolean.  
     */
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
