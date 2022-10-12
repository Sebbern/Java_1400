package oppgave2;

import javax.swing.*;

public class Oblig1Oppgave2 {
    public static void main(String[] args) {
        Vare vare1 = new Vare("", 0, 0);
        Vare vare2 = new Vare("", 0, 0);

        vare1.setNavn(JOptionPane.showInputDialog("Skriv inn navnet på vare 1"));

        //Prøver å sette et antall, hvis antallet er en positiv integer større enn 0 går svaret igjennom.
        //Hvis antallet er lavere enn 0, eller ikke er en integer vil catch printe ut en feilmelding og programmet avsluttes.
        try {
            vare1.setAntall(Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall varer")));
        }
        catch (Exception e) {
            System.out.println(e+" er ikke et gyldig antall. Programmet avsluttes.");
            return;
        }

        //Prøver å sette en pris, hvis prisen er et positivt desimaltall større enn 0 går svaret igjennom.
        //Hvis prisen er lavere enn 0, eller ikke er en double vil catch printe ut en feilmelding og programmet avsluttes.
        try {
            vare1.setPris(Double.parseDouble(JOptionPane.showInputDialog("Skriv inn varens pris")));
        }
        catch (Exception e){
            System.out.println(e+" er ikke en gyldig pris. Programmet avsluttes.");
            return;
        }

        vare2.setNavn(JOptionPane.showInputDialog("Skriv inn navnet på vare 2"));

        try{
            vare2.setAntall(Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall varer")));
        }
        catch (Exception e){
            System.out.println(e+" er ikke et gyldig antall. Programmet avsluttes.");
            return;
        }

        try{
            vare2.setPris(Double.parseDouble(JOptionPane.showInputDialog("Skriv inn varens pris")));
        }
        catch (Exception e){
            System.out.println(e+" er ikke en gyldig pris. Programmet avsluttes.");
            return;
        }

        System.out.println(vare1.getAntall()+" "+vare1.getNavn()+" : "+(vare1.getPris()*vare1.getAntall())+"kr.\n"+vare2.getAntall()+" "+vare2.getNavn()+" : "+(vare2.getPris()*vare2.getAntall())+"kr.\nTotalprisen ble : "+(vare1.totalPris()+vare2.totalPris())+" kr.");
    }
}