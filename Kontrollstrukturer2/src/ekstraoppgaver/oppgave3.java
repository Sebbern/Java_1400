package ekstraoppgaver;

import javax.swing.*;

public class oppgave3 {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++){
            String navn = JOptionPane.showInputDialog("Skriv inn navnet på personen");
            double formue = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn personens formue"));

            if (formue < 500000){
                formue = formue*0.7;
            }
            else {
                formue = formue*0.5;
            }

            System.out.println(navn+", "+formue+" kr");
        }
    }
}
