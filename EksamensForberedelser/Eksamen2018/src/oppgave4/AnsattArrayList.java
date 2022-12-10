package oppgave4;

import java.util.ArrayList;

class Ansatt {
    private String navn;
    private Dato født, tiltrådt;

    public Ansatt ( String navn, Dato født, Dato tiltrådt){
        this.navn = navn;
        this.født = født;
        this.tiltrådt = tiltrådt;
    }

    public String toString (){
        return (navn+", "+født+", "+tiltrådt);
    }
}

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){
        return (dag+" "+månedsnavn(måned)+" "+år);
    }
    // skriv en toString metode slik at datoen kommer ut på følgende format:
    // dd månedsnavn år, f.eks 1 januar 2019

}

public class AnsattArrayList {

    public static void main(String[] args) {
        ArrayList<Ansatt> ansattListe = new ArrayList<>();
        Dato dato1 = new Dato(1,1,1970);
        Dato dato2 = new Dato(17,4,1995);
        Ansatt heidi = new Ansatt("Heidi",dato1,dato2);

        Dato dato3 = new Dato(5,9,1964);
        Dato dato4 = new Dato(9,5,1989);
        Ansatt bjarne = new Ansatt("Bjarne",dato3,dato4);

        ansattListe.add(heidi);
        ansattListe.add(bjarne);

        for (Ansatt i : ansattListe) {
            System.out.println(i);
        }
    }
}