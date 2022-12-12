package com.example.oppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class ForbrenningController {
    @FXML
    private ToggleGroup Kjonn; // Mann, Kvinne
    @FXML
    private TextField txtAlder;
    @FXML
    private TextField txtVekt;
    @FXML
    private TextField txtHoyde;
    @FXML
    private Label lblResultat;

    @FXML
    void btnBeregn(ActionEvent event) {
        RadioButton test;
        String kjonn = "";
        double sum = 0;

        try{
            test = (RadioButton) Kjonn.getSelectedToggle();
            kjonn = test.getText();
        }
        catch (Exception e) {
            lblResultat.setText("Du valgte hverken mann eller kvinne, vennligst velg ett kjønn");
        }

        try{
            if (kjonn.equals("Mann")){
                sum += (10*Integer.parseInt(txtVekt.getText())+6.25*Integer.parseInt(txtHoyde.getText())-5*Integer.parseInt(txtAlder.getText())+5)*1.5;
            }
            else if (kjonn.equals("Kvinne")){
                sum += (10*Integer.parseInt(txtVekt.getText())+6.25*Integer.parseInt(txtHoyde.getText())-5*Integer.parseInt(txtAlder.getText())-161*1.5);
            }
        }
        catch (Exception e){
            lblResultat.setText("Et eller flere av feltene inneholder feil, vennligst skriv ett tall i hver av tekstfeltene.");
        }
        lblResultat.setText(String.valueOf(sum));
    }
}