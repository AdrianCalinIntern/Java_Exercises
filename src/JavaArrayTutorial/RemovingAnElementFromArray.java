package JavaArrayTutorial;

import java.util.*;

public class RemovingAnElementFromArray {
    public static void main(String[] args) {
        Integer[] testArray = {1,2,3,4};
        System.out.println(Arrays.toString(testArray));

        Collections.reverse(Arrays.asList(testArray));
        System.out.println(Arrays.asList(testArray));
    }
}
