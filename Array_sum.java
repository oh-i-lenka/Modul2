import javax.xml.soap.SAAJMetaFactory;

/**
 * Created by Olena on 03.11.2016.
 */
public class Array_sum {
    public static void main(String[] args) {
        /*int[] array = new int[10];
        array [0] = 1;
        array [1] = 200;*/
        int[] arrayInt={90, 900, 1, -1, 1, 1, -1, 701, -6, 9};
        double[] arrayDouble= {1,2,89, 580, -85, 900, -9000, 0, 78, -789};
        /*int[] arrayInt = (int[]) arrayDouble;*/
       /* double[] arrayDouble = (double[]) array;*/
        /*sum (arrayInt);
        sumDoouble(arrayDouble);
        minElement(arrayInt);
        maxElement(arrayInt);
        maxPositiv(arrayInt);
        multiplication(arrayInt);
        modulus(arrayInt);*/
        secondLargest(arrayInt);
    }
    static void sum (int array[]){
        int sumAll=0;
        for (int i=0; i<=9; i++){
            sumAll+= array[i];
        }
        System.out.println(sumAll);


    }

    static void sumDoouble (double array[]){
        double sumAll=0;
        for (int i=0; i<=9; i++){
            sumAll+= array[i];
        }
        System.out.println(sumAll);

    }

    static void minElement (int array[]){
        int min = array[0];
        for (int i=0; i<=8; i++){
            if ((array[i]>array[i+1]) && (min > array[i+1])){
                min = array[i+1];
            }
        }
        System.out.println(min);

    }

    static void maxElement (int array[]){
        int max = array[0];
        for (int i=0; i<=8; i++){
            if ((array[i]<array[i+1]) && (max < array[i+1])){
                max = array[i+1];
            }
        }
        System.out.println(max);

    }

    static void maxPositiv (int array[]){
        int maxPos = 0;
        for (int i=0; i<=9; i++){
            if (((array[i])>0) && (maxPos < array[i])){
                maxPos = array[i];
            }
        }
        if (maxPos == 0){
            System.out.println("There are no any positive elements in array");
        } else {
            System.out.println(maxPos);
        }

    }

    static void multiplication (int array[]){
        int multi = array[0];
        for (int i=1; i<=9; i++){
            multi*= array[i];
        }
        System.out.println(multi);

    }

    static void modulus (int array[]){
        int mod = array[9] % array[0];
        System.out.println(mod);

    }

    static void secondLargest (int array[]){
        int max, secMax;
        if (array[0]>array[1]){
            max = array[0];
            secMax = array [1];
        } else {
            max = array[1];
            secMax = array [0];
        }
        for (int i=2; i<=9; i++){
            if (max < array[i]){
                secMax = max;
                max = array[i];
            } else {
                if ((secMax < array[i]) && (array[i] != max)) {
                    secMax = array[i];
                }
            }
        }
        if (max == secMax) {
            System.out.println("All elements in array are equal");
        } else System.out.println(secMax);


    }
}
