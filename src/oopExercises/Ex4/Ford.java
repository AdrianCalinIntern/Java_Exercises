package oopExercises.Ex4;

public class Ford extends Car{
    private String bla;

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
    public String toString() {
        return super.toString();
    }
}
