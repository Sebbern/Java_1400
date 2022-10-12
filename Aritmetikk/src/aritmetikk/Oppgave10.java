package aritmetikk;

import javax.swing.*;

public class Oppgave10 {
    public static void main(String[] args){
        String innAlder = JOptionPane.showInputDialog("Skriv inn alder");
        int alder = Integer.parseInt(innAlder);

        if (alder < 18){
            System.out.print("Du er for ung til å ta førerkort for bil.");
        }
        else {
            System.out.print("Du kan ta førerkortet for bil da du er gammel nok");
        }
    }
}
