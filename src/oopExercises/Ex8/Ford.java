package oopExercises.Ex8;

public class Ford extends Car {

    private int year;
    private double manufacturerDiscount;

    public Ford(int speed, double regularPrice, String color, int year, int manufacturerDiscount){
        super(speed, regularPrice, color);
        this.year = year;
        this.manufacturerDiscount = manufacturerDiscount;
    }

    @Override
    public double getSalePrice() {
        return getRegularPrice() - (getRegularPrice() * manufacturerDiscount)/100;
    }

    @Override
    public String toString() {
        return "Ford : " +
                "Speed=" + getSpeed() +
                ", Color=" + getColor() +
                ", Year=" + year +
                ", Manufacturer Discount=" + manufacturerDiscount +
                ", RegularPrice=" + getRegularPrice() +
                ", Sale Price =" + getSalePrice();
    }
}
