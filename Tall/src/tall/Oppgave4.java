package tall;

import javax.swing.*;

public class Oppgave4 {
    public static void main(String [] args){
        String innTall1 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String innTall2 = JOptionPane.showInputDialog("Skriv inn et til desimaltall");
        String innTall3 = JOptionPane.showInputDialog("Skriv inn et siste desimaltall");
        double tall1, tall2, tall3;
        try{
            tall1 = Double.parseDouble(innTall1);
        }
        catch (Exception e){
            tall1 = 0;
        }

        try{
            tall2 = Double.parseDouble(innTall2);
        }
        catch (Exception e){
            tall2 = 0;
        }
        try{
            tall3 = Double.parseDouble(innTall3);
        }
        catch (Exception e){
            tall3 = 0;
        }
        double sum = (tall1+tall2+tall3)/3;

        JOptionPane.showMessageDialog(null,"Summen er "+sum);
        System.out.println("Summen er "+sum);
    }
}
