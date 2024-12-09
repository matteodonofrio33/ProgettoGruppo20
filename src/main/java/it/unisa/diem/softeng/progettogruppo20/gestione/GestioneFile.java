/**
 * @file GestioneFile.java
 * @brief si occupa di salvare ed importare la lista dei contatti
 *
 * @author Luigi Cocco
 * @date December 6, 2024
 * @version 1.0
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

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
            pw.print(listaContatti.toString());
        }

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
            if (s.nextLine() == null) {
                return lista;
            }

            s.useDelimiter("[;\n]");
            s.useLocale(Locale.US);

            while (s.hasNext()) {
                String nome = s.next();
                String cognome = s.next();
                String email = s.next();
                String telefono = s.next();
                lista.aggiungiContatto(nome, cognome, telefono, email);
            }
        }

        return lista;
    }

}
