package oppgaver;

import javax.swing.*;

class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private String telefonnr;

    public Person(String fornavn, String etternavn, String adresse, String telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getFornavn(){
        return fornavn;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setEtternavn(String etternavn) {
        this.etternavn = etternavn;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public String getTelefonnr(){
        return telefonnr;
    }

    public void setTelefonnr(String telefonnr){
        this.telefonnr = telefonnr;
    }

    public void ut(){
        String ut = "Navn: "+getFornavn()+" "+getEtternavn()+"\nAdresse: "+getAdresse()+"\nTelefonnr: "+getTelefonnr();
        JOptionPane.showMessageDialog(null, ut);
    }
}

public class Oppgave1 {
    public static void main(String[] args){
        //Person Seb = new Person(JOptionPane.showInputDialog("Fornavn"),JOptionPane.showInputDialog("Etternavn"),JOptionPane.showInputDialog("Adresse"),JOptionPane.showInputDialog("Telefonnr"));
        Person Seb = new Person("","","","");
        Seb.setFornavn(JOptionPane.showInputDialog("Fornavn"));
        Seb.setEtternavn(JOptionPane.showInputDialog("Etternavn"));
        Seb.setAdresse(JOptionPane.showInputDialog("Adresse"));
        Seb.setTelefonnr(JOptionPane.showInputDialog("Telefonnr"));
        //String ut = "Navn: "+Seb.getFornavn()+" "+Seb.getEtternavn()+"\nAdresse: "+Seb.getAdresse()+"\nTelefonnr: "+Seb.getTelefonnr();
        //JOptionPane.showMessageDialog(null, ut);
        Seb.ut();
    }
}