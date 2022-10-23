package arrays2;

public class Eksempel1 {
    public static void main(String[] args) {
        int [][] tabell = new int[3][3];
        tabell[0][0] = 1;
        tabell[0][1] = 2;
        tabell[0][2] = 3;
        tabell[1][0] = 2;
        tabell[1][1] = 4;
        tabell[1][2] = 6;
        tabell[2][0] = 4;
        tabell[2][1] = 8;
        tabell[2][2] = 12;
        int[][] tabell1 = {{1,2,3,},{2,4,6},{4,8,12}};
        for (int i = 0; i<3; i++){
            for (int j=0; j<3; j++){
                System.out.print(tabell1[i][j]+" ");
            }
            System.out.println();
        }

        for (int [] liste : tabell1){
            for (int tall : liste){
                System.out.print(tall+"\t");
            }
            System.out.println();
        }




    }
}
