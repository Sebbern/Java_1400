package oppgaver;

public class Oppgave5 {
    public static void main(String[] args) {
        int[][] liste = {{4,6,2,5},{7,9,4,8},{6,9,3,7}};
        int film1 = 0;
        int film2 = 0;
        int film3 = 0;
        int film4 = 0;
        for (int i=0; i< liste.length; i++) {
            for (int j = 0; j < liste[i].length; j++) {
                switch (j) {
                    case 0 -> film1 += liste[i][j];
                    case 1 -> film2 += liste[i][j];
                    case 2 -> film3 += liste[i][j];
                    case 3 -> film4 += liste[i][j];
                }
            }
        }

        //for (int[] i : liste) {
        //    for (int j : i) {
        //
        //    }
        //}
        System.out.println("Gjennomsnitlig score for film 1 er: "+film1/liste.length);
        System.out.println("Gjennomsnitlig score for film 2 er: "+film2/liste.length);
        System.out.println("Gjennomsnitlig score for film 3 er: "+film3/liste.length);
        System.out.println("Gjennomsnitlig score for film 4 er: "+film4/liste.length);
    }
}
