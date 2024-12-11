/**
 * @file GestioneFile.java
 * @brief si occupa di salvare ed importare la lista dei contatti
 *
 * @author Luigi Cocco
 * @date December 6, 2024
 * @version 1.0
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import it.unisa.diem.softeng.progettogruppo20.gestione.ListaContatti;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Locale;
import java.util.Scanner;

public class GestioneFile {

    private String fileName;

    public GestioneFile(String fileName) {
        this.fileName = fileName;

    }

    /**
     * @brief salva la lista dei contatti in un file
     * @pre listaContatti non dev'essere vuota
     * @post viene creato il file(con nome filename) contente la listaContatti
     * @invariant la lista non viene modificata
     *
     * @param[in] listaContatti è la lista che dev'essere salvata nel file
     */
    public void esporta(ListaContatti listaContatti) throws IOException {

        try (PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(this.fileName)))) {
            // Scrive l'intestazione del CSV
            pw.println("NOME;COGNOME;TELEFONO1;TELEFONO2;TELEFONO3;EMAIL1;EMAIL2;EMAIL3");

            for (Contatto c : listaContatti.getElenco()) {
                pw.print(c.getNome());
                pw.append(';');
                pw.print(c.getCognome());
                pw.append(';');
                pw.print(c.getTel().getDati().get(0));
                pw.append(';');
                pw.print(c.getTel().getDati().get(1));
                pw.append(';');
                pw.print(c.getTel().getDati().get(2));
                pw.append(';');
                pw.print(c.getEmail().getDati().get(0));
                pw.append(';');
                pw.print(c.getEmail().getDati().get(1));
                pw.append(';');
                pw.print(c.getEmail().getDati().get(2));
                pw.append('\n');
            }
        }
        System.out.println("ESPORTAZIONE RIUSCITA IN GESTIONE FILE");
    }

    /**
     * @brief importa dal file denominato filename la listaContatti
     * @pre il file denominato filename non dev'essere vuoto
     * @post si otterrà un oggetto di ListaContatti
     * @return ritorna un oggetto di ListaContatti
     */
    public ListaContatti importa() throws IOException {
        
        String nomi=this.fileName.split("[.]")[0];
        
        ListaContatti nr=new ListaContatti();
        
        try(Scanner s=new Scanner(new BufferedReader(new FileReader(this.fileName)))) {
            if(s.nextLine()==null) return nr;
            
            s.useDelimiter("[;\n]");
            s.useLocale(Locale.US);

            while (s.hasNext()) {
                String nome = s.next();
                String cognome = s.next();
                String telefono1 = s.next();
                String telefono2 = s.next();
                String telefono3 = s.next();
                String email1 = s.next();
                String email2 = s.next();
                String email3 = s.next();
                nr.aggiungiContatto(nome, cognome, telefono1, telefono2, telefono3, email1, email2, email3);
            }
        }
        
        return nr;
        
    }

}
