package oppgaver;

public class Vind {
    private double vindHastighet = 0.0;

    // her skal det inn en konstruktør for å sette vindhastigheten
    public Vind(double vindHastighet) {
        this.vindHastighet = vindHastighet;
    }

    public double getVindHastighet() {
        return vindHastighet;
    }

    public boolean erOrkan() {
        // sett inn kode her
        if(getVindHastighet() > 120){
            return true;
        }
        else {
            return false;
        }
    }

    public boolean erVindstille() {
        // sett inn kode her
        if(getVindHastighet() < 2){
            return true;
        }
        else{
            return false;
        }
    }

    public double getKnop() {
        // sett inn kode her
        double knop = getVindHastighet()*1000/1852;
        return knop;
    }

    public int getBeaufort() {
        // sett inn kode her
        int beaufort = (int)(Math.pow(getVindHastighet()/3,0.6666)+0.5);
        return beaufort;
    }

    public static void main(String[] args){
        Vind test1 = new Vind(1);
        Vind test2 = new Vind(150);
        if (test1.erOrkan() == true){
            System.out.println("Test1: orkan");
        }
        if (test1.erVindstille() == true){
            System.out.println("Test1: vindstille");
        }
        if (test2.erOrkan() == true){
            System.out.println("Test2: orkan");
        }
        if (test2.erVindstille() == true){
            System.out.println("Test2: vindstille");
        }
        System.out.println(test1.getVindHastighet()+" km/t\n"+test1.getKnop()+" knop\n"+test1.getBeaufort()+" beaufort");
        System.out.println(test2.getVindHastighet()+" km/t\n"+test2.getKnop()+" knop\n"+test2.getBeaufort()+" beaufort");
    }
}