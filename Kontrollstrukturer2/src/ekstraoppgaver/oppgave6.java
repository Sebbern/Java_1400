package ekstraoppgaver;

public class oppgave6 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s %-10s%n","N","N^2","N^3","N^4");
        for (int i = 1; i < 11; i++){
            System.out.printf("%-10s %-10s %-10s %-10s%n", i, Math.pow(i,2), Math.pow(i,3), Math.pow(i,4));
        }
    }
}