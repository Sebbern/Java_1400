package variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave4 {
    public static void main(String [] args){
        String innNavn = showInputDialog("Skriv fornavn");
        String innEtternavn = showInputDialog("Skriv etternavn");
        String innAlder = showInputDialog("Skriv din alder");
        String innAdresse = showInputDialog("Skriv din adresse");
        String innPostNr = showInputDialog("Skriv ditt postnr");
        String innPostAdresse = showInputDialog("Skriv din postadresse");

        String ut = "Navn : "+innNavn+" "+innEtternavn+"\nAdresse : "+innAdresse+"\nPostnummer : "+innPostNr+"\nPoststed : "+innPostAdresse+"\nAlder : "+innAlder+" år.";

        showMessageDialog(null, ut);
    }

}
