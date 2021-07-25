package oopExercises.Ex1;

public class Circle extends Shape {
    public Circle(double radius){
        super(radius);
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(super.value1, 2);
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * super.value1;
    }

    @Override
    public String toString() {
        return "Circle area = " + getArea() + "\nCircle perimeter = " + getPerimeter();
    }
}
