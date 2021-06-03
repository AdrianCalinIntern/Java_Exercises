package oopExercises.Ex4;

public class Ford extends Car{
    public Ford(int cylinders, String name){
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        return "Ford - Engine started";
    }

    @Override
    public String accelerate() {
        return "Ford - Accelerate";
    }

    @Override
    public String brake() {
        return "Ford - Brake";
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
