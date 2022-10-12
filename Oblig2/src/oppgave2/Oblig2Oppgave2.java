package oppgave2;

import static javax.swing.JOptionPane.*;

class Tallspill
{
    //Lager et tilfeldig tall 0<x<1, og ganger det videre med 201 for å få et tilfeldig tall 0<=x<=200.
    //(int) er der for å fjerne desimalene etter utført regnestykke
    public int nyttTall() {
        return (int)(Math.random() * 201);
    }

    //Skriver ut en melding i en meldingsboks
    public void visMelding(String melding){
        showMessageDialog(null, melding);
    }

    private void forLite(int tall){
        visMelding(tall+" er for lite! Prøv igjen!");
    }

    private void forStort(int tall) {
        visMelding(tall+" er for stort! Prøv igjen!");
    }

    public void avsluttRunde(int antall, int gjetning) {
        visMelding(gjetning+" er riktig!\nDu gjettet riktig på "+antall+" forsøk.");
    }

    public void kjørSpill() {
        int tall = nyttTall();
        int antall = 0;
        int gjett;

        //While-løkke for å holde spillet i gang til det riktige tallet er gjettet
        while (true){
            //While-løkke i tilfelle det blir catchet at inputten ikke er et tall mellom 0 og 200
            while (true) {
                try {
                    gjett = Integer.parseInt(showInputDialog(("Jeg tenker på et tall mellom 0 og 200.\nPrøv å gjette på tallet:")));
                    if (gjett < 0 || gjett > 200){
                        throw new Exception();
                    }
                    break;
                } catch (Exception e) {
                    visMelding("Dette tallet er ikke gyldig, skriv inn et tall mellom 0 og 200.");
                }
            }
            //Teller runder/antall gjett
            antall += 1;

            //Forteller bruker at gjettet tall er for stort
            if (gjett > tall){
                forStort(gjett);
            }
            //Forteller bruker at gjettet tall er for lite
            else if (gjett < tall){
                forLite(gjett);
            }
            //Gir resultat og avslutter spillet
            else{
                avsluttRunde(antall, gjett);
                break;
            }
        }
    }
}

public class Oblig2Oppgave2 {
    public static void main(String[] args) {
        Tallspill spill = new Tallspill();
        spill.kjørSpill();
    }
}