package arrays1;

import java.util.Arrays;

public class eksempel {
    public static void main(String[] args) {
        int[] liste = {1, 3, 2, 5, 6};
        int[] liste2 = new int[5];
        liste2[0] = 1;
        liste2[1] = 3;
        liste2[2] = 2;
        liste2[3] = 5;
        liste2[4] = 6;
        liste[3] = 25;
/*      System.out.print(liste[1] + " ");
        System.out.print(liste[2] + " ");
        System.out.print(liste[3] + " "); */

        int[] tabell = {1,3,2,5,6};
/*      for (int i=0; i<5; i++){
            System.out.println(tabell[i]);
        } */
/*      for (int i=0; i<tabell.length; i++){
            System.out.print(tabell[i]+" "); */
        for (int i : tabell) {
            System.out.print(i + " ");
        }

        String[] tabell2 = {"Per", "Ole", "Line"};
        for (String i : tabell2){
            System.out.println(i);
        }

        int[] liste3 = {2,5,1,8,2};
        Arrays.sort(liste3);

        int[] liste4 = {2,5,1,8,2};
        if(Arrays.equals(liste3,liste4)){
            System.out.print("Arrayene er like!");
        }

        int indeks = Arrays.binarySearch(liste3,5); //Må være sortert
        System.out.println("Fant indeksen på plass nr "+indeks);
    }
}
