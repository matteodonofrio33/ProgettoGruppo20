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

    private Dato d;

    /**
     * Classe concreta per testare la classe astratta Dato.
     */
    private static class DatoConcreto extends Dato {
        // Classe vuota per implementare Dato senza aggiungere funzionalità.
    }

    /**
     * Test del costruttore.
     */
    @Test
    public void testDato() {
        //List<String> dati = new 
        //assertNotNull(dati, "La lista non dovrebbe essere null dopo l'inizializzazione");
        //assertTrue(dati.isEmpty(), "La lista dovrebbe essere vuota dopo l'inizializzazione");

    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
        d = new DatoConcreto();
    }

    @AfterEach
    public void tearDown() {
    }

    /**
     * Test del metodo contiene().
     */
    @Test
    public void testContiene() {
        d.aggiungiDato("dato_test1");
        d.aggiungiDato("dato_test2");
        d.aggiungiDato("dato_test3");

        assertTrue(d.contiene("dato_test1"));
        assertTrue(d.contiene("dato_test2"));
        assertTrue(d.contiene("dato_test3"));
    }

    /**
     * Test del metodo aggiungiDato().
     */
    @Test
    public void testAggiungiDato() {
        d.aggiungiDato("dato1");
        d.aggiungiDato("dato2");
        d.aggiungiDato("dato3");

        List<String> dati = d.getDati();

        assertEquals(3, dati.size(), "La lista contiene 3 dati");
        assertTrue(dati.contains("dato1"), "La lista contiene la stringa dato1");
        assertTrue(dati.contains("dato2"), "La lista contiene la stringa dato2");
        assertTrue(dati.contains("dato3"), "La lista contiene la stringa dato3");
    }

    /**
     * Test del metodo getDati().
     */
    @Test
    public void testGetDati() {
        d.aggiungiDato("elem1");
        d.aggiungiDato("elem2");

        List<String> dati = d.getDati();
        assertEquals(2, dati.size(), "La lista dovrebbe contenere 2 elementi");
        assertEquals("elem1", dati.get(0), "Il primo elemento dovrebbe essere 'elem1'");
        assertEquals("elem2", dati.get(1), "Il secondo elemento dovrebbe essere 'elem2'");
    }

}
