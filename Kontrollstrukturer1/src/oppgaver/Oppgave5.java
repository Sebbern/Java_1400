package oppgaver;

import javax.swing.*;
import java.util.Objects;

public class Oppgave5 {
    public static void main(String[] args){
        String input = JOptionPane.showInputDialog("Skriv inn månedsnavn");

        if (Objects.equals(input, "Juni") || Objects.equals(input, "Juli") || Objects.equals(input, "August")){
            System.out.println("Sommer");
        }
        else if (Objects.equals(input, "September") || Objects.equals(input, "Oktober") || Objects.equals(input, "November")){
            System.out.println("Høst");
        }
        else if (Objects.equals(input, "Desember") || Objects.equals(input, "Januar") || Objects.equals(input, "Februar")){
            System.out.println("Vinter");
        }
        else if (Objects.equals(input, "Mars") || Objects.equals(input, "April") || Objects.equals(input, "Mai")){
            System.out.println("Vår");
        }

        switch (input) {
            case "Juni", "Juli", "August" -> System.out.println("Sommer");
            case "September", "Oktober", "November" -> System.out.println("Høst");
            case "Desember", "Januar", "Februar" -> System.out.println("Vinter");
            case "Mars", "April", "Mai" -> System.out.println("Vår");
        }
    }
}
