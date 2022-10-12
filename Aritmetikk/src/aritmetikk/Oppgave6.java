package aritmetikk;

import javax.swing.*;

public class Oppgave6 {
    public static void main(String [] args){
        String innPenger = JOptionPane.showInputDialog("Skriv inn beløpet");
        double penger = Double.parseDouble(innPenger);
        double nok = penger * 10.09;

        System.out.print(String.format("%.2f", nok)+" norske kroner.");
    }
}
