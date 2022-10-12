package aritmetikk;

import javax.swing.*;

public class Oppgave11 {
    public static void main(String[] args){
        String innTall = JOptionPane.showInputDialog("Skriv et tall mellom 0 og 1000");
        int tall = Integer.parseInt(innTall);
        int sum = 0;

        if (tall < 0 || tall > 1000){
            System.out.print("Tallet er ikke mellom 0 og 1000");
        }
        else{
            sum += ((tall%10)+(tall/10%10)+(tall/100));
        }
        System.out.print(sum);
    }
}
