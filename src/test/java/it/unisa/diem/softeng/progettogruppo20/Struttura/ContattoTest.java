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

        assertEquals(nome, c.getNome());
        assertEquals(cognome, c.getCognome());

        assertEquals(tel1, c.getTel().getDati().get(0));
        assertEquals(tel2, c.getTel().getDati().get(1));
        assertEquals(tel3, c.getTel().getDati().get(2));

        assertEquals(email1, c.getEmail().getDati().get(0));
        assertEquals(email2, c.getEmail().getDati().get(1));
        assertEquals(email3, c.getEmail().getDati().get(2));

    }

    /**
     * Test of compareTo method, of class Contatto.
     */
    @Test
    public void testCompareTo() {

        String nome = "Mario";
        String cognome = "Bianchi";

        String tel1 = "123";
        String tel2 = "456";
        String tel3 = "789";

        String email1 = "email1@gmail.com";
        String email2 = "email2@gmail.com";
        String email3 = "email3@gmail.com";

        Contatto c1 = new Contatto(nome, cognome, tel1, tel2, tel3, email1, email2, email3);

        String nome1 = "Maria";
        String cognome1 = "Abate";

        String telef1 = "1";
        String telef2 = "4";
        String telef3 = "7";

        String mail1 = "mail1@gmail.com";
        String mail2 = "mail2@gmail.com";
        String mail3 = "mail3@gmail.com";

        Contatto c2 = new Contatto(nome1, cognome1, telef1, telef2, telef3, mail1, mail2, mail3);

        assertEquals(1, c1.compareTo(c2));

    }

    /**
     * Test of equals method, of class Contatto.
     */
    @Test
    public void testEquals() {

        String nome = "Mario";
        String cognome = "Bianchi";

        String tel1 = "123";
        String tel2 = "456";
        String tel3 = "789";

        String email1 = "email1@gmail.com";
        String email2 = "email2@gmail.com";
        String email3 = "email3@gmail.com";

        Contatto c1 = new Contatto(nome, cognome, tel1, tel2, tel3, email1, email2, email3);

        String nome1 = "Mario";
        String cognome1 = "Bianchi";

        String telef1 = "17685";
        String telef2 = "34564";
        String telef3 = "796";

        String mail1 = "1mail@gmail.com";
        String mail2 = "2mail@gmail.com";
        String mail3 = "3mail@gmail.com";

        Contatto c2 = new Contatto(nome1, cognome1, telef1, telef2, telef3, mail1, mail2, mail3);
        
        assertTrue(c1.equals(c2));
    }
    
     /**
     * Test of setNome method, of class Contatto.
     */
    @Test
    public void testSetNome() {
        String nome = "Christian";
        Contatto contatto = new Contatto("", "", "", "", "", "", "", "");
        contatto.setNome(nome);
        assertEquals(nome, contatto.getNome());
    }

    /**
     * Test of setCognome method, of class Contatto.
     */
    @Test
    public void testSetCognome() {

        String cognome = "Bale";
        Contatto contatto = new Contatto("", "", "", "", "", "", "", "");
        contatto.setCognome(cognome);
        assertEquals(cognome, contatto.getCognome());
        
    }

    



}


 

   

  

   


