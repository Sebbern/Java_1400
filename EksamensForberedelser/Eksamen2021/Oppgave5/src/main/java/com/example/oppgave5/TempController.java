package com.example.oppgave5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class TempController {
    public ArrayList<Double> temperaturer = new ArrayList<>() ;

    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtTemperatur;

    @FXML
    void nullstill(ActionEvent event) {
        temperaturer.clear();
        txtTemperatur.setText("");
        lblResultat.setText("Temperaturlisten er nullstilt");
    }

    @FXML
    void registrer(ActionEvent event) {
        double tempSum, gjennomsnitt;
        String tekst;


        tekst = txtTemperatur.getText();
        txtTemperatur.setText("");

        try {
            temperaturer.add(Double.parseDouble(tekst));
            tempSum = 0;
            for (double i: temperaturer){
                tempSum += i;
            }
            gjennomsnitt = tempSum/temperaturer.size();
            String ut = String.valueOf(gjennomsnitt);
            lblResultat.setText(ut);
        } catch (Exception e) {
            lblResultat.setText("Error: Du skrev ikke inn et tall, vennligst skriv inn et tall");
        }
    }
}