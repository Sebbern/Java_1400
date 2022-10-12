package oppgave1;

public class Oblig1Oppgave1 {
    public static void main(String[] args) {
        double radius = 23.5;

        System.out.println("Arealet av sirkelen med radius "+radius+" er "+String.format("%.2f", Sirkel.sirkelAreal(radius))+"\n"+"Omkretsen av sirkelen med radius "+radius+" er "+String.format("%.2f", Sirkel.sirkelOmkrets(radius))+"\n"+"Diameteren til sirkelen er med radius "+radius+" er "+String.format("%.2f",Sirkel.sirkelDiameter(radius)));
    }
}