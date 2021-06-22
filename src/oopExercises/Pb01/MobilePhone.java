package oopExercises.Pb01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobilePhone {
    private static ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    public static ArrayList<Contacts> getContacts() {

        return contactsArrayList;
    }

    public static void setContacts(ArrayList<Contacts> contacts) {

        contactsArrayList = contacts;
    }

    public static void addContact(Contacts contact) {
        boolean isUnique = true;
        for (int i = 0; i<contactsArrayList.size();i=i+1){
            if(contactsArrayList.get(i).getName().equals(contact.getName())){
                isUnique = false;
            }
        }
        if(isUnique)
            contactsArrayList.add(contact);
        else
            System.out.println("Name: " +  contact.getName() + " already exists");
    }

    public static void printContacts(){
        for (int i = 0; i<contactsArrayList.size();i=i+1){
            System.out.println(contactsArrayList.get(i).getName() + ", " + contactsArrayList.get(i).getPhoneNumber());
        }
    }

}
