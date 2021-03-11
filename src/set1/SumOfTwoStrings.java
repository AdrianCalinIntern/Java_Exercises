package set1;

/*
Write a Java program to Given two non-negative integers num1 and num2 represented as string,
return the sum of num1 and num2.
 */

import java.util.Scanner;

public class SumOfTwoStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: \n");
        String theFirstNumber = scanner.next();

        System.out.print("Enter the second number: \n");
        String theSecondNumber = scanner.next();

        int result = sumCalculator(theFirstNumber,theSecondNumber);
        if(result == -1){
            System.out.println("Invalid input");
        }else
            System.out.println(result);
    }

    public static int sumCalculator(String theFirstNumber, String theSecondNumber){
        int firstNumber = Integer.parseInt(theFirstNumber);
        int secondNumber = Integer.parseInt(theSecondNumber);
        if(firstNumber >=0 && secondNumber >=0){
            return firstNumber + secondNumber;
        }else{
            return -1;
        }
    }
}
