package oppgaver;

import javax.swing.*;

class Bøker {
    public String tittel;
    public double pris;
    public String forfatter;
    public int iSBNnummer;
    }

public class Oppgave1 {
    public static void main(String[] args){
        Bøker bok1 = new Bøker();
        bok1.tittel = JOptionPane.showInputDialog("Skriv boktittel");
        String innPris = JOptionPane.showInputDialog("Skriv pris");
        bok1.pris = Integer.parseInt(innPris);
        bok1.forfatter = JOptionPane.showInputDialog("Skriv forfatter");
        String iSBN = JOptionPane.showInputDialog("Skriv ISBN");
        bok1.iSBNnummer = Integer.parseInt(iSBN);

        String ut = "Tittel: "+bok1.tittel+"\nPris: "+bok1.pris+"\nForfatter: "+bok1.forfatter+"\nISBN: "+bok1.iSBNnummer;
        JOptionPane.showMessageDialog(null, ut);
        //System.out.println(bok1.tittel+" ("+ bok1.iSBNnummer+") "+"av "+bok1.forfatter+" koster "+bok1.pris);
    }
}