package variabler1;

import static javax.swing.JOptionPane.showInputDialog;
//import static javax.swing.JOptionPane.showMessageDialog;

public class Variabler1 {
    public static void main(String [] args){
        String navn,adresse;
        navn = "Per Hansen";
        adresse = "Osloveien 82";
        String postadresse = "Oslo";
        String postNr = "1234";
        System.out.println("Navnet er "+navn);
        System.out.println("Adressen er "+adresse+", "+postNr+" "+postadresse);

        String innNavn = showInputDialog("Skriv inn navnet");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skriv inn postnr");
        String innPostAdresse = showInputDialog("Skriv inn postadresse");

        String ut = "Navnet er: "+innNavn+"\n"+"Adressen er: "+innAdresse+", "+innPostNr+" "+innPostAdresse;
        System.out.println(ut);
        //showMessageDialog(null,ut);
    }
}
