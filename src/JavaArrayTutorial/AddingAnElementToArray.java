package JavaArrayTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddingAnElementToArray {
    public static void main(String[] args) {
        Integer[] initialArray = {1,2,3,4}; // This is the initial array
        System.out.println(Arrays.toString(initialArray));

        List<Integer>initialArrayConverted = new ArrayList<Integer>(Arrays.asList(initialArray)); //Convert the array to arrayList
        initialArrayConverted.add(5);

        initialArray = initialArrayConverted.toArray(initialArray);
        System.out.println(Arrays.toString(initialArray));

    }
}
