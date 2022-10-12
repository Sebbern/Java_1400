package variabler1;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave5 {
    public static void main(String [] args){
        String innNavn = showInputDialog("Skriv fornavn");
        String innEtternavn = showInputDialog("Skriv etternavn");
        String innAlder = showInputDialog("Skriv din alder");
        String innAdresse = showInputDialog("Skriv din adresse");
        String innPostNr = showInputDialog("Skriv ditt postnr");
        String innPostAdresse = showInputDialog("Skriv din postadresse");

        String ut = "Navn : "+innNavn+" "+innEtternavn+"\nAdresse : "+innAdresse+"\nPostnummer : "+innPostNr+"\nPoststed : "+innPostAdresse+"\nAlder : "+innAlder+" år.";

        System.out.print(ut);
    }

}
