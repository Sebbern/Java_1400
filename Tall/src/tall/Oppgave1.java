package tall;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String [] args){
        String innTall = JOptionPane.showInputDialog("Skriv inn din alder");
        int tall1 = Integer.parseInt(innTall);
        JOptionPane.showMessageDialog(null,"Min alder er "+tall1+" år.");

    }
}
