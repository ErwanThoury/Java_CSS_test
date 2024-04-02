package sio.tp2;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

public class TP2Controller implements Initializable {

    @FXML
    private Button cmdExo1;
    @FXML
    private Button cmdExo2;
    @FXML
    private Button cmdExo3;
    @FXML
    private Button cmdExo4;
    @FXML
    private Label lblTitre;
    @FXML
    private AnchorPane apExo1;
    @FXML
    private AnchorPane apExo2;
    @FXML
    private AnchorPane apExo3;
    @FXML
    private AnchorPane apExo4;
    @FXML
    private TextField txtCote;
    @FXML
    private Button cmdCalculerAire;
    @FXML
    private Label lblAire;
    @FXML
    private TextField txtNb1;
    @FXML
    private TextField txtNb2;
    @FXML
    private Button cmdEchanger;
    @FXML
    private Label lblMessageExo2;
    @FXML
    private TextField txtIndice;
    @FXML
    private Label lblSalaire;
    @FXML
    private Button cmdCalculerSalaire;
    @FXML
    private TextField txtRayon;
    @FXML
    private Label lblPerimetre;
    @FXML
    private Button cmdCalculerPerimetre;

    DecimalFormat df;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        lblTitre.setText("TP2 / Exercice n°1");
        apExo1.toFront();
        df = new DecimalFormat("#.##");
    }
    @FXML
    public void cmdExo1Clicked(Event event) {
        lblTitre.setText("TP2 / Exercice n°1");
        apExo1.toFront();
    }

    @FXML
    public void cmdExo2Clicked(Event event) {
        lblTitre.setText("TP2 / Exercice n°2");
        apExo2.toFront();
    }

    @FXML
    public void cmdExo3Clicked(Event event) {
        lblTitre.setText("TP2 / Exercice n°3");
        apExo3.toFront();
    }

    @FXML
    public void cmdExo4Clicked(Event event) {
        lblTitre.setText("TP2 / Exercice n°4");
        apExo4.toFront();
    }

    @FXML
    public void cmdCalculerAireClicked(Event event) {
        if(txtCote.getText().equals(""))
        {
            lblAire.setText("Veuillez saisir la valeur du côté");
        }
        else
        {
            double cote = Double.parseDouble(txtCote.getText());
            double aire = cote * cote;
            lblAire.setText("L'aire est de : " + df.format(aire));
        }
    }

    @FXML
    public void cmdEchangerClicked(Event event) {

        if(txtNb1.getText().equals(""))
        {
            lblMessageExo2.setText("Veuillez saisir votre 1er nombre");
        }
        else if(txtNb2.getText().equals(""))
        {
            lblMessageExo2.setText( "Veuillez saisir votre 2ème nombre");
        }
        else
        {
            String temp = txtNb2.getText();
            txtNb2.setText(txtNb1.getText());
            txtNb1.setText(temp);
            lblMessageExo2.setText( "Echange effectué");
        }
    }

    @FXML
    public void cmdCalculerSalaireClicked(Event event) {
        if(txtIndice.getText().compareTo("")==0)
        {
            lblSalaire.setText("Veuillez saisir votre indice");
        }
        else
        {
            double salaireBrut = 2.3 * Integer.parseInt(txtIndice.getText());
            double montantRetenues = salaireBrut * 0.2;
            double salaireNet = salaireBrut - montantRetenues;

            lblSalaire.setText( "Salaire brut = " + df.format(salaireBrut) +
                    "\nRetenues = " + df.format(montantRetenues) +
                    "\nSalaire net = "+ df.format(salaireNet));
        }
    }

    @FXML
    public void cmdCalculerPerimetreClicked(Event event) {
        if(txtRayon.getText().compareTo("") == 0)
        {
            lblPerimetre.setText("Veuillez saisir votre rayon");
        }
        else
        {

            double peri = 2 * Math.PI * Double.parseDouble(txtRayon.getText());
            lblPerimetre.setText("Le périmètre est de : " + df.format(peri));
        }
    }
}