/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.Struttura;

/**
 *
 * @author luigicocco
 */
public class Contatto implements Comparable{
    private String nome;
    private String cognome;
    private Dato tel;
    private Dato email;
    
    public Contatto(String nome, String cognome, String telefono, String email){
        this.nome = nome;
        this.cognome = cognome;
        this.tel = new Telefono();
        this.email = new Email();
        
        this.tel.aggiungiDato(telefono);
        this.email.aggiungiDato(email);
        
    }
    
    @Override
    public int compareTo(Object o){
        return 0;
    }
    
    protected boolean modifica(String nomeNuovo, String cognomeNuovo, String emailVecchia, String emailNuova, String telefonoVecchio, String telefonoNuovo){
        
        
        return true;
    }
    
    
    
}
