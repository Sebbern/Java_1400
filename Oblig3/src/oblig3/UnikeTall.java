package oblig3;

import javax.swing.*;
import java.util.Arrays;

public class UnikeTall{
    private int[] tilfeldigArray;

   //Konstruktør som lager et array med en gitt lengde
    public void helTallsArray(int lengde) {
        tilfeldigArray = new int[lengde];
    }

   //Metode som sjekker om det genererte tallet allerede eksisterer i arrayet, returnerer deretter true hvis det eksisterer, false hvis ikke.
    private boolean sjekkRepetisjon(int tall) {
        for (int i : tilfeldigArray) {
            if (i == tall) {
                return true;
            }
        }
        return false;
    }
    /*Genererer et tall, kaller sjekkRepetisjon med det genererte tallet som parameter. Hvis tallet ikke allerede er i
    arrayet vil tallet deretter bli lagret i arrayet ved bruk av attributten i som plassering.  */
    public void fyllArray(){
        int midlertidigTall;
        for (int i=0; i<tilfeldigArray.length;) {
            midlertidigTall = (int)(Math.random()*(900)+100);
            if (!sjekkRepetisjon(midlertidigTall)) {
                tilfeldigArray[i] = midlertidigTall;
                i++;
            }
        }
    }

    // Metode som finner og returnerer det minste tallet i arrayet.
    private int minsteTall() {
        Arrays.sort(tilfeldigArray);
        return tilfeldigArray[0];
    }
    // Metode som finner og returnerer det største tallet i arrayet.
    private int storsteTall() {
        Arrays.sort(tilfeldigArray);
        return tilfeldigArray[tilfeldigArray.length-1];
    }
   //Metode som returnerer gjennomsnittet av den samlede summen av alle verdiene i arrayet
    private double gjennomsnitt(){
        double sum = 0;
        for (int i : tilfeldigArray){
            sum += i;
        }
        return sum/tilfeldigArray.length;
    }

   /*Metode som skriver ut en meldingsboks som inkluderer arrayet, dens minste tall, største tall og
    gjennomsnittsverdien til summen avalle tall */
    public void utMelding(){
        String ut = "";
        int count = 0;
        //For-løkke for å formatere arrayet i meldingsboksen ordentlig.
        for (int i : tilfeldigArray){
            if (count == 0){
                ut = ut+i;
                count++;
            }
            else if (count%8 == 0){
                ut = ut+"\n"+i;
                count++;
            }
            else {
                ut = ut+" "+i;
                count++;
            }

        }
        JOptionPane.showMessageDialog(null, ut+"\n\n Minste tall er "+minsteTall()+"\n Største tall er "+storsteTall()+"\n Gjennomsnittsverdien er "+String.format("%.1f", gjennomsnitt()));
    }
}
