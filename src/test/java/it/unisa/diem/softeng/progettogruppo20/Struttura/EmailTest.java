package it.unisa.diem.softeng.progettogruppo20.Struttura;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmailTest {
    
    @BeforeEach
    public void setUp() {
    }
    
    @Test
    public void testContiene() {
        Email e=new Email();
        e.aggiungiDato("dato1");
        e.aggiungiDato("dato2");
        e.aggiungiDato("dato3");
        
        assertTrue(e.contiene("dato1"));
        assertTrue(e.contiene("dato2"));
        assertTrue(e.contiene("dato3"));
    }
}
