package oppgaver;

public class oppgave7 {
    public static void main(String[] args) {
        int[] liste = {1,2,3,4,5,6,7,8,9,10};
        int partall = 0;
        int oddetall = 0;
        for (int i : liste){
            if (liste[i-1]%2 == 1){
                oddetall += 1;
            }
            else {
                partall += 1;
            }
        }
        System.out.println(oddetall+" oddetall, og "+partall+" partall");
    }
}
