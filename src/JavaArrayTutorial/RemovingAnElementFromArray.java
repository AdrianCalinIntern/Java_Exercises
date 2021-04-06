package JavaArrayTutorial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemovingAnElementFromArray {
    public static void main(String[] args) {
        Integer[] testArray = {1,2,3,4};
        System.out.println(Arrays.toString(testArray));

        List<Integer>testArrayConverted = new ArrayList<Integer>(Arrays.asList(testArray));

        int index = 1;
        if(testArrayConverted.contains(index)){
            testArrayConverted.remove(index);
        }

        testArray = testArrayConverted.toArray(testArray);
        System.out.println(Arrays.toString(testArray));
    }
}
