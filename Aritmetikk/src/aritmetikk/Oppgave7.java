package aritmetikk;

import javax.swing.*;

public class Oppgave7 {
    public static void main(String [] args){
        String innPizza = JOptionPane.showInputDialog("Skriv antall pizza");
        String innPersoner = JOptionPane.showInputDialog("Skriv antall personer");
        String innSlices = JOptionPane.showInputDialog("Skriv antall slices");

        int pizza = Integer.parseInt(innPizza);
        int personer = Integer.parseInt(innPersoner);
        int slices = Integer.parseInt(innSlices);

        System.out.print("Dersom man er "+personer+" personer og har "+pizza+" pizzaer får hver person "+(slices*pizza/personer)+" slices og "+((slices*pizza)%personer)+" blir til overs");
    }
}
