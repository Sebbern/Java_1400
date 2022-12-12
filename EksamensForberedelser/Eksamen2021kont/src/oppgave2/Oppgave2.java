package oppgave2;

import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args) {
        double vekt, høyde;

        while (true) {
            try {
                vekt = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn din vekt"));
                høyde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn din høyde"));
                break;
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Error: Et tall ble ikke skrevet i en av input-boksene, vennligst skriv et tall.");
            }
        }

        double BMI = (1.3*vekt)/Math.pow((høyde/100),2.5);
        JOptionPane.showMessageDialog(null,"Din BMI er "+BMI);
    }
}
