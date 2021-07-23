package oopExercises.Pb02;

public class Airplane extends Vehicles {
    public Airplane(String name, double weight, int speed){
        super(name, weight, speed);
    }

    @Override
    public String startEngine() {
        return "Start engine = Airplane class";
    }

    @Override
    public String cruise() {
        return "Start engine = Airplane class";
    }

    @Override
    public String turn() {
        return "Turn engine = Airplane class";
    }

    @Override
    public String stopEngine() {
        return "Stop engine = Airplane class";
    }
}
