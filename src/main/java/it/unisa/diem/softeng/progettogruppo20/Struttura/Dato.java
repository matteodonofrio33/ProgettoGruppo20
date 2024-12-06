/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.Struttura;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author acest
 */
public abstract class Dato {

    private List<String> dati;

    public Dato() {
        dati = new LinkedList<String>();
    }

    private boolean isContenuto(String dato) {
        return true;
    }

    protected boolean aggiungiDato(String dato) {
        return true;
    }

    protected void rimuoviDato(String dato) {

    }

    protected abstract boolean modificaDato(String datoNuovo, String datoVecchio);

    private boolean limiteRaggiunto() {
        return true;
    }

    protected abstract String getTipo();

}
