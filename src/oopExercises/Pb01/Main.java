package oopExercises.Pb01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while(true){
            options();
            int choice = scanner.nextInt();

            switch(choice){
                case 0:
                    System.exit(0);
                    break;
                case 1:
                    if(MobilePhone.getContacts().isEmpty()){
                        System.out.println("\n***************************\n");
                        System.out.println("Contact list is empty \n");
                        System.out.println("\n***************************\n");
                    }
                    else
                    {
                        System.out.println("\n***************************\n");
                        MobilePhone.printContacts();
                        System.out.println("\n***************************\n");
                    }
                    break;
                case 2:
                    System.out.println("\n***************************\n");
                    System.out.println("First name: ");
                    String firstName = scanner.next();
                    System.out.println("Phone number: ");
                    String  phoneNumber = scanner.next();
                    Contacts c1 = new Contacts(firstName,phoneNumber);

                    MobilePhone.addContact(c1);
                    System.out.println("\n***************************\n");
                    break;
                case 3:

                    System.out.println("\n***************************\n");
                    System.out.println("Index value: ");
                    int index = scanner.nextInt();
                    System.out.println("New value - First name: ");
                    String updatedFirstName = scanner.next();
                    System.out.println("New value  - Phone number: ");
                    String  updatedPhoneNumber = scanner.next();
                    Contacts c2 = new Contacts(updatedFirstName,updatedPhoneNumber);

                    MobilePhone.updateContact(c2,index);
                    break;
            }
        }




    }
    static void options() {
        System.out.println("0. Quit");
        System.out.println("1. Print list of contacts");
        System.out.println("2. Add new contact");
        System.out.println("3. Update existing contact");
        System.out.println("4. Remove contact and search/find contact");
    }

}
