package arrays2;

import java.util.ArrayList;

public class Eksempel2 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(3);
        System.out.println(liste.get(0));
        System.out.println(liste.indexOf(3));
        System.out.println(liste.size());

        if (liste.contains(2)){
            System.out.println("True");
        }

        liste.remove(1);
        liste.trimToSize(); //Remove fjerner ikke index fra minnet, trimToSize gjør dette

    }
}
