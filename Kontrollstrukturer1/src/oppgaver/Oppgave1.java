package oppgaver;

import javax.swing.*;

public class Oppgave1 {
    public static void main(String[] args){
        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall"));
        if (tall >= 18 && tall < 20){
            System.out.print("Du er myndig, men kan ikke kjøpe alkohol med mer enn 22 % på polet.");
        }
        else{
            System.out.print("Du er enten umyndig eller så kan du kjøpe hva du vil på polet.");
        }
    }
}
