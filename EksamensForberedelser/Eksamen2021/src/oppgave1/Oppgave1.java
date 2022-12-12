package oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {
        int sumA = 0;
        double gjennomsnitt;
        int teller = 0;
        for (int i = 5; i<=100; i+=5){
            sumA += i;
            teller++;
        }
        gjennomsnitt = (double)sumA/teller;

        System.out.println(sumA);
        System.out.println(gjennomsnitt);

        int sumB = 0;
        int i = 5;
        while (i<=100){
            sumB += i;
            i += 5;
        }
        gjennomsnitt = (double)sumB/teller;

        System.out.println(sumB);
        System.out.println(gjennomsnitt);
    }
}
