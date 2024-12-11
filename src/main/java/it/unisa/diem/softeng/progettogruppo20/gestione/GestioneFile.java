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
    public ListaContatti importa() throws FileNotFoundException {
        ListaContatti lista = new ListaContatti();

        try (Scanner s = new Scanner(new BufferedReader(new FileReader(this.fileName)))) {
            s.useDelimiter("[;\n]");
            s.useLocale(Locale.US);

            while (s.hasNextLine()) {
                String line = s.nextLine().trim();

                // Salta righe vuote o di sola spaziatura
                if (line.isEmpty()) {
                    continue;
                }

                String[] dati = line.split(";");
                if (dati.length < 2) { // Minimo nome e cognome
                    System.err.println("Riga malformata: " + line);
                    continue;
                }

                String nome = dati[0];
                String cognome = dati[1];
                String telefono1 = (dati.length > 2) ? dati[2] : "";
                String telefono2 = (dati.length > 3) ? dati[3] : "";
                String telefono3 = (dati.length > 4) ? dati[4] : "";
                String email1 = (dati.length > 5) ? dati[5] : "";
                String email2 = (dati.length > 6) ? dati[6] : "";
                String email3 = (dati.length > 7) ? dati[7] : "";

                lista.aggiungiContatto(nome, cognome, telefono1, telefono2, telefono3, email1, email2, email3);
            }
        } catch (FileNotFoundException e) {
            throw e; // Rilancia l'eccezione
        } catch (Exception e) {
            System.err.println("Errore durante l'importazione: " + e.getMessage());
        }

        return lista;
    }

}
