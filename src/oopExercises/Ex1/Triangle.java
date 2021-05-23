package oopExercises.Ex1;

public class Triangle extends Shape {
    public Triangle(double base, double height){
        super(base, height);
    }

    @Override
    public double getPerimeter() {
        double hypotenuse = Math.pow(Math.pow(super.value1, 2) + Math.pow(super.value2, 2),0.5);
        return super.value1 + super.value2 + hypotenuse;
    }

    @Override
    public double getArea() {
        return (super.value1 * super.value2)/2;
    }

    @Override
    public String toString() {
        return "Triangle area = " + getArea() + "\nTriangle perimeter = " + getPerimeter();
    }
}
