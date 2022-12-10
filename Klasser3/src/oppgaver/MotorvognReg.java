package oppgaver;

import java.util.ArrayList;

class Dato {
    private int dag, måned, år;

    public Dato(int dag, int måned, int år) {
        this.dag = dag;
        this.måned = måned;
        this.år = år;
    }

    private static String månedsnavn(int mnd) {
        String[] navn = {"januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember"};
        if (mnd > 0 && mnd < 13)
            return navn[mnd - 1];
        else
            return "ukjent måned";
    }

    public String toString() {
        return dag + "." + månedsnavn(måned) + "." + år;
    }
}

class Bil {
    private String bilType, skiltnummer;
    private Dato reg;
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    public Bil(String bilType, String skiltnummer, Dato reg) {
        this.bilType = bilType;
        this.skiltnummer = skiltnummer;
        this.reg = reg;
    }

    // lag også konstruktør for alle attributtene

    public String toString() {
        return "Biltype: " + bilType + "\nSkiltnummer: " + skiltnummer + "\nFørstegangsregistrering: " + reg;
    }
    // lag så en toString metode for å vise alle attributtene

}

public class MotorvognReg {

    public static void main(String[] args) {
        Dato reg = new Dato(17, 4, 95);
        Bil minBil = new Bil("Audi", "A1B2C3", reg);
        // opprett et array av Biler
        ArrayList<String> bilListe = new ArrayList<>();

        // Sett inn noen biler i arrayet
        bilListe.add(0, minBil.toString());

        // List motorvognregisteret (arrayet) ved hjelp av en løkke
        System.out.println(bilListe.get(0));
    }
}
