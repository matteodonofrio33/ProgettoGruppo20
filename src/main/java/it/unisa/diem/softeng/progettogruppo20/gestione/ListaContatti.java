/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author fabrizio d'errico
 */
public class ListaContatti {

    private Set<Contatto> elenco;

    public ListaContatti() {
        this.elenco = new TreeSet<Contatto>();
    }

    /*
        public Set<Contatto> getElenco(){
        return elenco;
        }
     */
    public boolean aggiungiContatto(String nome, String cognome, String telefono, String email) {

        return true;
    }

    public ListaContatti cercaContatto(String nome, String cognome) {
        return null;
    }

    public boolean rimuoviContatto(Contatto c) {
        return true;
    }

    public boolean modificaContatto(String nomeVecchio, String nomeNuovo, String cognomeVecchio, String cognomeNuovo, String emailVecchia, String emailNuova, String telefonoVecchio, String telefonoNuovo) {
        return true;
    }
}
