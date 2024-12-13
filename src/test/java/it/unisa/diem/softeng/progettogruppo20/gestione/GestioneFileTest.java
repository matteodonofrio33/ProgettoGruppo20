/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
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
public class GestioneFileTest {
    
    private GestioneFile gf;
    private ListaContatti lc;
    private static final String fileTest= "fileTest.csv";
    
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
        lc= new ListaContatti();
        gf= new GestioneFile(fileTest);
        
        lc.aggiungiContatto("Fabrizio", "D'Errico", "1234", "4567", "7890",
                "fabrizio@gmail.com", "derrico@gmail.com", "fabderr@gmail.com");
        lc.aggiungiContatto("Luigi", "Cocco", "0987", "7654", "4321",
                "luigi@gmail.com", "cocco@gmail.com", "luicocco@gmail.com");
    }
    
    @AfterEach
    public void tearDown() {
       //Files.deleteIfExists(Path.of(fileTest));
    }

    /**
     * Test of esporta method, of class GestioneFile.
     */
    @Test
    public void testEsporta() throws Exception {
        gf.esporta(lc);
        File fileProva= new File (fileTest);
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
