package oppgaver;

import javax.swing.*;

public class Oppgave6 {
    public static void main(String[] args) {
        int[][] liste;
        while(true) {
            try {
                liste = new int[Integer.parseInt(JOptionPane.showInputDialog("Skriv antall anmeldere, minst 0 og maks 9"))][Integer.parseInt(JOptionPane.showInputDialog("Skriv antall filmer, minst 0 og maks 9"))];
                if (liste.length > 9) {
                    throw new Exception();
                }
                if (liste[0].length > 9){
                    throw new Exception();
                }
                break;
            }
            catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Skriv et tall mellom 0 og 9");
            }
        }

        for (int i=0; i< liste.length; i++) {
            for (int j = 0; j < liste[i].length; j++) {
                while(true){
                    try{
                        liste[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Skriv scoren til film "+(j+1)));
                        if(liste[i][j] > 9 || liste[i][j] < 0){
                            throw new Exception();
                        }
                        break;
                    }
                    catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Skriv et tall mellom 0 og 9");
                    }
                }
                if (j == 0){
                    System.out.print("Film "+(i+1)+" scores: "+liste[i][j]+", ");
                }
                else if (((j+1)%(liste[i].length) == 0)){
                    System.out.print(liste[i][j]);
                    System.out.println();
                }
                else {
                    System.out.print(liste[i][j]+", ");
                }
            }
        }
    }
}