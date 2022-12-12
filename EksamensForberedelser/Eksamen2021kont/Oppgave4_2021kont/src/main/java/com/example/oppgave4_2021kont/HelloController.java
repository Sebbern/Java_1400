package com.example.oppgave4_2021kont;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class HelloController {
    List<Double> register = new ArrayList<>();

    @FXML
    private TextField txtTemperatur;

    @FXML
    private Label lblMin;

    @FXML
    private Label lblMaks;

    @FXML
    private Label lblGjennomsnitt;

    @FXML
    private Label lblFeil;

    @FXML
    void nullstill(ActionEvent event) {
        register.clear();
        lblMin.setText("");
        lblMaks.setText("");
        lblGjennomsnitt.setText("");
        lblFeil.setText("");
        txtTemperatur.setText("");
    }

    @FXML
    void registrer(ActionEvent event) {
        boolean sjekk = false;
        double sum = 0;

        try {
            register.add(Double.parseDouble(txtTemperatur.getText()));
            register.sort(Comparator.naturalOrder());
            lblMin.setText(String.valueOf(register.get(0)));
            lblMaks.setText(String.valueOf(register.get(register.size()-1)));

            for (double i : register) {
                sum += i;
            }
            lblGjennomsnitt.setText(String.valueOf(sum / register.size()));
        }
        catch(Exception e){
            lblMaks.setText("Error: Du skrev ikke inn ett tall, vennligst skriv inn ett tall.");
        }
    }
}

