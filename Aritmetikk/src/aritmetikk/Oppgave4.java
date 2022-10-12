package aritmetikk;

import javax.swing.*;

public class Oppgave4 {
    public static void main(String [] args){
        String innRadius = JOptionPane.showInputDialog("Skriv inn radius");
        double radius = Double.parseDouble(innRadius);
        double omkrets = (2*3.14*radius);

        System.out.print("Omkretsen av en sirkel med "+radius+" cm som radius blir "+String.format("%.2f", omkrets)+" cm.");
    }
}
