package oppgaver;

import javax.swing.*;

public class oppgave8 {
    public static void main(String[] args) {
        int input = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall poengsummer"));
        int[] liste = new int[input];
        for (int i=0; i<liste.length; i++){
            while (true) {
                try {
                    liste[i] = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn en poengsum mellom 0 og 100"));
                    if (liste[i] < 0 || liste[i] > 100) {
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null,"Den gitte poengsummen er ikke mellom 0 og 100.\nPrøv igjen");
                }
            }
        }
        double sum = 0;
        for (int i : liste) {
            sum += i;
        }
        System.out.println("Poengsummens gjennomsnitt er "+(sum/liste.length));
    }
}