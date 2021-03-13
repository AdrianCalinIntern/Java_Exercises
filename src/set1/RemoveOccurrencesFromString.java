package set1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;

/*
Write a Java program to remove all occurrences of a specified value in a given array of integers and return the
new array. There can be duplicates in the array.

 */
public class RemoveOccurrencesFromString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Array size: ");
        ArrayList inputs = createArray(scanner.nextInt());
        printArrayList(inputs);

        System.out.println("\nElement to remove: ");
        ArrayList outputAfterRemove = removeTheElements(scanner.nextInt(), inputs);
        printArrayList(outputAfterRemove);

    }
    public  static ArrayList createArray(int size){
        Scanner scanner = new Scanner(System.in);
        ArrayList <Integer> userInput = new ArrayList<Integer>();
        for (int i = 0; i<size;i++){
            System.out.println("Element" + i + ": ");
            userInput.add(scanner.nextInt());
        }
        return userInput;
    }

    public static ArrayList removeTheElements(int element, ArrayList initialArrayList){
        initialArrayList.removeAll(Arrays.asList(element));
        return initialArrayList;
    }

    public static void printArrayList(ArrayList arrayListToPrint){
        System.out.println("\nArray output: ");
        for (int i = 0; i<arrayListToPrint.size();i++){
            System.out.print("Index " + i + ": " + arrayListToPrint.get(i)+ " \n");
        }
    }
}