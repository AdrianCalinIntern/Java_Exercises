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

    public static void validateThePassword(String userPassword){
        int  digitsCount = 0;
        int charactersCount = 0;
        for(int i=0; i<userPassword.length();i++){
            Character character = userPassword.charAt(i);
            if(Character.isDigit(character)){
                digitsCount = digitsCount + 1;
            }
            if(Character.isAlphabetic(character)){
                charactersCount = charactersCount + 1;
            }
        }
        if(charactersCount >= 10 && digitsCount >= 2){
            System.out.println("Valid password");
        }else{
            System.out.println("invalid password");
        }
    }
}