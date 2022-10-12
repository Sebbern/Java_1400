package oppgaver;

public class oppgave3 {
    public static void main(String[] args) {
        String[] liste = {"Per","Hansen","Line","Olsen","Ola","Pedersen","Kari","Finnsen"};
        for (int i=0; i<liste.length; i++){
            if (i%2==0){
                System.out.print(liste[i]+" ");
            }
            else {
                System.out.print(liste[i]+"\n");
            }
        }
    }
}
