package oopExercises.Pb01;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Contacts c1 = new Contacts("Adrian","0741422069");
        MobilePhone m1 = new MobilePhone();

        m1.addContact(c1);
        m1.printContacts();
    }
}
