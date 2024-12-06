/**
 * @file GestioneFile.java
 * @brief si occupa di salvare ed importare la lista dei contatti
 * 
 * @author Luigi Cocco
 * @date December 6, 2024
 * @version 1.0
 */

package it.unisa.diem.softeng.progettogruppo20.gestione;

/**
 *
 * @author luigicocco
 */
import it.unisa.diem.softeng.progettogruppo20.gestione.ListaContatti;


public class GestioneFile {
    
    private String fileName;
    
    public GestioneFile(String fileName){
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
    public void esporta(ListaContatti listaContatti){
        
    }
    
    /**
     * @brief importa dal file denominato filename la listaContatti
     * @pre il file denominato filename non dev'essere vuoto
     * @post si otterrà un oggetto di ListaContatti
     * @return ritorna un oggetto di ListaContatti
     */
    public ListaContatti importa(){
        
        return null;
    }
    
    
    
}
