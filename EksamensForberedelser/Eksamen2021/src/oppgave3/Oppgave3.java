package oppgave3;

class maxmin{
    public int storst(int[] array){
        int storstTall = 0;
        for (int i: array){
            if (i > storstTall){
                storstTall = i;
            }
        }
        return storstTall;
    }

    public int minst(int[] array){
        int minstTall = 0;
        for (int i = 0; i<array.length; i++){
            if (i == 0) {
                minstTall = array[i];
            }

            else if (minstTall > array[i]){
                minstTall = array[i];
            }
        }
        return minstTall;
    }
}

public class Oppgave3 {
    public static void main(String[] args) {
        int[] arrayTest = {6,2,4,9,5};
        maxmin test = new maxmin();
        System.out.println(test.storst(arrayTest));
        System.out.println(test.minst(arrayTest));
    }
}
