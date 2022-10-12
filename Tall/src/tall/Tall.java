package tall;

import javax.swing.*;

//Summering av tall
/* public class Tall {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        int sum = tall1 + tall2;

        System.out.print("Summen av de to tallene er "+sum);

    }
} */

//Divisjon, desimaltall
/* public class Tall {
    public static void main(String[] args) {
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et desimaltall til");
        double tall1 = Double.parseDouble(innStreng1);
        double tall2 = Double.parseDouble(innStreng2);
        double divisjon = tall1 / tall2;

        System.out.println("Divisjonen ble " + divisjon);

    }
} */

//Divisjon, heltall og desimaltall. Må ha Double.parseDouble på minst ett av tallene hvis desimaltall.
/* public class Tall {
    public static void main(String [] args){
        String innStreng1 = JOptionPane.showInputDialog("Skriv inn et heltall");
        String innStreng2 = JOptionPane.showInputDialog("Skriv inn et heltall til");
        int tall1 = Integer.parseInt(innStreng1);
        double tall2 = Double.parseDouble(innStreng2);
        double divisjon = tall1 / tall2;
        JOptionPane.showMessageDialog(null,"Divisjonen ble "+divisjon);
//        System.out.print("Divisjonen ble "+divisjon);

    }
} */

//Exception handling
public class Tall {
    public static void main(String [] args){
        String innstreng = JOptionPane.showInputDialog("Skriv inn et heltall");
        int tall;
        try{
            tall = Integer.parseInt(innstreng);
        }
        catch(Exception e){
            tall = 0;
        }

        System.out.println("Tallet er "+tall);
    }
}