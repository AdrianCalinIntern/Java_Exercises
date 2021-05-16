package JavaArrayTutorial;
import java.util.Arrays;

//https://www.softwaretestinghelp.com/java/introduction-to-java-arrays-and-related-concepts/
public class JavaArrayCreation_Initialization {
    public static void main(String[] args) {
        int[] MyArray; // array declaration
        MyArray = new int[5]; //array initialization
        MyArray[0] = 1;
        MyArray[1] = 2;
        MyArray[2] = 3;

        //System.out.println(Arrays.toString(MyArray));
        for (int i = 0; i < MyArray.length; i++){
            System.out.println(i);
        }
        System.out.println("Array Size: " + MyArray.length);

        int[] MyArray2 = {1,2,3,4,5,6,7,8,9,0};
        String[] MyArray3 = {"Test1", "Test2", "Test3", "Test4"};

        System.out.println(Arrays.toString(MyArray2));
        System.out.println(Arrays.toString(MyArray3));
    }
}
