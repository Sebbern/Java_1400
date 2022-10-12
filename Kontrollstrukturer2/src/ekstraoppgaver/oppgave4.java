package ekstraoppgaver;

import javax.swing.*;

public class oppgave4 {
    public static void main(String[] args) {
        int størst = 0;
        int neststørst = 0;
        for (int teller = 0; teller < 10; teller++) {
            int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn tall"));
            if (nummer > størst) {
                neststørst = størst;
                størst = nummer;
            } else if (nummer > neststørst) {
                neststørst = nummer;
            }
            JOptionPane.showMessageDialog(null, størst+", "+neststørst);
        }
    }
}