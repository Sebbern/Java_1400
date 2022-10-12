package ekstraoppgaver;

import javax.swing.*;

public class oppgave8 {
    public static void main(String[] args) {
        boolean i = true;
        while (i){
            int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall"));
            if ((tall%10) == ((tall/10000)%10) && ((tall/10)%10) == ((tall/1000)%10)){
                System.out.println("Tallet "+tall+" er et palindrom");
                break;
            }
            else{
                System.out.println("Tallet "+tall+" er ikke et palindrom, skriv in et nytt tall");
            }
        }
    }
}