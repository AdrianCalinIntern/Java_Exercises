package oopExercises.Ex8;

public class Sedan extends Car{

    private int length;

    public Sedan (int speed, double regularPrice, String color, int length){
        super(speed, regularPrice, color);
        this.length = length;
    }

    @Override
    public double getSalePrice() {
        double finalPrice;
        if (length > 20){
            finalPrice = getRegularPrice() - (getRegularPrice() * 5)/100;
        } else{
            finalPrice = getRegularPrice() - (getRegularPrice() * 10)/100;
        }
        return finalPrice;
    }

    @Override
    public String toString() {
        return "Sedan : " +
                "Speed=" + getSpeed() +
                ", Color=" + getColor() +
                ", Length=" + length +
                ", RegularPrice=" + getRegularPrice() +
                ", Sale Price =" + getSalePrice();
    }
}