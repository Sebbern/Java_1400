package oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {
        int[] array = {20, 34, -4, 4, 5, 11,-23};

        for (int i: array){
            System.out.print(i+" ");
        }

        System.out.println("\n");

        for (int i = array.length-1; i>=0; i--){
            System.out.print(array[i]+" ");
        }

        System.out.println("\n");

        int sum = 0;
        for (int i: array){
            sum += i;
        }
        System.out.println(sum);

        System.out.println();

        double gjennomsnitt = (double)sum/array.length;
        System.out.println(gjennomsnitt);

        for (int i = 1; i<20; i++){
            System.out.print(i+" ");
        }
    }
}
