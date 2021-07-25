package oopExercises.Ex1;

public class Rectangle extends Shape {

    public Rectangle(double height, double width){
        super(height,width);
    }

    @Override
    public double getPerimeter() {
        return 2 * super.value1;
    }

    @Override
    public double getArea() {
        return super.value1 * super.value2;
    }

    @Override
    public String toString() {
        return "Rectangle area = " + getArea() + "\nRectangle perimeter = " + getPerimeter();
    }
}
