import javax.xml.soap.SAAJMetaFactory;

/**
 * Created by Olena on 03.11.2016.
 */
public class Array_sum {
    public static void main(String[] args) {
        int[] arrayInt={978, 8000, 27, -7, 47, 97, 72, 71, 70, -7};
        double[] arrayDouble= {1,2,89, 580, -85, 900, -9000, 0, 78, -789};
        sum (arrayInt);
        sum(arrayDouble);
        minElement(arrayInt);
        maxElement(arrayInt);
        maxPositiv(arrayInt);
        multiplication(arrayInt);
        modulus(arrayInt);
        secondLargest(arrayInt);
    }

    static void sum (int array[]){
        int sumAll=0;
        for (int i = 0; i < array.length; i++){
            sumAll+= array[i];
        }
        System.out.println("Array's summ  is "+sumAll);
    }

    static void sum (double array[]){
        double sumAll = 0;
        for (int i = 0; i < array.length; i++){
            sumAll += array[i];
        }
        System.out.println("Array's summ  is "+sumAll);
    }

    static void minElement (int array[]){
        int min = array[0];
        for (int i = 0; i < (array.length-1); i++){
            if ((array[i]>array[i+1]) && (min > array[i+1])){
                min = array[i+1];
            }
        }
        System.out.println("Array's minimum element  is "+min);
    }

    static void minElement (double array[]){
        double min = array[0];
        for (int i = 0; i < (array.length-1); i++){
            if ((array[i]>array[i+1]) && (min > array[i+1])){
                min = array[i+1];
            }
        }
        System.out.println("Array's minimum element  is "+min);
    }

    static void maxElement (int array[]){
        int max = array[0];
        for (int i = 0; i < (array.length-1); i++){
            if ((array[i] < array[i+1]) && (max < array[i+1])){
                max = array[i+1];
            }
        }
        System.out.println("Array's maximum element  is "+max);
    }

    static void maxElement (double array[]){
        double max = array[0];
        for (int i = 0; i <= 8; i++){
            if ((array[i] < array[i+1]) && (max < array[i+1])){
                max = array[i+1];
            }
        }
        System.out.println("Array's maximum element  is "+max);
    }

    static void maxPositiv (int array[]){
        int maxPos = 0;
        for (int i = 0; i < array.length; i++){
            if ((array[i] > 0) && (maxPos < array[i])){
                maxPos = array[i];
            }
        }
        if (maxPos == 0){
            System.out.println("There are no any positive elements in array");
        } else {
            System.out.println("Array's maximum positive element  is " + maxPos);
        }
    }

    static void maxPositiv (double array[]){
        double maxPos = 0;
        for (int i = 0; i < array.length; i++){
            if ((array[i] > 0) && (maxPos < array[i])){
                maxPos = array[i];
            }
        }
        if (maxPos == 0){
            System.out.println("There are no any positive elements in array");
        } else {
            System.out.println("Array's maximum positive element  is " + maxPos);
        }
    }

    static void multiplication (int array[]){
        int multi = array[0];
        for (int i = 1; i < array.length; i++){
            multi*= array[i];
        }
        System.out.println("Multiplikation all array's elements is " + multi);
    }

    static void multiplication (double array[]){
        double multi = array[0];
        for (int i = 1; i < array.length; i++){
            multi*= array[i];
        }
        System.out.println("Multiplikation all array's elements is " + multi);
    }

    static void modulus (int array[]){
        int mod = array[(array.length-1)] % array[0];
        System.out.println("Division by mod last and first elements" + mod);
    }

    static void modulus (double array[]){
        double mod = array[(array.length-1)] % array[0];
        System.out.println("Division by mod last and first elements" + mod);
    }

    static void secondLargest (int array[]){
        int max, secMax;
        max = secMax = array [0];
        int i = 1;
        while ((max == secMax) && (i < array.length)) {
            if (array[i] != max){
                secMax = array[i];
            }
            i++;
        }
        for (i = 1; i < array.length; i++){
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
        } else System.out.println("Second largest element is " + secMax);
    }

    static void secondLargest (double array[]){
        double max, secMax;
        max = secMax = array [0];
        int i = 1;
        while ((max == secMax) && (i < array.length)) {
            if (array[i] != max){
                secMax = array[i];
            }
            i++;
        }

        for (i = 1; i < array.length; i++){
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
        } else System.out.println("Second largest element is " + secMax);
    }
}
