package oopExercises.Ex1;

public class Rhombus extends Shape  {

    public Rhombus (double diagonal_a, double diagonal_b){
        super(diagonal_a,diagonal_b);
    }

    @Override
    public double getArea() {
        return super.value1 * super.value2 / 2;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.pow(super.value1,2) + Math.pow(super.value2,2);
    }

    @Override
    public String toString() {
        return "Rhombus area = " + getArea() + "\nRhombus perimeter = " + getPerimeter();
    }
}
