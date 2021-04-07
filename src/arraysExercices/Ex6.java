package arraysExercices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex6 {
    // Write a Java program to convert an array to ArrayList.
    public static void main(String[] args) {
        Integer[] testArray = {1,2,3,4,5};

        List<Integer> arrayConverted = new ArrayList<Integer>(Arrays.asList(testArray));
        System.out.println(arrayConverted);
    }
}
