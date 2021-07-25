package oopExercises.Pb02;

public class Car extends Vehicles {
    public Car (String name, double weight, int speed){
        super(name, weight, speed);
    }

    @Override
    public String startEngine() {
        return "Start engine = Car class";
    }

    @Override
    public String cruise() {
        return "Start engine = Car class";
    }

    @Override
    public String turn() {
        return "Turn engine = Car class";
    }

    @Override
    public String stopEngine() {
        return "Stop engine = Car class";
    }
}
