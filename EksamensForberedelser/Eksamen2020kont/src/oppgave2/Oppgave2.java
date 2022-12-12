package oppgave2;

class KonverterTemperatur{
    double tilCelsius(double tall){
        return (tall-32)/1.8;
    }

    double tilFahrenheit(double tall){
        return tall*1.8+32;
    }
}

public class Oppgave2 {
    public static void main(String[] args) {
        KonverterTemperatur test = new KonverterTemperatur();
        System.out.println(test.tilCelsius(112));
        System.out.println(test.tilFahrenheit(23));
    }
}
