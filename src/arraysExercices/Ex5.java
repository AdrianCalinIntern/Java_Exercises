package arraysExercices;

//Write a Java program to find the common elements between two arrays (string values).
// Use two for loops to cover every element in the arrays.

public class Ex5 {
    public static void main(String[] args) {
        String[] firstArray = {"Tst", "my", "Test33", "Test75", "445", "Hy", "I", "Java", "Java", "Language"};
        String[] secondArray = {"is", "T3st2", "Java"};

        for (int i = 0; i<firstArray.length; i++){
           for (int y = 0; y<secondArray.length;y++){
               if(firstArray[i].equals(secondArray[y])){
                   System.out.println("Element found in both arrays: " + firstArray[i]);
               }
           }
        }
    }
}
