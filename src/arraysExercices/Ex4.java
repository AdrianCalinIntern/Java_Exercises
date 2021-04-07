package arraysExercices;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex4 {
    // Write a Java program to insert an element (specific position) into an array. Old value needs to go on the next
    // position.
    public static void main(String[] args) {
        Integer[] testArray = {1,2,3,4};
        System.out.println(Arrays.toString(testArray));

        ArrayList<Integer> convertedArray = new ArrayList<>(Arrays.asList(testArray));
        int position = 4;
        int element = 98;

        if(position <= convertedArray.size()) {
            convertedArray.add(position, element);
            testArray = convertedArray.toArray(testArray);
            System.out.println(Arrays.toString(testArray));
        }else {
            System.out.println("Invalid position");
        }






    }
}
