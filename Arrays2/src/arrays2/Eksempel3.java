package arrays2;

import java.util.ArrayList;

class Person{
    public String navn;
    public int alder;
}

public class Eksempel3 {
    public static void main(String[] args) {
        ArrayList<Person> personer = new ArrayList<>();
        Person ole = new Person();
        ole.navn = "Ole";
        ole.alder = 23;
        personer.add(ole);
        Person line = new Person();
        line.navn = "Line";
        line.alder = 21;
        personer.add(line);
        for (Person enPerson : personer){
            System.out.println(enPerson.navn+" "+enPerson.alder);
        }
//        personer.remove(ole);
//        personer.remove(0);
//        personer.clear(); //Fjerner alle objekter fra ArrayListen.
        for (int i=0; i<personer.size(); i++){
            System.out.println(personer.get(i).navn+" "+personer.get(i).alder);
        }
        if (personer.contains(ole)){
            System.out.println("Ole er i lista");
        }
        else {
            System.out.println("Ole er ikke i lista");
        }
        int indeks = personer.indexOf(ole);
        System.out.println("Indeksen til objekt ole : "+indeks);

    }
}
