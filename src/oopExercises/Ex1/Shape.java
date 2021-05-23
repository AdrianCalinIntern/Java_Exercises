package oopExercises.Ex1;

public abstract class Shape {
    public double value1;
    public double value2;

    public Shape(double value1){
        this.value1 = value1;
    }

    public Shape(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
    }

    abstract public double getArea();
    abstract public double getPerimeter();
}
