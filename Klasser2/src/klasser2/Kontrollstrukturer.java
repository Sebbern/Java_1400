package klasser2;

public class Kontrollstrukturer {
    public static void main(String[] args){
        String ukedag = "onsdag";
        switch (ukedag){
            case "mandag":
                System.out.print("Det er første dag i uken \n");
                break;
            case "tirsdag":
                System.out.print("Det er andre dag i uken \n");
                break;
            case "onsdag":
                System.out.print("Det er tredje dag i uken \n");
                break;
            case "torsdag":
                System.out.print("Det er fjerde dag i uken \n");
                break;
            case "fredag":
                System.out.print("Det er femte dag i uken \n");
                break;
            case "lørdag":
            case "søndag":
                System.out.print("Det er helg! \n");
                break;
            default:
                System.out.print("Det er ikke en ukedag! \n");
                break;

        }
    }
}
