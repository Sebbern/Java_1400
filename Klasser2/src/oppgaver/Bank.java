package oppgaver;

public class Bank {
    public static void main(String[] args){
    /*  Opprett et Konto-objekter, som ved opprettelsen blir tilført
        navn, kontonummer og saldo. */
        Konto Seb = new Konto( "Sebastian", "1337.95.69420", 129337.95);

    /*  Test ut ALLE metodene du har laget i Konto-klassen på
        Konto-objektene. Skriv resultatene av metodene ut på System.out.
        Bruk dialogvinduer til både innlesing og utskrift av kontoinformasjon */
        System.out.println(Seb.innSaldo(9510.62));
        System.out.println(Seb.utSaldo(95000));
        System.out.println(Seb.utSaldo(95000));
        Seb.utskrift();
    }
}
