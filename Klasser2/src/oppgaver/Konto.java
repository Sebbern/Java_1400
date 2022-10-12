package oppgaver;

import javax.swing.*;

public class Konto
{
    //  Attributtene for kontoinnehavers navn, kontornummer og saldo.
    private String navn;
    private String kontoNr;
    private double saldo;

    //  Kontruktør som skal gi startverdier til ALLE attributtene
    public Konto(String navn, String kontoNr, double saldo){
        this.navn = navn;
        this.kontoNr = kontoNr;
        this.saldo = saldo;
    }

    public String getNavn() {
        return navn;
    }

    public String getKontoNr() {
        return kontoNr;
    }

    public double getSaldo() {
        return saldo;
    }

    /*  Kontoutskrifts-metode, som skriver ut kontoinnehaverens
       navn, kontonummer og saldo i et dialogvindu. */
    public void utskrift(){
        String utskrift = getNavn()+", "+getKontoNr()+"\n"+getSaldo()+" kr.";
        JOptionPane.showMessageDialog(null, utskrift);
    }

    /*  Metode som setter inn et beløp på kontoen.
        Beløpets størrelse skal tas imot via en parameter til metoden.
        Metoden skal returnere en tekst som inneholder informasjon om
        den nye saldoen.  */
    public String innSaldo(double saldo) {
        this.saldo += saldo;
        return "Den nye saldoen er: "+getSaldo();
    }

    /*  Metode som tar ut et beløp fra kontoen, under forutsetning av
        at det er dekning for beløpet.
        Uttaks-beløpets størrelse skal tas imot via en parameter til metoden.
        Hvis det er dekning på kontoen, skal metoden returnere en tekst
        med informasjon om den nye saldoen. Hvis  det ikke er dekning,
        skal den returnerte teksten inneholde informasjon om det. */
    public String utSaldo(double saldo){
        if((this.saldo - saldo) > 0){
            this.saldo -= saldo;
            return "Den nye saldoen er: "+getSaldo();
        }
        else{
            return "Du har ikke nok penger på din konto.";
        }
    }
} // end of class Konto