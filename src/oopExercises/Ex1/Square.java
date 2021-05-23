package oopExercises.Ex1;

public class Square extends Shape{

    public Square(double side){
        super(side);
    }

    @Override
    public double getArea() {
        return Math.pow(super.value1,2);
    }

    @Override
    public double getPerimeter() {
        double result = 0;
        for (int i = 0; i<4; i++){
            result = result + super.value1;
        }
        return  result;
    }

    @Override
    public String toString() {
        return "Square area = " + getArea() + "\nSquare perimeter = " + getPerimeter();
    }
}
