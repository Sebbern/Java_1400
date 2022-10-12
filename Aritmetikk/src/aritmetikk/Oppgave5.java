package aritmetikk;

import javax.swing.*;

public class Oppgave5 {
    public static void main(String [] args){
        String innFahrenheit = JOptionPane.showInputDialog("Skriv inn Fahrenheit");
        double Fahrenheit = Double.parseDouble(innFahrenheit);
        double Celsius = (Fahrenheit-32)/1.8;
        System.out.print(Celsius);
    }
}
