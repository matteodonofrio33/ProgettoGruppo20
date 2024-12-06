/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unisa.diem.softeng.progettogruppo20.gestione;

import it.unisa.diem.softeng.progettogruppo20.interfaccia.Gui;

/**
 * @file Rubrica.java
 * @brief Si occupa di salvare la lista dei contatti e richiamare il metodo
 * iniziale per avviare il programma.
 *
 * Questa classe contiene un attributo di tipo ListaContatti per contenere la
 * lista di tutti i contatti. Una lista di tipo ListaContatti che contiene solo
 * la lista che ci restituisce il metodo cercaContatto.
 *
 * @author Luigi Contaldo
 * @data December 06, 2024
 * @version 1.0
 */
public class Rubrica {

    private ListaContatti lista;
    private ListaContatti trovati;
    private Gui gui;

    /**
     * @brief Costruttore
     *
     * @param[in] lista Riferimento all'oggetto ListaContatti. Contiene tutti i
     * contatti della rubrica.
     *
     * @param[in] trovati Riferimento all'oggetto ListaContatti. Contiene tutti
     * i contatti restituiti dalla funzione cercaContatto().
     * @param[in] gui Riferimento all'oggetto Gui.
     *
     */
    public Rubrica(ListaContatti lista, ListaContatti trovati, Gui gui) {

        this.lista = lista;
        this.trovati = trovati;
        this.gui = gui;
    }

    /**
     * @brief Invoca tutti i metodi necessari per la visualizzazione della
     * rubrica.
     *
     * @pre La scena principale deve esistere e deve essere vuota.
     *
     * @post Invoca i metodi necessari per visualizzare correttamente tutta la
     * schermata della rubrica.
     */
    private void vista() {

    }

}
