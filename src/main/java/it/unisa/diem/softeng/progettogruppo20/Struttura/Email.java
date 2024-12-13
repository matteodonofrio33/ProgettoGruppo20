package it.unisa.diem.softeng.progettogruppo20.Struttura;

import static java.lang.Character.isLetter;
import java.util.List;

/**
 * @file Email.java
 * @brief Contiene una lista(String) di tre email.
 *
 * @author Contaldo Luigi, Cocco Luigi, D'Errico Fabrizio, D'Onofrio Matteo.
 * @date December 06, 2024
 * @version 1.0
 */
public class Email extends Dato {

    public Email() {
        super();
    }

    @Override
    public void aggiungiDato(String dato) {
        if (dato != "" && dato.contains("@")) {
            
            this.getDati().add(dato);
            
        }
        else
            this.getDati().add("");
    }

}
