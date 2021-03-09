package set1;
import java.util.Scanner;

public class PaswordValidation {
/*
1.	Write a Java method to check whether a string is a valid password.
    Password rules:
	a password must have at least ten characters.
	a password must contain at least two digits.
 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the password:");
        String userPassword = scanner.next();
        validateThePassword(userPassword);

    }
    public static void validateThePassword(String userPassword) {
        if (userPassword.matches(".*\\d\\d.*") && userPassword.length() >= 10) {
            System.out.println("You chose a good password");
        }
        else{
            System.out.println("The password is not valid");
        }



    }




}