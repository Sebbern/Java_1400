package aritmetikk;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave1 {
    public static void main(String [] args){
        String navn = showInputDialog("Skriv inn ditt navn");
        String innAlder = showInputDialog("Skriv inn din alder");
        int alder = Integer.parseInt(innAlder);

        System.out.print(navn+" er i dag "+alder+" år. Han er født i "+(2022-alder)+". I "+(2022-alder+67)+" er han "+67+" år og da vil han være pensjonist");
    }
}
