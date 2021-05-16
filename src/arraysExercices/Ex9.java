package arraysExercices;
//Write a Java program to empty an array list and write another program to test if the array list is empty.

import java.util.ArrayList;

public class Ex9 {
    public static void main(String[] args) {

        //Declaring the array list
        ArrayList<Integer> firstArrayList = new ArrayList<>();
        firstArrayList.add(1);
        firstArrayList.add(2);
        firstArrayList.add(3);
        firstArrayList.add(4);

        firstArrayList.clear();

        //check is the array list is empty
        if (firstArrayList.isEmpty()){
            System.out.println("empty list");
        };
    }
}
