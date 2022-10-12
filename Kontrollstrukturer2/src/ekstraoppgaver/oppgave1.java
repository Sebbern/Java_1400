package ekstraoppgaver;

import javax.swing.*;

public class oppgave1 {
    public static void main(String[] args) {
        double lengdesum = 0;
        double bensinsum = 0;

        for (double lengde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn lengden")); lengde > 0; lengde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn en ny lengde, 0 for å avslutte"))){
            double bensin = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn hvor mye bensin som ble brukt"));
            lengdesum += lengde;
            bensinsum += bensin;
        }
        System.out.println(bensinsum/lengdesum+" liter bensin ble brukt per kilometer");
    }
}