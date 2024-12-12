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
    
    @Test
    public void testContatto() {
        
        String nome = "Mario";
        String cognome = "Bianchi";
        
        String tel1 = "123";
        String tel2 = "456";
        String tel3 = "789";
        
        String email1 = "email1@gmail.com";
        String email2 = "email2@gmail.com";
        String email3 = "email3@gmail.com";
        
        Contatto c = new Contatto(nome, cognome, tel1, tel2, tel3, email1, email2, email3);
        
        assertEquals(nome,c.getNome());
        assertEquals(cognome,c.getCognome());
        
        assertEquals(tel1,c.getTel().getDati().get(0));
        assertEquals(tel2,c.getTel().getDati().get(1));
        assertEquals(tel3,c.getTel().getDati().get(2));
        
        assertEquals(email1,c.getEmail().getDati().get(0));
        assertEquals(email2,c.getEmail().getDati().get(1));
        assertEquals(email3,c.getEmail().getDati().get(2));
         
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
