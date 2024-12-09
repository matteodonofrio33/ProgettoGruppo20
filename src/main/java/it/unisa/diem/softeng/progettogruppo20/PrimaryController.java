package it.unisa.diem.softeng.progettogruppo20;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import java.awt.Button;
import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrimaryController implements Initializable{
    
    
    
    //dichiarazione bottoni presenti nell'interfaccia:
    @FXML
    private TextField nomeTfd;
    
    @FXML
    private TextField cognomeTfd;
    
    @FXML
    private TextField telefonoTfd1;
    
    @FXML
    private TextField telefonoTfd2;
    
    @FXML
    private TextField telefonoTfd3;
    
    @FXML
    private TextField emailTfd1;
    
    @FXML
    private TextField emailTfd2;
    
    @FXML
    private TextField emailTfd3;
    
    @FXML
    private Button aggiungiBtn;
    
    @FXML
    private Button rimuoviBtn;
    
     @FXML
    private Button cercaBtn;
     
    //dichiarazione tabella:
    @FXML
    private TableView<Contatto> tabellaContatti;
    
    //colonne per ogni campo del contatto:
    
    @FXML
    private TableColumn<Contatto, String> nomeClm;
    
    @FXML
    private TableColumn<Contatto, String> cognomeClm;
    
     @FXML
    private TableColumn<Contatto, String> telefonoClm;
    
    //lista osservabile
    
    private ObservableList<Contatto> contatti;
    
    
    
    
    

    @FXML
    private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        contatti = FXCollections.observableArrayList();
       
    }
    
    
    
    
    
    
}
