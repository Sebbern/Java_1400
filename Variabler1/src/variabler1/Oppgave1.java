package variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    public static void main(String [] args){
        String innNavn = showInputDialog("Skriv fornavn");
        String innEtternavn = showInputDialog("Skriv etternavn");
        String ut = "Ditt fulle navn er "+innNavn+" "+innEtternavn;

        showMessageDialog(null, ut);
    }

}
