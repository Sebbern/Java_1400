package oppgave1;

import javax.swing.*;

public class Oblig2Oppgave1 {
    public static void main(String[] args) {
        int nedreGrense;
        int ovreGrense;
        int sum = 0;
        int count = 0;

        //Hvis den øvre verdien er lik eller lavere enn den nedre verdien vil while-løkken og if-setningen tvinge brukeren til å lese inn en ny verdi.
        while (true) {
            nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn den nedre grensen."));
            ovreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn den øvre grensen."));
            if (nedreGrense >= ovreGrense) {
                JOptionPane.showMessageDialog(null, "Den øvre grensen er lik, eller er mindre enn den nedre grensen. Gjenta innlesning.");
            }
            else{
                break;
            }
        }

        for (int i = nedreGrense; i <= ovreGrense; i++){
            //Lager ny line break etter hvert 10 tall og printer ut det første tallet i en rekke
            if ((count%10) == 0){
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
            count += 1;
            sum += i;
        }
        System.out.print(sum);
    }
}