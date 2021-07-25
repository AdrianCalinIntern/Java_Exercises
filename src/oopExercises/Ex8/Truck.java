package oopExercises.Ex8;
/*
Create a sub class of Car class and name it as Truck.

The Truck class has the following fields and methods.
◦int weight;
◦double getSalePrice();//If weight>2000,10%discount.Otherwise,20%discount.

 */


public class Truck extends Car {
    public double weight;

    public Truck(int speed, double regularPrice, String color, int weight ){
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        double finalPrice;
        if(weight >= 2000){
           finalPrice = getRegularPrice() - (getRegularPrice() * 10)/100;
        } else{
            finalPrice = getRegularPrice() - (getRegularPrice() * 20)/100;
        }
        return finalPrice;
    }

    @Override
    public String toString() {
        return "Truck : " +
                "Speed=" + getSpeed() +
                ", Color=" + getColor() +
                ", Weight=" + weight +
                ", RegularPrice=" + getRegularPrice() +
                ", Sale Price =" + getSalePrice();
    }
}
