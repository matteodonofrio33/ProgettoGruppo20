/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import java.io.File;
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
public class GestioneFileTest {
    
    public GestioneFileTest() {
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
     * Test of esporta method, of class GestioneFile.
     */
    @Test
    public void testEsporta() throws Exception {
        System.out.println("esporta");
        ListaContatti listaContatti = null;
        GestioneFile instance = null;
        instance.esporta(listaContatti);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of importa method, of class GestioneFile.
     */
    @Test
    public void testImporta() throws Exception {
        System.out.println("importa");
        File file = null;
        GestioneFile instance = null;
        ListaContatti expResult = null;
        ListaContatti result = instance.importa(file);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
