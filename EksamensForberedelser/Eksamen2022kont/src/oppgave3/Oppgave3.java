package oppgave3;

class Personalia{
    private String navn;
    private String adresse;
    private String telefonnr;

    public Personalia(String navn, String adresse, String telefonnr){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return "Navn: "+navn+"\nAdresse: "+adresse+"\nTelefonnr: "+telefonnr+"\n";
    }
}

class Student{
    private Personalia personalia;
    private String studentnr;

    public Student (Personalia personalia, String studentnr){
        this.personalia = personalia;
        this.studentnr = studentnr;
    }

    @Override
    public String toString() {
        return personalia+"Studentnr: "+studentnr;
    }
}

class Ansatt{
    private Personalia personalia;
    private String tittel;

    public Ansatt (Personalia personalia, String tittel){
        this.personalia = personalia;
        this.tittel = tittel;
    }

    @Override
    public String toString() {
        return personalia+"Tittel: "+tittel;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        Personalia studPersonalia = new Personalia("Andresen", "Midten 9","12345678");
        Student tilfeldigStudent = new Student(studPersonalia,"99223");
        Personalia ansattPersonalia = new Personalia("Rektor Prektor","Finstasgata 2","41904589");
        Ansatt selveste = new Ansatt(ansattPersonalia,"Rektor");

        System.out.println(tilfeldigStudent+"\n");
        System.out.println(selveste);
    }
}
