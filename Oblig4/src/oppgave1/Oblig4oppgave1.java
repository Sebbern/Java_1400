package oppgave1;

public class Oblig4oppgave1 {
    public static void main(String[] args) {
        int[] liste = {2,4,6,12,78,45,3,42,5,-7};
        int sum = 0;
        for (int i = 0; i<liste.length; i++){
            sum += liste[i];
        }
        int sum2 = 0;
        for (int i : liste){
            sum2 += i;
        }
        System.out.println(sum);
        System.out.println(sum2);
    }
}
