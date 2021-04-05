package set1;
import java.lang.Math;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

/*
Write a Java program to multiply two given integers without using the multiply operator(*).
test
 */

public class MultiplicationTwoIntsWithoutAsterix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the the first number : \n");
            int number1 = scanner.nextInt();
            System.out.print("Enter the the second number : \n");
            int number2 = scanner.nextInt();
            System.out.println(multiplicationCalculator(number1,number2));
        }catch (Exception ex){
            System.out.println("Value is not an int");
        }
    }
    public static int multiplicationCalculator(int number, int howManyTimes){
        int result = 0;
        for (int i = 1; i < howManyTimes; i++){
            result = number = number + howManyTimes;
        }
        return result;
    }
}
