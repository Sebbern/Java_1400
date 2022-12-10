package oppgave2;

public class Oppgave2 {
    static boolean funnetTall(int[] array, int tall){
        for (int i: array){
            if (tall == i){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9};
        int falseTall = 2;
        int trueTall = 5;

        System.out.println(funnetTall(array, falseTall));
        System.out.println(funnetTall(array, trueTall));
    }
}
