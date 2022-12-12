package oppgave3;

public class Bok {
    private String tittel;
    private Forfatter forfatter;

    public String getTittel() {
        return tittel;
    }

    public Forfatter getForfatter() {
        return forfatter;
    }

    public void setTittel(String tittel) {
        this.tittel = tittel;
    }

    public void setForfatter(Forfatter forfatter) {
        this.forfatter = forfatter;
    }

    public Bok (String tittel, Forfatter forfatter){
        this.tittel = tittel;
        this.forfatter = forfatter;
    }

    @Override
    public String toString() {
        return "Bok: "+tittel+"\n"+forfatter;
    }
}
