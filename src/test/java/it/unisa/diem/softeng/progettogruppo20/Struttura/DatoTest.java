/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.Struttura;

import java.util.List;
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
public class DatoTest {
    
    public DatoTest() {
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
     * Test of contiene method, of class Dato.
     */
    @Test
    public void testContiene() {
        System.out.println("contiene");
        String dato = "";
        Dato instance = new DatoImpl();
        boolean expResult = false;
        boolean result = instance.contiene(dato);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of aggiungiDato method, of class Dato.
     */
    @Test
    public void testAggiungiDato() {
        System.out.println("aggiungiDato");
        String dato = "";
        Dato instance = new DatoImpl();
        instance.aggiungiDato(dato);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDati method, of class Dato.
     */
    @Test
    public void testGetDati() {
        System.out.println("getDati");
        Dato instance = new DatoImpl();
        List<String> expResult = null;
        List<String> result = instance.getDati();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    public class DatoImpl extends Dato {
    }
    
}
