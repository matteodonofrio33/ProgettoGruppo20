/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import java.io.File;
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

    /**
     * Test of importa method, of class GestioneFile.
     */
    @Test
    public void testImporta() throws Exception {

        File file = new File("Rubrica");
        GestioneFile gf = new GestioneFile("Rubrica");
        
        ListaContatti lista = new ListaContatti();
        
        lista.aggiungiContatto("Mario", "Bianchi", "123", "4", "5", "email1@gmail.com","email2@gmail.com", "email3@gmail.com");
        lista.aggiungiContatto("Luigi","Rossi","789","2","4","mail1@gmail.com","mail2@gmail.com","mail3@gmail.com");
        
        gf.esporta(lista);
        
        assertTrue(lista.equals(gf.importa(file)));
        
        assertEquals(2, lista.getElenco().size());
             
        file.delete();
    }
    
}
