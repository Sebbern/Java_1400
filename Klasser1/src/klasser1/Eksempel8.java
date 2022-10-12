package klasser1;

class Bil{
    public static double rekkevidde(double tank, double forbruk){
        double rekkevidde = tank/forbruk;
        return rekkevidde;
    }
}

public class Eksempel8 {
    public static void main(String[] args){
        double rekkevidde = Bil.rekkevidde(80, 0.8);
        System.out.print("Rekkenvidden til bilen er ");
        System.out.print(rekkevidde+ " mil");
    }
}
