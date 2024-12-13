/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import java.util.Set;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Contaldo Luigi, Cocco Luigi, D'Errico Fabrizio, D'Onofrio Matteo
 */
public class ListaContattiTest {
    
    public ListaContattiTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of aggiungiContatto method, of class ListaContatti.
     */
    @Test
    public void testAggiungiContatto() {
        System.out.println("aggiungiContatto");
        String nome = "";
        String cognome = "";
        String telefono1 = "";
        String telefono2 = "";
        String telefono3 = "";
        String email1 = "";
        String email2 = "";
        String email3 = "";
        ListaContatti instance = new ListaContatti();
        instance.aggiungiContatto(nome, cognome, telefono1, telefono2, telefono3, email1, email2, email3);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cercaContatto method, of class ListaContatti.
     */
    @Test
    public void testCercaContatto() {
        System.out.println("cercaContatto");
        String nome = "";
        String cognome = "";
        ListaContatti instance = new ListaContatti();
        ListaContatti expResult = null;
        ListaContatti result = instance.cercaContatto(nome, cognome);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of rimuoviContatto method, of class ListaContatti.
     */
    @Test
    public void testRimuoviContatto() {
        System.out.println("rimuoviContatto");
        Contatto c = null;
        ListaContatti instance = new ListaContatti();
        instance.rimuoviContatto(c);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of modificaContatto method, of class ListaContatti.
     */
    @Test
    public void testModificaContatto() {
        System.out.println("modificaContatto");
        Contatto c = null;
        String nomeNuovo = "";
        String cognomeNuovo = "";
        String telNuovo1 = "";
        String telNuovo2 = "";
        String telNuovo3 = "";
        String emailNuova1 = "";
        String emailNuova2 = "";
        String emailNuova3 = "";
        ListaContatti instance = new ListaContatti();
        boolean expResult = false;
        boolean result = instance.modificaContatto(c, nomeNuovo, cognomeNuovo, telNuovo1, telNuovo2, telNuovo3, emailNuova1, emailNuova2, emailNuova3);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }


    
}
