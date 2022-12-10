package oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {
        //Oppgave a)
        for (int i = 0; i<100; i+=3){
            System.out.print(i+" ");
        }

        System.out.println("\n");

        //Oppgave b)
        int tall = 2;
        int sum = 0;
        int antall = 0;
        while (tall <= 100){
            sum += tall;
            tall += 2;
            antall++;
        }
        double gjennomsnitt = (double)sum/antall;
        System.out.println("Gjennomsnittet av alle partallene fra og med 2 til og med 100 er: "+gjennomsnitt);
    }
}
