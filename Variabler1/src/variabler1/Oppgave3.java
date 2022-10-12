package variabler1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave3 {
    public static void main(String [] args){
        String innNavn = showInputDialog("Skriv fornavn");
        String innEtternavn = showInputDialog("Skriv etternavn");
        String innAlder = showInputDialog("Skriv din alder");
        String innAdresse = showInputDialog("Skriv din adresse");
        String innPostNr = showInputDialog("Skriv ditt postnr");
        String innPostAdresse = showInputDialog("Skriv din postadresse");

        String ut = innNavn+" "+innEtternavn+" bor i "+innAdresse+" som har postnummer "+innPostNr+" i "+innPostAdresse+". "+innNavn+"s alder er "+innAlder+" år.";

        showMessageDialog(null, ut);
    }

}
