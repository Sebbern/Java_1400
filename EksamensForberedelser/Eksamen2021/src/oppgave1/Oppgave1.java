package oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {
        int sumA = 0;
        for (int i = 5; i<=100; i+=5){
            sumA += i;
        }
        System.out.println(sumA);

        int sumB = 0;
        int teller = 5;
        while (teller<=100){
            sumB += teller;
            teller += 5;
        }
        System.out.println(sumB);
    }
}
