package oppgaver;

import javax.swing.*;

class Klokke{
    private int time;
    private int minutter;
    private int sekunder;

    public Klokke(int time, int minutter, int sekunder){
        this.time = time;
        this.minutter = minutter;
        this.sekunder = sekunder;
    }

    public int getTime(){
        return time;
    }

    public int getMinutter() {
        return minutter;
    }

    public int getSekunder() {
        return sekunder;
    }

    public void setTime(int time) {
        if(getTime() >= 0 && getTime() <= 23){
            this.time = time;
        }
    }

    public void setMinutter(int minutter) {
        if(getMinutter() >= 0 && getMinutter() <= 59) {
            this.minutter = minutter;
        }
    }

    public void setSekunder(int sekunder) {
        if(getSekunder() >= 0 && getSekunder() <= 59) {
            this.sekunder = sekunder;
        }
    }

    public void visTiden(){
        System.out.print(getTime()+" : "+getMinutter()+" : "+getSekunder());
    }
}

public class Oppgave4 {
    public static void main(String[] args){
        Klokke Seb = new Klokke(0,0,0);
        Seb.setTime(Integer.parseInt(JOptionPane.showInputDialog("Time")));
        Seb.setMinutter(Integer.parseInt(JOptionPane.showInputDialog("Minutter")));
        Seb.setSekunder(Integer.parseInt(JOptionPane.showInputDialog("Sekunder")));
        Seb.visTiden();
    }
}
