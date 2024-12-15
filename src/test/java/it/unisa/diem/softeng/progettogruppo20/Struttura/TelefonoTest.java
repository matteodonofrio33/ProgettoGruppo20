/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.Struttura;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author luigicocco
 */
public class TelefonoTest {

    /**
     * Test of aggiungiDato method, of class Telefono.
     */
    @Test
    public void testAggiungiDato() {

        System.out.println("aggiungiDato");
        String tel1 = "118";
        String tel2 = "111333"; 
        String tel3 = "333111555";
        String tel4 = "333111555a";
        
        Telefono telefono = new Telefono();
        telefono.aggiungiDato(tel1);
        telefono.aggiungiDato(tel2);
        assertEquals(telefono.getDati().get(0), tel1); //test dell'invariante
        telefono.aggiungiDato(tel3);
        assertEquals(telefono.getDati().get(0), tel1); //test dell'invariante
        telefono.aggiungiDato(tel4);
        assertEquals(telefono.getDati().get(0), tel1); //test dell'invariante
        assertEquals(telefono.getDati().get(2), tel3); //test dell'invariante
        
        assertEquals(true, telefono.contiene(tel1));
        assertEquals(false, telefono.contiene(tel2)); //in questo modo viene testato anche il metodo contiene()
        assertEquals(true, telefono.contiene(tel3));
        assertEquals(false, telefono.contiene(tel4));    
        

    }

}
