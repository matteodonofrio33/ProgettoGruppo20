/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.Struttura;

/**
 *
 * @author acest
 */
public class Telefono extends Dato {

    public Telefono() {
        super();
    }

    @Override
    protected String getTipo() {
        return "Telefono";
    }

    @Override
    protected boolean modificaDato(String telefonoVecchio, String telefonoNuovo) {
        return true;
    }

}
