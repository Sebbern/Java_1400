package tall;

import javax.swing.*;

public class Oppgave2 {
    public static void main(String [] args){
        String innTall1 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String innTall2 = JOptionPane.showInputDialog("Skriv inn et til desimaltall");
        String innTall3 = JOptionPane.showInputDialog("Skriv inn et siste desimaltall");
        double tall1 = Double.parseDouble(innTall1);
        double tall2 = Double.parseDouble(innTall2);
        double tall3 = Double.parseDouble(innTall3);

        double sum = tall1+tall2+tall3;
        System.out.println("Summen er "+sum);
    }
}
