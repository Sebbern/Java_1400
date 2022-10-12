package oppgave2;

public class Vare {
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris){
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public String getNavn() {
        return navn;
    }

    public double getPris() {
        return pris;
    }

    public int getAntall() {
        return antall;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    //Setter antall hvis input er større enn 0, men ikke hvis input inneholder bokstaver, negative tall eller 0.
    public void setAntall(int antall) {
        if(antall > 0){
            this.antall = antall;
        }
        else{
            System.out.print("Antallet må være større enn 0. Programmet avsluttes");
            System.exit(0);
        }
    }

    //Setter pris hvis input er større enn 0, men ikke hvis input inneholder bokstaver, negative tall eller 0.
    public void setPris(double pris) {
        if(pris > 0){
            this.pris = pris;
        }
        else{
            System.out.print("Prisen må være større enn 0. Programmet avsluttes.");
            System.exit(0);
        }
    }

    public double totalPris(){
        return getPris()*getAntall();
    }
}