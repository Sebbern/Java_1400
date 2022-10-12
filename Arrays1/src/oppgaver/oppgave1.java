package oppgaver;

public class oppgave1 {
    public static void main(String[] args) {
        int[] liste = {1,2,3,4,5,6,7,8,9};
        int sum = 0;

        for (int i : liste){
            sum += i;
        }
        int gjennomsnitt = sum/liste.length;
        int sum2 = 0;
        int count = 0;
        for (int i : liste){
            if (i >= 5){
                sum2 += i;
                count += 1;
            }
        }
        int gjennomsnitt2 = sum2/count;
        System.out.println(sum);
        System.out.println(gjennomsnitt);
        System.out.println(sum2);
        System.out.println(gjennomsnitt2);
    }
}
