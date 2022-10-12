package ekstraoppgaver;

import javax.swing.*;

public class oppgave2 {
    public static void main(String[] args) {
        boolean i = true;
        double sum = 0;
        while (i){
            double vare = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris på solgt vare, 0 for å avslutte"));

            if(vare > 0){
                sum += vare;
            }

            else{
                System.out.println("Kommisjonen til salgspersonen er "+sum*0.09+" kr.");
                break;
            }
        }

    }
}
