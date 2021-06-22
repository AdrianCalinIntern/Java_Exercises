package oopExercises.Ex9;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {

        HashMap<Person, Integer> hash_map = new HashMap<Person, Integer>();

        Address a1 = new Address("New star",12);
        Person p1 = new Person("Adi",20,a1);
        Person p2 = new Person("Adi",20,a1);

        hash_map.put(p1, 1);
        hash_map.put(p2, 2);


        System.out.println(hash_map);
        System.out.println(hash_map.get(p1));
        System.out.println(hash_map.get(p2));
    }
}
