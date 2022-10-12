package oppgave1;

public class Sirkel {

    //Statisk metode som returnerer diameter
    static double sirkelDiameter(double radius){
        return radius*2;
    }

    //Statisk metode som returnerer omkrets
    static double sirkelOmkrets(double radius){
        return 2*Math.PI*radius;
    }

    //Statisk metode som returnerer areal
    static double sirkelAreal(double radius){
        return Math.PI*Math.pow(radius, 2);
    }
}