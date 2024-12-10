package it.unisa.diem.softeng.progettogruppo20;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import it.unisa.diem.softeng.progettogruppo20.gestione.ListaContatti;
import java.awt.Button;
import java.awt.TextField;
import java.io.IOException;
import java.net.URL;
import java.util.Collection;
import java.util.ResourceBundle;
import java.util.TreeSet;
import javafx.application.Platform;
import javafx.beans.binding.Bindings;
import javafx.beans.binding.BooleanBinding;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class PrimaryController implements Initializable {

    //dichiarazione bottoni presenti nell'interfaccia:
    @FXML
    private javafx.scene.control.TextField nomeTfd;

    @FXML
    private javafx.scene.control.TextField cognomeTfd;

    @FXML
    private javafx.scene.control.TextField telTfd1;

    @FXML
    private javafx.scene.control.TextField telTfd2;

    @FXML
    private javafx.scene.control.TextField telTfd3;

    @FXML
    private javafx.scene.control.TextField emailTfd1;

    @FXML
    private javafx.scene.control.TextField emailTfd2;

    @FXML
    private javafx.scene.control.TextField emailTfd3;//

    @FXML
    private javafx.scene.control.Button aggiungiBtn;

    @FXML
    private javafx.scene.control.Button rimuoviBtn;

    @FXML
    private javafx.scene.control.Button cercaBtn;

    @FXML
    private javafx.scene.control.Button modificaBtn;

    //dichiarazione tabella:
    @FXML
    private TableView<Contatto> tabellaContatti;

    //colonne per ogni campo del contatto:
    @FXML
    private TableColumn<Contatto, String> nomeClm;

    @FXML
    private TableColumn<Contatto, String> cognomeClm;

    @FXML
    private TableColumn<Contatto, String> tel1Clm;

    @FXML
    private TableColumn<Contatto, String> tel2Clm;

    @FXML
    private TableColumn<Contatto, String> tel3Clm; //columnEmail1

    @FXML
    private TableColumn<Contatto, String> email1Clm;

    @FXML
    private TableColumn<Contatto, String> email2Clm;

    @FXML
    private TableColumn<Contatto, String> email3Clm;

    //lista osservabile
    private ListaContatti listaContatti;
    private ObservableList<Contatto> contatti;

    /* private void switchToSecondary() throws IOException {
        App.setRoot("secondary");
    }*/
    @Override
    public void initialize(URL url, ResourceBundle rb) {

        listaContatti = new ListaContatti();
        contatti = FXCollections.observableArrayList();
        nomeClm.setCellValueFactory(s -> new SimpleStringProperty(s.getValue().getNome()));
        cognomeClm.setCellValueFactory(s -> new SimpleStringProperty(s.getValue().getCognome()));
        tel1Clm.setCellValueFactory(s -> new SimpleStringProperty(s.getValue().getTel().getDati().get(0)));
        tel2Clm.setCellValueFactory(s -> new SimpleStringProperty(s.getValue().getTel().getDati().get(1)));
        tel3Clm.setCellValueFactory(s -> new SimpleStringProperty(s.getValue().getTel().getDati().get(2)));

        email1Clm.setCellValueFactory(s -> new SimpleStringProperty(s.getValue().getEmail().getDati().get(0)));
        email2Clm.setCellValueFactory(s -> new SimpleStringProperty(s.getValue().getEmail().getDati().get(1)));
        email3Clm.setCellValueFactory(s -> new SimpleStringProperty(s.getValue().getEmail().getDati().get(2)));

        tabellaContatti.setItems(contatti);
        controllerBottoneAggiungi();
    }

    private void aggiornamentoTableView() {
        contatti.setAll(listaContatti.getElenco());
    }

    private void controllerBottoneAggiungi(){
        BooleanBinding cond1 = Bindings.isEmpty(nomeTfd.textProperty());
        BooleanBinding cond2 = Bindings.isEmpty(cognomeTfd.textProperty());
        aggiungiBtn.disableProperty().bind(Bindings.and(cond1, cond2));
    }
    
    @FXML
    private void modificaContatto(ActionEvent event) {
    }

    @FXML
    private void cercaContatto(ActionEvent event) {
    }


    @FXML
    private void addContact() {
        listaContatti.aggiungiContatto(nomeTfd.getText(), cognomeTfd.getText(), telTfd1.getText(), telTfd2.getText(), telTfd3.getText(), emailTfd1.getText(), emailTfd2.getText(), emailTfd3.getText());
        aggiornamentoTableView();
        puliziaCampi();
    }

    private void puliziaCampi() {

        nomeTfd.clear();
        cognomeTfd.clear();
        telTfd1.clear();
        telTfd2.clear();
        telTfd3.clear();
        emailTfd1.clear();
        emailTfd2.clear();
        emailTfd3.clear();

    }

    @FXML
    private void rimozioneContatto() {

        Contatto selezione = tabellaContatti.getSelectionModel().getSelectedItem();

        if (selezione != null) {
            listaContatti.getElenco().remove(selezione);
            aggiornamentoTableView();

        }
    }

    @FXML
    private void chiusuraProgramma() {
        Platform.exit();
    }
    
    

}
