package oppgaver;

public class Oppgave5 {
    private static double addisjon(double x, double y){
        double svar = x+y;
        return svar;
    }

    private static double subtraksjon(double x, double y){
        double svar = x-y;
        return svar;
    }

    private static double multiplikasjon(double x, double y){
        double svar = x*y;
        return svar;
    }

    private static double divisjon(double x, double y){
        double svar = x/y;
        return svar;
    }

    public static void main(String[] args){
        double svarAddisjon = addisjon(3.5,4);
        double svarSubtraksjon = subtraksjon(3.5,4);
        double svarMultiplikasjon = multiplikasjon(3.5,4);
        double svarDivisjon = divisjon(3.5,4);
        System.out.print(svarAddisjon+"\n"+svarSubtraksjon+"\n"+svarMultiplikasjon+"\n"+svarDivisjon);
    }
}