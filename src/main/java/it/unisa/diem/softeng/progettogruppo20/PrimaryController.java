package it.unisa.diem.softeng.progettogruppo20;

import it.unisa.diem.softeng.progettogruppo20.Struttura.Contatto;
import it.unisa.diem.softeng.progettogruppo20.gestione.GestioneFile;
import it.unisa.diem.softeng.progettogruppo20.gestione.ListaContatti;
import java.awt.Button;
import java.awt.TextField;
import java.io.File;
import java.io.FileNotFoundException;
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
import javafx.stage.FileChooser;
import javafx.stage.Stage;

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
    // private ObservableList<Contatto> listaFiltrata;


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

    private void controllerBottoneAggiungi() {
        BooleanBinding cond1 = Bindings.isEmpty(nomeTfd.textProperty());
        BooleanBinding cond2 = Bindings.isEmpty(cognomeTfd.textProperty());
        aggiungiBtn.disableProperty().bind(Bindings.and(cond1, cond2));
    }

    @FXML
    private void modContatto(ActionEvent event) {

        Contatto selezione = tabellaContatti.getSelectionModel().getSelectedItem();

        nomeTfd.textProperty().set(selezione.getNome());
        cognomeTfd.textProperty().set(selezione.getCognome());

        telTfd1.textProperty().set(selezione.getTel().getDati().get(0));
        telTfd2.textProperty().set(selezione.getTel().getDati().get(1));
        telTfd3.textProperty().set(selezione.getTel().getDati().get(2));

        emailTfd1.textProperty().set(selezione.getEmail().getDati().get(0));
        emailTfd2.textProperty().set(selezione.getEmail().getDati().get(1));
        emailTfd3.textProperty().set(selezione.getEmail().getDati().get(2));

    }

    @FXML
    private void confermaModifica() {

        Contatto selezione = tabellaContatti.getSelectionModel().getSelectedItem();

        listaContatti.modificaContatto(selezione, nomeTfd.getText(), cognomeTfd.getText(), telTfd1.getText(), telTfd2.getText(), telTfd3.getText(), emailTfd1.getText(), emailTfd2.getText(), emailTfd3.getText());
        aggiornamentoTableView();

        puliziaCampi();
    }

    @FXML
    private void cercaContatto(ActionEvent event) {
        String nome = nomeTfd.getText();
        String cognome = cognomeTfd.getText();
        ListaContatti listaCercata = new ListaContatti();
        listaCercata = listaContatti.cercaContatto(nome, cognome);
        System.out.println("HO CERCATO: " + listaCercata);

        contatti.setAll(listaCercata.getElenco());
        // contatti= FXCollections.observableArrayList();
        // tabellaContatti.setItems(contatti);
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
            listaContatti.rimuoviContatto(selezione);
            aggiornamentoTableView();

        }
    }

    @FXML
    private void apriFileCSV() throws FileNotFoundException, IOException {
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("File CSV", "*.csv"));
        fileChooser.setTitle("Apri File CSV");
        File file = fileChooser.showOpenDialog(new Stage());
        if (file.exists()) {
            System.out.println("Il file esiste\n");
            String nome = file.getName();
            GestioneFile gf = new GestioneFile(nome);
            listaContatti.eliminaRubrica();
            listaContatti = gf.importa();
            tabellaContatti.getItems().clear();
            aggiornamentoTableView();
            
        }

    }

    private boolean fileNullo(File file) {
        return file == null;
    }

    @FXML
    private void chiusuraProgramma() {
        Platform.exit();
    }

    @FXML
    private void salvaFileCSV() throws IOException {
        // Crea il file chooser per selezionare il percorso di salvataggio
        FileChooser fileChooser = new FileChooser();
        fileChooser.getExtensionFilters().add(new FileChooser.ExtensionFilter("File CSV", "*.csv"));
        fileChooser.setTitle("Salva il file");

        // Mostra la finestra di salvataggio e ottieni il file selezionato
        File file = fileChooser.showSaveDialog(new Stage());

        // Verifica che il file non sia null
        if (file != null) {
            // Crea l'oggetto GestioneFile passando il percorso del file
            GestioneFile gf = new GestioneFile(file.getAbsolutePath());

            // Esporta i dati della listaContatti nel file CSV
            gf.esporta(listaContatti);
            System.out.println("ESPORTAZIONE RIUSCITA");
        } else {
            System.out.println("File non selezionato");
        }
    }

}
