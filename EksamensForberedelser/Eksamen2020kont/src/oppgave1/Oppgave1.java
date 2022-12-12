package oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {
        int[] liste = {1,3,6,2,7,10,23,6,3,6};

        //a)
        for (int i: liste){
            System.out.print(i+" ");
        }

        System.out.println("\n");

        //b)
        for (int i = (liste.length)-1; i>0; i--){
            System.out.print(liste[i]+" ");
        }

        System.out.println("\n");

        //c)
        int sum = 0;
        int teller = (liste.length)-1;
        while (teller>0){
            sum += liste[teller];
            teller--;
        }
        System.out.println((double)sum/liste.length);
    }
}
