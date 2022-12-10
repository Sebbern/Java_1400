package oppgave2;

public class Oppgave2 {
    public static void main(String[] args) {
        int[] helTallArray = {-3, 41, 5, -3, 2, 49};

        //Oppgave a
        int count = 0;
        for (int i: helTallArray){
            if (i > 10){
                count++;
                System.out.println(i);
            }
        }

        System.out.println("Antall tall større enn 10 er: "+count+"\n");

        //Oppgave b
        for (int i = 0; i<helTallArray.length; i++){
            if (i%2 == 0){
                System.out.print(helTallArray[i]+" ");
            }
        }

        System.out.println("\n");

        //Oppgave c
        int sum = 0;
        count = 0;
        for (int i: helTallArray){
            if (i > 0){
                sum += i;
                count++;
            }
        }

        System.out.println("Summen er: "+sum+"\n");

        //Oppgave d
        double gjennomsnitt = (double)sum/count;
        System.out.println("Gjennomsnittet er: "+gjennomsnitt);
    }
}
