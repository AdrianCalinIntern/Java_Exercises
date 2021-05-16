package arraysExercices;

import java.util.Arrays;

public class Ex1 {
    public static void main(String[] args) {
        /*
        Write a Java program to sort a numeric array and a string array.
        Check available Arrays methods.

        I used sort method;
         */

        int[] numericArray = {2,4,7,9,8,1,0,9};
        String[] stringArray = {"aaa", "ddd", "kkk", "bbb"};

        Arrays.sort(numericArray);
        System.out.println(Arrays.toString(numericArray));

        Arrays.sort(stringArray);
        System.out.println(Arrays.toString(stringArray));
    }
}
