package oppgaver;

public class oppgave4 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 0; i < 100; i += 2) {
            sum += i;
            if (i == 98) {
                System.out.println(sum / (i / 2));
            }
        }
    }
}
