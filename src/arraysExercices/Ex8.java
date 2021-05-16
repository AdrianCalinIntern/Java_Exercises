package arraysExercices;

import java.util.ArrayList;
import java.util.Collections;

public class Ex8 {
    // Write a Java program to reverse elements in a array list.
    // Check available methods in Collections class.
    public static void main(String[] args) {

        ArrayList<Integer> newArrayList = new ArrayList<>();
        newArrayList.add(1);
        newArrayList.add(2);
        newArrayList.add(3);
        newArrayList.add(4);
        newArrayList.add(5);
        newArrayList.add(6);
        newArrayList.add(7);

        System.out.println(newArrayList);
        Collections.reverse(newArrayList);
        System.out.println(newArrayList);




    }
}
