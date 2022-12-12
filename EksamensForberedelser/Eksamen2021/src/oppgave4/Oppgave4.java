package oppgave4;

class Person{
    private String navn;
    private String adresse;
    private String telefonnr;

    public Person(String navn, String adresse, String telefonnr){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return ("Navn: "+navn+"\nAdresse: "+adresse+"\nTelefonnr: "+telefonnr+"\n");
    }
}

class Student extends Person{
    private String studentnr;
    private String studienavn;

    public Student(String navn, String adresse, String telefonnr, String studentnr, String studienavn){
        super(navn, adresse, telefonnr);
        this.studentnr = studentnr;
        this.studienavn = studienavn;
    }

    @Override
    public String toString() {
        return super.toString()+"Studentnr: "+studentnr+"\nStudienavn: "+studienavn+"\n";
    }
}

class Ansatt extends Person{
    private String instituttnavn;
    private double lonn;

    public Ansatt(String navn, String adresse, String telefonnr, String instituttnavn, double lonn){
        super(navn, adresse, telefonnr);
        this.instituttnavn = instituttnavn;
        this.lonn = lonn;
    }

    @Override
    public String toString() {
        return super.toString()+"Instituttnavn: "+instituttnavn+"\nLønn: "+lonn+"\n";
    }
}

public class Oppgave4 {
    public static void main(String[] args) {
        Person[] reg = new Person[10];
        Student testStud = new Student("Kathrine", "Askerveien 13", "95198237", "050964","Juss");
        Student testStud2 = new Student("Nerdinand", "Trollveien 94", "13376942","042000","Kybernetikk");
        Ansatt testAnsatt = new Ansatt("Bjartulf Bjærtne", "Kroghsallé 1","90190290","Det Juridiske Fakultet",1250000.00);

        reg[0] = testStud;
        reg[1] = testAnsatt;
        reg[2] = testStud2;

        for (int i = 0; i<reg.length && reg[i]!=null; i++){
            System.out.println(reg[i]);
        }
    }
}
