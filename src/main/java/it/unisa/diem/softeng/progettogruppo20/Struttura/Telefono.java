package it.unisa.diem.softeng.progettogruppo20.Struttura;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import java.util.List;

/**
 * @file Telefono.java
 * @brief Contiene una lista(String) di tre numeri di telefono.
 *
 * @author Contaldo Luigi, Cocco Luigi, D'Errico Fabrizio, D'Onofrio Matteo.
 * @date December 06, 2024
 * @version 1.0
 */
public class Telefono extends Dato {

    public Telefono() {
        super();
    }

    @Override
    public void aggiungiDato(String dato) {
        
        for(int i=0; i<dato.length(); i++) {
            if(!isDigit(dato.charAt(i))) {
                this.getDati().add("");
                return;
            }
        }

        if (dato != "" && (dato.length()==3 || dato.length()==9 || dato.length()==10)) {
            this.getDati().add(dato);
        }
        else
            this.getDati().add("");

    }

}
