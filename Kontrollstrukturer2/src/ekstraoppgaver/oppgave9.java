package ekstraoppgaver;

import javax.swing.*;

public class oppgave9 {
    public static void main(String[] args) {
        long sum = 1;

        for (long i = Long.parseLong(JOptionPane.showInputDialog("Skriv inn et tall")); i > 0; i--) {
            sum *= i;
        }
        System.out.println("Ditt innskrevne talls fakultet er: " + sum); //maks 20ish funker pga 64-bit overflow
    }
}