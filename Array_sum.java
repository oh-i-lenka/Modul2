import javax.xml.soap.SAAJMetaFactory;

/**
 * Created by Olena on 03.11.2016.
 */
public class Array_sum {
    public static void main(String[] args) {
        int[] arrayInt={978, -7, 27, -7, 47, 97, 72, 71, 70, -7};
        double[] arrayDouble= {1,2,89, 580, -85, 900, -9000, 0, 78, -789};
       /* int[] arrayInt = (int[]) arrayDouble;*/
        /*double[] arrayDouble = (double[]) arrayInt;*/
        sum (arrayInt);
        sum(arrayDouble);
        minElement(arrayInt);
        maxElement(arrayInt);
        maxPositiv(arrayInt);
        multiplication(arrayInt);
        modulus(arrayInt);
        secondLargest(arrayDouble);
    }

    static void sum (int array[]){
        int sumAll=0;
        for (int i=0; i<=9; i++){
            sumAll+= array[i];
        }
        System.out.println(sumAll);


    }

    static void sum (double array[]){
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

    static void minElement (double array[]){
        double min = array[0];
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

    static void maxElement (double array[]){
        double max = array[0];
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
            if ((array[i]>0) && (maxPos < array[i])){
                maxPos = array[i];
            }
        }
        if (maxPos == 0){
            System.out.println("There are no any positive elements in array");
        } else {
            System.out.println(maxPos);
        }

    }

    static void maxPositiv (double array[]){
        double maxPos = 0;
        for (int i=0; i<=9; i++){
            if ((array[i]>0) && (maxPos < array[i])){
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

    static void multiplication (double array[]){
        double multi = array[0];
        for (int i=1; i<=9; i++){
            multi*= array[i];
        }
        System.out.println(multi);

    }

    static void modulus (int array[]){
        int mod = array[9] % array[0];
        System.out.println(mod);

    }

    static void modulus (double array[]){
        double mod = array[9] % array[0];
        System.out.println(mod);

    }

    static void secondLargest (int array[]){
        int max, secMax;
        max = secMax = array [0];
        int i = 1;
        while ((max == secMax) && (i <= 9)) {
            if (array[i] != max){
                secMax = array[i];
            }
            i++;
        }

        for (i=1; i<=9; i++){
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

    static void secondLargest (double array[]){
        double max, secMax;
        max = secMax = array [0];
        int i = 1;
        while ((max == secMax) && (i <= 9)) {
            if (array[i] != max){
                secMax = array[i];
            }
            i++;
        }

        for (i=1; i<=9; i++){
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
