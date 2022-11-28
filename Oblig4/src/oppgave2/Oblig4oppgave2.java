package oppgave2;
class SjekkArray{
    public static int summer(int tall1, int tall2, int[] array){
        int sum = 0;
        //Hvis det første tallet er minst
        if (tall1<tall2){
            try {
                while(tall1 <= tall2) {
                    sum += array[tall1];
                    tall1++;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                return sum;
            }
        }
        //Hvis det første tallet er størst
        else if(tall1>tall2){
            try {
                while (tall2 <= tall1) {
                    sum += array[tall2];
                    tall2++;
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                return sum;
            }
        }
        return sum;
    }

    public static boolean arrayLike(int[] array1, int[] array2){
        if (array1.length == array2.length){
            for (int i = 0; i<array1.length; i++){
                if (array1[i] != array2[i]){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean arrayEksisterer(int[] array, int tall){
        for (int i : array){
            if (i == tall){
                return true;
            }
        }
        return false;
    }
}

public class Oblig4oppgave2 {
    public static void main(String[] args) {
        int[] array1 = {1,2,3,4,5};
        int[] array2 = {1,2,3,4,5};
        int[] array3 = {1,3,5,7,9};
        int tall1 = 7;
        int tall2 = 2;
        int tall3 = 4;

        SjekkArray arrayTest = new SjekkArray();
        //Summerer 3,4 og 5 i array2, returnerer 12
        System.out.println(arrayTest.summer(tall1,tall2,array2));
        //Summerer 5,7 og 9 i array3, returnerer 21
        System.out.println(arrayTest.summer(tall2,tall3,array3));

        //Sjekker om array1 og array2 er like, skal returnere true
        System.out.println(arrayTest.arrayLike(array1,array2));
        //Sjekker om array1 og array3 er like, skal returnere false
        System.out.println(arrayTest.arrayLike(array1,array3));

        //Sjekker om tall1 finnes i array1, skal returnere false
        System.out.println(arrayTest.arrayEksisterer(array1, tall1));
        //Sjekker om tall2 finnes i array1, skal returnere true
        System.out.println(arrayTest.arrayEksisterer(array1, tall2));
    }
}