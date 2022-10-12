package aritmetikk;

import javax.swing.*;

public class Oppgave3 {
    public static void main(String [] args){
        String innBredde = JOptionPane.showInputDialog("Skriv inn bredden");
        String innLengde = JOptionPane.showInputDialog("Skriv inn lengden");
        double bredde = Double.parseDouble(innBredde);
        double lengde = Double.parseDouble(innLengde);

        System.out.print("Et rektangel med bredde "+bredde+" cm og lengde "+lengde+" cm har et areal på "+(bredde*lengde)+" cm^2.");
    }
}
