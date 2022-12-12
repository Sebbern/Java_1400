package oppgave3;

public class Forfatter {
    private String navn;
    private String født;

    public String getNavn() {
        return navn;
    }

    public String getFødt() {
        return født;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public void setFødt(String født) {
        this.født = født;
    }

    public Forfatter (String navn, String født){
        this.navn = navn;
        this.født = født;
    }

    @Override
    public String toString() {
        return "Forfatter: "+navn+"\nFødt: "+født;
    }
}
