package aritmetikk;

public class Aritmetikk {
    public static void main(String [] args){
        int tall1 = 2;
        int tall2 = 4;
        int sum = tall1 + tall2;
        int sub = tall1 - tall2;
        int multiplikasjon = tall1 * tall2;
        int divisjon = tall1 / tall2;

        double tall4 = 3;
        double divisjon1 = tall1/tall2;

        int tall5 = 23;
        int tall6 = 3;

        double tall7 = (double)tall5/(double)tall6;
        double tall8 = (double)tall5/tall6;
        double tall9 = tall5/(double)tall6;

        if (tall5 == tall6){
            System.out.println("Tallene er like");
        }

        if (tall5 != tall6){
            System.out.println("Tallene er ikke like!");
        }

        if (tall1 > tall2){
            System.out.println("Tall 1 er større enn tall 2");
        }

        if (tall1 < tall2){
            System.out.println("Tall 1 er mindre enn tall 2");
        }

        if (tall1 >= tall2){
            System.out.println("tall 1 er større eller lik tall 2");
        }

        if (tall1 <= tall2){
            System.out.println("tall 1 er mindre eller like tall 2");
        }
    }
}
