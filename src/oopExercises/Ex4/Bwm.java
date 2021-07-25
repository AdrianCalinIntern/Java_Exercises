package oopExercises.Ex4;

public class Bwm extends Car{
    public Bwm(int cylinders, String name){
        super(cylinders,name);
    }

    @Override
    public String startEngine() {
        return "BMW - Start engine";
    }

    @Override
    public String accelerate() {
        return "BMW - Start accelerate";
    }

    @Override
    public String brake() {
        return "BMW - Brake";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
