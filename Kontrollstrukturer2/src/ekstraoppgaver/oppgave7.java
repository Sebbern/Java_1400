package ekstraoppgaver;

import javax.swing.*;

public class oppgave7 {
    public static void main(String[] args) {
        String stjerner = "";

        for (int i = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall stjerner i grunnflate")); i > 0; i--){
            stjerner += "X";
            System.out.println(stjerner);
        }
    }
}
