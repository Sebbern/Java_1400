package oppgave1;

import javax.swing.*;

public class Oblig2Oppgave1 {
    public static void main(String[] args) {
        int nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn den nedre grensen."));
        int ovreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn den øvre grensen."));
        int sum = 0;

        for (int i = nedreGrense; i <= ovreGrense; i++){
            //Lager ny line break etter hvert 10 tall og printer ut det første tallet i en rekke
            if ((i%10) == 1){
                System.out.print("\n"+i+" + ");
            }
            //Sjekker om det siste tallet er på vei til å bli skrevet ut, printer deretter det siste tallet og ett "=" tegn
            else if (i == ovreGrense){
                System.out.print(i+" = ");
            }
            //Printer ut ett tall og ett "+" ikon
            else {
                System.out.print(i+" + ");
            }
            sum += i;
        }
        System.out.print(sum);
    }
}