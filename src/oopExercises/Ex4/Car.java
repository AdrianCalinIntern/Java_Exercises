package oopExercises.Ex4;

public class Car {

    /*
    Create a base class called Car.
    It should have a few fields that would be appropriate for a generic Car class (as engine, cylinders, wheels etc.).
    Constructor should initialize cylinders (number of) and name and set wheels to 4 and engine to true.
    Cylinders and names will be passed parameters.
    Create appropriate getters.
    Create some methods like start engine, accelerate and brake.
    Show a message for each in the base class.
    Now create 3 subclasses for your favorite vehicles.
    Overwrite the appropriate methods to demonstrate polymorphism in use.
     */

    private int cylinders;
    private String name;
    private boolean engine;
    private int wheels;

    public Car(int cylinders, String name){
        this.cylinders = cylinders;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public int getWheels() {
        return wheels;
    }

    public boolean isEngine() {
        return engine;
    }

    //Methods
    public String startEngine(){
        return "Generic - Engine started";
    }

    public String accelerate(){
        return "Generic - Accelerate";
    }

    public String brake(){
        return "Generic - Brake";
    }

    @Override
    public String toString() {
        return "Cylinder: " + this.getCylinders() + "\n" +
                "Name: " + this.getName() + "\n" +
                "Wheels: " + this.getWheels() + "\n" +
                "Engine: " + this.isEngine() + "\n";
    }
}
