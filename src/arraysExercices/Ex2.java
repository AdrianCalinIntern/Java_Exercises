package arraysExercices;

// Write a Java program to sum values of an array.

public class Ex2 {
    public static void main(String[] args) {
        int[] numericArray = {2,4,7,0, 1};

        int result = 0;
        for (int i=0; i<numericArray.length;i++){
            result = result + numericArray[i];
        }

        System.out.println(result);
    }
}
