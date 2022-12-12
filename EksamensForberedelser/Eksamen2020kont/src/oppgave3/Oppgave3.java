package oppgave3;

public class Oppgave3 {
    public static void main(String[] args) {
        Forfatter testForfatter = new Forfatter("Kåre Bjarne","04.01.85");
        Bok testBok = new Bok("Speider Kåre",testForfatter);
        System.out.println(testBok.toString());
    }
}
