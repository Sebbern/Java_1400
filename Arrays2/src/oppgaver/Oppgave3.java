package oppgaver;

import java.util.ArrayList;

public class Oppgave3 {
    public static void main(String[] args) {
        int[] liste = new int[9];
        for (int i=0; i<liste.length; i++){
            liste[i] = i+1;
        }
        ArrayList<Integer> arrayListe = new ArrayList<>();
        for (int i : liste){
            arrayListe.add(i);
        }
        System.out.println(arrayListe);
    }
}
