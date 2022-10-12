package klasser1;

class Person {
    public String navn;
    public int fødselsår;

    public int alder(int årstall) {
        int alder = årstall - fødselsår;
        return alder;
    }
}

public class Eksempel5 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.navn = "Line Jensen";
        person1.fødselsår = 1999;
        int alder = person1.alder(2019);
        System.out.print(person1.navn + " er " + alder + " år");
    }
}

