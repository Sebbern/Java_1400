package oppgave3;

import java.util.Arrays;

class Fag{
    private String navn;
    private String år;
    private Student[] studenter;

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getÅr() {
        return år;
    }

    public void setÅr(String år) {
        this.år = år;
    }

    public Student[] getStudenter() {
        return studenter;
    }

    public void setStudenter(Student[] studenter) {
        this.studenter = studenter;
    }

    public Fag(String navn, String år, Student[] studenter) {
        this.navn = navn;
        this.år = år;
        this.studenter = studenter;
    }

    @Override
    public String toString() {
        String ut = "Fag : "+navn+", år : "+år+"\n";
        for(Student i: studenter){
            if (i != null){
                ut+=i+"\n";
            }
        }
        return ut;
    }
}

class Student{
    private String navn;
    private String studNr;

    public String getNavn() {
        return navn;
    }
    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    public Student(String navn, String studNr) {
        this.navn = navn;
        this.studNr = studNr;
    }

    @Override
    public String toString() {
        return "Student : Navn="+navn+", Studnr="+studNr;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        Student test1 = new Student("Seb","S123456");
        Student test2 = new Student("Meh","S931412");
        Student[] students = new Student[10];
        students[0]=test1;
        students[1]=test2;
        Fag test = new Fag("Matte","2020",students);
        System.out.println(test);
    }
}
