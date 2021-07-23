package oopExercises.Pb02;

public class Boat extends Vehicles {
    public Boat(String name, double weight, int speed){
        super(name, weight, speed);
    }

    @Override
    public String startEngine() {
        return "Start engine = Boat class";
    }

    @Override
    public String cruise() {
        return "Start engine = Boat class";
    }

    @Override
    public String turn() {
        return "Turn engine = Boat class";
    }

    @Override
    public String stopEngine() {
        return "Stop engine = Boat class";
    }
}
