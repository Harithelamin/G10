package Registration.Controller;

import Registration.Programlogic.Local;
import Registration.Programlogic.RegisterLocal;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.Separator;
import javafx.scene.control.TextField;



public class Controller_Local {


    public RegisterLocal reg = new RegisterLocal();


    @FXML
    private Label Label_Local;

    @FXML
    private TextField txtLocal_id;

    @FXML
    private ChoiceBox input_type;

    @FXML
    private ChoiceBox input_number_of_seat;

    @FXML
    private Label lbl_showdata;

    @FXML
    public void initialize(){
        input_type.setItems(FXCollections.observableArrayList(
                "movie theatre", "concert hall ",
                "theatre","presentation hall")
        );

        input_number_of_seat.setItems(FXCollections.observableArrayList(
                "35", "45",
                "50", "60")
        );

    }


    @FXML
    void register_local(ActionEvent event) {

        if (!txtLocal_id.getText().isEmpty() && !input_type.getValue().toString().isEmpty()
                && !input_number_of_seat.getValue().toString().isEmpty()) {

            reg.register_local(txtLocal_id.getText(), input_type.getValue().toString(),
                    Integer.parseInt(input_number_of_seat.getValue().toString()));
            lbl_showdata.setText(reg.show_all_locals());

        }

    }


    //if(){}
    //if(){}
    //if(){}
    //if(){}


  }


