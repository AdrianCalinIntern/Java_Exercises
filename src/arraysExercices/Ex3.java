package arraysExercices;
//Write a Java program to calculate the average value of array elements.

public class Ex3 {
    public static void main(String[] args) {
        int[] intArray = {5,5,5};

        int sum = 0;
        for (int i = 0; i<intArray.length; i++){
            sum = sum + intArray[i];
        }

        System.out.println(sum/intArray.length);
    }
}
