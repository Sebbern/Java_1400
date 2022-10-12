package oppgaver;

import javax.swing.*;

class Person {
    public String navn;
    public String adresse;
    public String telefonnr;
    public String innFødselsår;
    public int fødselsår;

    public int alder() {
        int alder = 2022 - fødselsår;
        return alder;
    }
}

public class Oppgave3 {
    public static void main(String[] args){
        Person Seb = new Person();
        Seb.navn = JOptionPane.showInputDialog("Navn");
        Seb.adresse = JOptionPane.showInputDialog("Adresse");
        Seb.telefonnr = JOptionPane.showInputDialog("Telefonnr");
        Seb.innFødselsår = JOptionPane.showInputDialog("Fødselsår");
        Seb.fødselsår = Integer.parseInt(Seb.innFødselsår);
        int alder = Seb.alder();

        String ut = "Navn: "+Seb.navn+"\n Adresse: "+Seb.adresse+"\n Telefonnr: "+Seb.telefonnr+"\n Alder: "+alder+" år.";
        JOptionPane.showMessageDialog(null, ut);
    }
}
