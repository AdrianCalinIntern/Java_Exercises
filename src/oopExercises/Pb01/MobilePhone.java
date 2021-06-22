package oopExercises.Pb01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobilePhone {
    private ArrayList<Contacts> contactsArrayList = new ArrayList<Contacts>();

    public ArrayList<Contacts> getContacts() {
        return contactsArrayList;
    }

    public void setContacts(ArrayList<Contacts> contacts) {
        this.contactsArrayList = contacts;
    }

    public void addContact(Contacts contact){
        if(contactsArrayList.contains(contact)){
            System.out.println("Err");
        }
        else
            contactsArrayList.add(contact);
    }

    public void printContacts(){
        for (int i = 0; i<contactsArrayList.size();i=i+1){
            System.out.println(contactsArrayList.get(i).getName() + ", " + contactsArrayList.get(i).getPhoneNumber());
        }
    }

}
