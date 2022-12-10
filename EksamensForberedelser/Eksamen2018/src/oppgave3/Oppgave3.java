package oppgave3;

class Liste {
    //1) Teller hvor mange tall i arrayet som er større enn null
    public int størreEnnNull(int[] array){
        int teller = 0;
        for (int i: array){
            if (i > 0){
                teller++;
            }
        }
        return teller;
    }

    //2) Teller hvor mange ganger tallet 25 er i arrayet
    public int antallSammeTall(int[] array){
        int teller = 0;
        int tall = 25;
        for (int i: array){
            if (i == tall){
                teller++;
            }
        }
        return teller;
    }

    //3) Returnerer det største tallet i arrayet
    public int størstTall(int[] array){
        int tall = 0;
        for (int i: array){
            if (tall<i){
                tall = i;
            }
        }
        return tall;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        int[] array = {5, -4, -95, 25, 82, -1, 65, 25, 25, -4, 25};
        Liste test = new Liste();
        System.out.println("1) Det finnes "+test.størreEnnNull(array)+" som er større enn null.");
        System.out.println("2) Tallet 25 finnes "+test.antallSammeTall(array)+" ganger i arrayet.");
        System.out.println("3) Det største tallet i arrayet er: "+test.størstTall(array));
    }
}
