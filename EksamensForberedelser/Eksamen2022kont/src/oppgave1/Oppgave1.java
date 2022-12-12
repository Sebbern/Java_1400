package oppgave1;

public class Oppgave1 {
    public static void main(String[] args) {
        //a)
        int sum = 0;
        for (int i = 0; i<=1000; i+=10){
            sum += i;
        }
        System.out.println(sum);

        //b)
        sum = 0;
        int teller = 0;
        while (teller<=1000){
            sum+=teller;
            teller += 10;
        }
        System.out.println(sum);

        //c)
        for (int i = 10; i>=-10; i--){
            if (i == -10){
                System.out.print(i);
            }
            else {
                System.out.print(i+", ");
            }
        }
    }
}
