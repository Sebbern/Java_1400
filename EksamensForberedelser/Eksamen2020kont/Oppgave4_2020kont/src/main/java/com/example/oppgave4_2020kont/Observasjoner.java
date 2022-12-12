package com.example.oppgave4_2020kont;

public class Observasjoner {
    private String dato;
    private double temperatur;
    private double nedbør;

    public Observasjoner(String dato, double temperatur, double nedbør) {
        this.dato = dato;
        this.temperatur = temperatur;
        this.nedbør = nedbør;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public double getTemperatur() {
        return temperatur;
    }

    public void setTempratur(double tempratur) {
        this.temperatur = tempratur;
    }

    public double getNedbør() {
        return nedbør;
    }

    public void setNedbør(double nedbør) {
        this.nedbør = nedbør;
    }
}