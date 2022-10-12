package oppgaver;

import javax.swing.*;

public class Oppgave2 {
    public static void main(String[] args){
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alder"));
        if (alder >= 18 && alder < 70){
            System.out.println("Du kan ta førerkort for bil og du trenger ikke årlige legesjekker.");
        }
        if (alder >= 70) {
            System.out.println("Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
        if (alder < 18){
            System.out.println("Du er for ung til å ta førerkort for bil.");
        }
    }
}