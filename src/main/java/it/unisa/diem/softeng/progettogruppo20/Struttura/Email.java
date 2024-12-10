/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.Struttura;

/**
 * @file Email.java
 * @brief Classe che estende la classe Dato e ne riscrive i metodi.
 *
 * @author Matteo D'Onofrio
 * @date December 06, 2024
 * @version 1.0
 */

public class Email extends Dato {

    public Email() {
        super();
    }

    @Override
    protected String getTipo() {
        return "Email";
    }

    @Override
    protected boolean modificaDato(String emailVecchia, String emailNuova) {
        return true;
    }

}
