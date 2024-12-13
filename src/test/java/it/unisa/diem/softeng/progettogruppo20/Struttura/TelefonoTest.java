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

    public TelefonoTest() {
    }



    /**
     * Test of aggiungiDato method, of class Telefono.
     */
    @Test
    public void testAggiungiDato() {

        System.out.println("aggiungiDato");
        String tel1 = "118";
        String tel2 = "111333"; 
        String tel3 = "333111555";
        
        Telefono telefono = new Telefono();
        telefono.aggiungiDato(tel1);
        telefono.aggiungiDato(tel2);
        telefono.aggiungiDato(tel3);
        
        assertEquals(true, telefono.contiene(tel1));
        assertEquals(false, telefono.contiene(tel2));
        assertEquals(true, telefono.contiene(tel3));
        
        
        
        

    }

}
