package oopExercises.Ex9;

public class Person {
    private String name;
    private int age;
    private Address address;

    public Person (String name, int age, Address address){
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", address=" + address +
                '}';
    }
}
