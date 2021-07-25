package oopExercises.Pb01;

import java.util.ArrayList;

public class MobilePhone {
    private ArrayList<Contacts> contactsArrayList = new ArrayList<>();


    public ArrayList<Contacts> getContacts() {

        return contactsArrayList;
    }

    public void addContact(Contacts contact) {

        if(contactUniqueValidation(contact)) {
            contactsArrayList.add(contact);
            System.out.println("\nThe contact was successfully added\n");
        }
        else
            System.out.println("Name: " +  contact.getName() + " already exists");
    }



    public  void updateContact(Contacts updatedContact, int index){
        boolean isUnique = contactUniqueValidation(updatedContact);

        if(index < contactsArrayList.size() && isUnique) {
            contactsArrayList.set(index, updatedContact);
            // un get pe Arraylist current index

            System.out.println("\nThe contact was successfully updated\n");
        }

        else if(index > contactsArrayList.size())
            System.out.println("The position" + index + "is not valid");

        else if(!isUnique)
            System.out.println("Name: " +  updatedContact.getName() + " already exists");
    }



    public void printContacts(){
        for (int i = 0; i<contactsArrayList.size();i=i+1){
            System.out.println(contactsArrayList.get(i).getName() + ", " + contactsArrayList.get(i).getPhoneNumber());
        }
    }



    public boolean contactUniqueValidation(Contacts contact) {
            return !contactsArrayList.contains(contact);
    }

}
