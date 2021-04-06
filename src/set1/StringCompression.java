package set1;
/*
6.	Write a Java program to create a basic string compression method using the counts of repeated characters.
    Enter a string (you can include space as well):
    aaaabbbbcccccddddeeeeaa
    The compressed string along with the counts of repeated characters is:
    a4b4c5d4e4a2

 */

import java.util.ArrayList;
import java.util.Scanner;

public class StringCompression {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string: ");
        stringCompression(scanner.next());
    }

    public static void stringCompression(String userString) {
        for (int i = 0; i < userString.length(); i++) {
            int count = 0;
            while (i < userString.length() - 1 && userString.charAt(i) == userString.charAt(i + 1)) {
                count++;
                i++;
            }

            if (count == 1) {
                System.out.print(userString.charAt(i));
            } else {
                System.out.print(userString.charAt(i));
                System.out.print(count);
            }

        }
    }
}

