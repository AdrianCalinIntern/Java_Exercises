package oopExercises.Ex9;

public class Address {
    private String streetName;
    private int streetNumber;

    public Address(String streetName, int streetNumber){
        this.streetName = streetName;
        this.streetNumber = streetNumber;
    }

    @Override
    public String toString() {
        return "Address{" +
                "streetName='" + streetName + '\'' +
                ", streetNumber=" + streetNumber +
                '}';
    }
}
