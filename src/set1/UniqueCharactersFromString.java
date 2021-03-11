package set1;

/*
5.Write a Java program to check if a given string has all unique characters.
Sample Output: Original String : xyyz
String has all unique characters: false
 */

import java.util.Scanner;

public class UniqueCharactersFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the String : \n");
        String userInput = scanner.next();

        boolean result = hasTheStringHasUniqueCharacters(userInput);
        System.out.println(result);
    }

    public static boolean hasTheStringHasUniqueCharacters(String userInput){
        for (int firstPosition = 0; firstPosition< userInput.length(); firstPosition ++){
            for (int secondPosition = firstPosition + 1; secondPosition<userInput.length();secondPosition++){
                if(userInput.charAt(firstPosition) == userInput.charAt(secondPosition)){
                    return false;
                }
            }
        }
        return true;
    }
}

