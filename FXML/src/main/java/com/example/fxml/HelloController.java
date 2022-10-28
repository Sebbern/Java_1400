package com.example.fxml;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label lblMemes;

    @FXML
    private Label lblMemesto;

    int count = 0;
    @FXML
    void btnMemes(ActionEvent event) {
        if (count == 0){
            lblMemes.setText("Hvorfor trykker du ikke?");
            count++;
        }
        else if (count == 1){
            lblMemesto.setText("Jeg ser du sliter med å trykke");
        }


    }
}