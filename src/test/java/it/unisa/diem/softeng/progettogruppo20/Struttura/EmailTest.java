package it.unisa.diem.softeng.progettogruppo20.Struttura;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {

    /**
     * Test of aggiungiDato method, of class Email.
     */
    @Test
    public void testAggiungiDato() {
        Email e = new Email();
        e.aggiungiDato("tonystark@gmail.com");
        e.aggiungiDato("christialbale@gmail.com");
        e.aggiungiDato("capitanamerica.com");

        assertEquals(true, e.contiene("tonystark@gmail.com"));
        assertEquals(true, e.contiene("christialbale@gmail.com"));
        assertEquals(false, e.contiene("capitanamerica.com")); 

    }
}
