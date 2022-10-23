package arrays2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.*;

public class Eksempel4 {
    public static void main(String[] args) {
        ArrayList<Integer> liste = new ArrayList<>();
        liste.add(23);
        liste.add(22);
        liste.add(-2);
        liste.add(-5);
        liste.add(22);
        liste.remove(1);
        liste.add(0,24);
//        liste.remove((Integer) 22);

        //Collections.sort(liste);
        System.out.println(liste);
        for (int tall : liste){
            System.out.print(tall+" ");
        }
    }
}
