package oopExercises.Ex8;
/*
Create a super class called Car.
The Car class has the following fields and methods.
- int speed;
- double regularPrice;
- String color;
- double getSalePrice();
 */

public class Car {
    private int speed;
    private double regularPrice;
    private String color;

    public Car(int speed, double regularPrice, String color){
        this.speed = speed;
        this.regularPrice = regularPrice;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public double getRegularPrice() {
        return regularPrice;
    }

    public String getColor() {
        return color;
    }

    public double getSalePrice(){
        return 0.0;
    }

    @Override
    public String toString() {
        return "Car{" +
                "speed=" + speed +
                ", regularPrice=" + regularPrice +
                ", color='" + color + '\'' +
                '}';
    }
}
