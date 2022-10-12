package oppgaver;

public class oppgave6 {
    public static void main(String[] args) {
        int[] liste = {1,2,3,4};
        int[] liste2 = {1,2,3,4};
        for (int i=0; i<liste.length; i++){
            if (liste[i] != liste2[i]){
                System.out.println("Listene er ikke like");
                break;
            }
            if (i == liste.length-1){
                System.out.println("Listene er like");
            }
        }
    }
}
