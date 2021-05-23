package oopExercises.Ex1;

public class Hexagon extends Shape{

    public Hexagon(double sideLength){
       super(sideLength);
    }

    @Override
    public double getPerimeter() {
        double result = 0;
        for (int i = 0; i<6; i++){
            result = result + super.value1;
        }
        return  result;
    }

    @Override
    public double getArea() {
        return (3*Math.sqrt(3) * Math.pow(super.value1,2))/2 ;
    }

    @Override
    public String toString() {
        return "Hexagon area = " + getArea() + "\nHexagon perimeter = " + getPerimeter();
    }
}
