package com.example.oppgave4_2020kont;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    ArrayList<Observasjoner> reg = new ArrayList<>();
    Observasjoner testvær;
    // legg inn en ArrayList kalt register her (av type Observasjoner)
    @FXML
    private Label lblSnittRegn;
    @FXML
    private Label lblSnittTemp;
    @FXML
    private TextField txtDato;
    @FXML
    private TextField txtTemp;
    @FXML
    private TextField txtRegn;
    @FXML
    void btnRegistrerVær(ActionEvent event) {
        testvær = new Observasjoner(txtDato.getText(),Double.parseDouble(txtTemp.getText()),Double.parseDouble(txtRegn.getText()));
        reg.add(testvær);
    }
    @FXML
    void btnSnittRegn(ActionEvent event) {
        double sum = 0;
        for (Observasjoner i: reg){
            sum += i.getNedbør();
        }
        lblSnittRegn.setText(String.valueOf(sum/reg.size()));
    }
    @FXML
    void btnSnittTemperatur(ActionEvent event) {
        double sum = 0;
        for (Observasjoner i: reg){
            sum += i.getTemperatur();
        }
        lblSnittTemp.setText(String.valueOf(sum/reg.size()));
    }
    @FXML
    void btnSlettRegister(ActionEvent event) {
        reg.clear();
    }
}