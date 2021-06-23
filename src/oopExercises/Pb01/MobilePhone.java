package oopExercises.Pb01;

import java.util.ArrayList;

public class MobilePhone {
    private static ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    public static ArrayList<Contacts> getContacts() {

        return contactsArrayList;
    }



    public static void addContact(Contacts contact) {
        boolean isUnique = contactUniqueValidation(contact);

        if(isUnique) {
            contactsArrayList.add(contact);
            System.out.println("\nThe contact was successfully added\n");
        }
        else
            System.out.println("Name: " +  contact.getName() + " already exists");
    }



    public static void updateContact(Contacts updatedContact, int index){
        boolean isUnique = contactUniqueValidation(updatedContact);

        if(index < contactsArrayList.size() && isUnique) {
            contactsArrayList.set(index, updatedContact);
            System.out.println("\nThe contact was successfully updated\n");
        }

        else if(index > contactsArrayList.size())
            System.out.println("The position" + index + "is not valid");

        else if(!isUnique)
            System.out.println("Name: " +  updatedContact.getName() + " already exists");
    }



    public static void printContacts(){
        for (int i = 0; i<contactsArrayList.size();i=i+1){
            System.out.println( i + " " +  contactsArrayList.get(i).getName() + ", " + contactsArrayList.get(i).getPhoneNumber());
        }
    }



    public static boolean contactUniqueValidation(Contacts contact) {
        boolean isUnique = true;
        for (int i = 0; i < contactsArrayList.size(); i++) {
            if (contactsArrayList.get(i).getName().equals(contact.getName())) {
                isUnique = false;
            }
        }
        return isUnique;
    }

}
