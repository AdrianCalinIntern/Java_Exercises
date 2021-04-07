package arraysExercices;

import java.util.ArrayList;

public class Ex7 {
    // Write a Java program to iterate through all elements in a array list and print them.
    public static void main(String[] args) {
        ArrayList<Integer> myArray = new ArrayList<>();
        myArray.add(1);
        myArray.add(2);
        myArray.add(3);
        myArray.add(4);
        myArray.add(5);
        myArray.add(6);
        myArray.add(7);

        for (int i = 0; i<myArray.size(); i++){
            System.out.println(myArray.get(i));
        }

    }
}
