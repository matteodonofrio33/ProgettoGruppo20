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
 * @author fabri
 */
public class ContattoTest {
    
    public ContattoTest() {
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
     * Test of compareTo method, of class Contatto.
     */
    @Test
    public void testCompareTo() {
        System.out.println("compareTo");
        Contatto c = null;
        Contatto instance = null;
        int expResult = 0;
        int result = instance.compareTo(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of equals method, of class Contatto.
     */
    @Test
    public void testEquals() {
        System.out.println("equals");
        Object o = null;
        Contatto instance = null;
        boolean expResult = false;
        boolean result = instance.equals(o);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNome method, of class Contatto.
     */
    @Test
    public void testGetNome() {
        System.out.println("getNome");
        Contatto instance = null;
        String expResult = "";
        String result = instance.getNome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCognome method, of class Contatto.
     */
    @Test
    public void testGetCognome() {
        System.out.println("getCognome");
        Contatto instance = null;
        String expResult = "";
        String result = instance.getCognome();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTel method, of class Contatto.
     */
    @Test
    public void testGetTel() {
        System.out.println("getTel");
        Contatto instance = null;
        Telefono expResult = null;
        Telefono result = instance.getTel();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class Contatto.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        Contatto instance = null;
        Email expResult = null;
        Email result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNome method, of class Contatto.
     */
    @Test
    public void testSetNome() {
        System.out.println("setNome");
        String nome = "";
        Contatto instance = null;
        instance.setNome(nome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCognome method, of class Contatto.
     */
    @Test
    public void testSetCognome() {
        System.out.println("setCognome");
        String cognome = "";
        Contatto instance = null;
        instance.setCognome(cognome);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
