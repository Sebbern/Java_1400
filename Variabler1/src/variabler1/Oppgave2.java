package variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave2 {
    public static void main(String [] args){
        String innNavn = showInputDialog("Skriv fornavn");
        String innEtternavn = showInputDialog("Skriv etternavn");
        String innAlder = showInputDialog("Skriv din alder");
        String ut = "Alderen til "+innNavn+" "+innEtternavn+" er "+innAlder+" år.";

        showMessageDialog(null, ut);
    }

}
