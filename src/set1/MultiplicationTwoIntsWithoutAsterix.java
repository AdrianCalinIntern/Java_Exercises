package set1;
import java.lang.Math;
import java.util.Scanner;

public class MultiplicationTwoIntsWithoutAsterix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the the first number : \n");
        int number1 = scanner.nextInt();

        System.out.print("Enter the the second number : \n");
        int number2 = scanner.nextInt();

        int multiplicationOutput = multiplicationCalculator(number1,number2);
        System.out.println("Result: " + multiplicationOutput);

    }
    public static int multiplicationCalculator(int number1, int number2){
        return Math.multiplyExact(number1,number2);
    }
}
