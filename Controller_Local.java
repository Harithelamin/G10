import sample.Local;

import java.awt.*;
import java.util.ArrayList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class Controller_Local {

    Local local = new Local();

    @FXML
    private TextField Local_ID;


    @FXML
    private TextField Type;

    @FXML
    private TextField Number_of_seat;



  /*  @FXML
    void (ActionEvent event) {
        String resultat;

    }

    @FXML
    void leverInn(ActionEvent event) {
        String resultat;
        resultat = utleie.leverInn(txtFilmTittel.getText());
        lblOversikt.setText(resultat);
    }

    @FXML
    void visUtleie(ActionEvent event) {
        lblOversikt.setText(utleie.toString());
    }
    */
}
