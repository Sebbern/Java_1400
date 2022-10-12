package oppgaver;

import java.util.Arrays;

public class oppgave4 {
    public static void main(String[] args) {
        int[] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        Arrays.sort(liste);
        int minste = 0;
        int største = 0;
        for (int i = liste.length-1; i>=0; i--){
            if (i == liste.length-1){
                største = liste[i];
            }
            if (i == 0){
                minste = liste[i];
            }
        }
        System.out.println(største+" "+minste);
    }
}
