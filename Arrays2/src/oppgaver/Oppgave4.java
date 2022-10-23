package oppgaver;

import java.util.ArrayList;

public class Oppgave4 {
    public static void main(String[] args) {
        ArrayList<Integer> intListe = new ArrayList<>();
        for (int i=1; i<10; i++){
            intListe.add(i);
        }
        int[] liste = new int[intListe.size()];
        for (int i=0; i<intListe.size(); i++){
            liste[i] = intListe.get(i);
            System.out.print(liste[i]+", ");
        }
    }
}
