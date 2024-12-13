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

    private ListaContatti lista;

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
        lista = new ListaContatti();

    }

    @AfterEach
    public void tearDown() {
        lista.getElenco().clear();

    }

    /**
     * Test of aggiungiContatto method, of class ListaContatti.
     */
    @Test
    public void testAggiungiContatto() {
        lista = new ListaContatti();
        lista.aggiungiContatto("Luigi", "Cocco", "1234", "4567", "7890", "luigi@gmail.com", "cocco@gmail.com", "luigicocco@gmail.com");

        Contatto c = new Contatto("Luigi", "Cocco", "1234", "4567", "7890", "luigi@gmail.com", "cocco@gmail.com", "luigicocco@gmail.com");

        assertTrue(lista.getElenco().contains(c));
    }

    /**
     * Test of cercaContatto method, of class ListaContatti.
     */
    @Test
    public void testCercaContatto() {
        lista = new ListaContatti();
        lista.aggiungiContatto("Fabrizio", "D'Errico", "1756", "9879", "1111", "fabrizio@gmail.com", "derrico@gmail.com", "fabder@gmail.com");

        Contatto c = new Contatto("Fabrizio", "D'Errico", "1756", "9879", "1111", "fabrizio@gmail.com", "derrico@gmail.com", "fabder@gmail.com");

        assertTrue(lista.cercaContatto("Fab", "D").getElenco().contains(c));
    }

    /**
     * Test of rimuoviContatto method, of class ListaContatti.
     */
    @Test
    public void testRimuoviContatto() {
        lista = new ListaContatti();
        Contatto c = new Contatto("Fabrizio", "D'Errico", "1756", "9879", "1111", "fabrizio@gmail.com", "derrico@gmail.com", "fabder@gmail.com");

        lista.rimuoviContatto(c);

        assertFalse(lista.cercaContatto("Fab", "D").getElenco().contains(c));
    }

    /**
     * Test of modificaContatto method, of class ListaContatti.
     */
    @Test
    public void testModificaContatto() {

        lista = new ListaContatti();
        Contatto c = new Contatto("Fabrizio", "D'Errico", "175655555", "988145879", "111111111", "fabrizio@gmail.com", "derrico@gmail.com", "fabder@gmail.com");

        lista.aggiungiContatto("Fabrizio", "D'Errico", "175655555", "988145879", "111111111", "fabrizio@gmail.com", "derrico@gmail.com", "fabder@gmail.com");

        assertTrue(lista.modificaContatto(c, "Matteo", "D'Onofrio", "124675009", "", "", "matteo@gmail.com", "", ""));

    }

    /**
     * Test of getElenco method, of class ListaContatti.
     */
    @Test
    public void testGetElenco() {

    }

    /**
     * Test of eliminaRubrica method, of class ListaContatti.
     */
    @Test
    public void testEliminaRubrica() {
        lista = new ListaContatti();
        lista.aggiungiContatto("Luigi", "Cocco", "1234", "4567", "7890", "luigi@gmail.com", "cocco@gmail.com", "luigicocco@gmail.com");

        lista.eliminaRubrica();
        assertNull(lista);
    }
}
