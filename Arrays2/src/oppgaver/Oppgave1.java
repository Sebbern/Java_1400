package oppgaver;

import java.util.ArrayList;

public class Oppgave1 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        for (int i=1; i<10; i++){
            liste.add(i);
        }
        System.out.println(liste.get(3)+", "+liste.get(6));
        liste.add(10);
        liste.add(11);
        liste.remove((Integer) 2);
        liste.remove((Integer) 3);
        for (Integer i : liste) {
            System.out.print(i + ", ");
        }
     }
}
