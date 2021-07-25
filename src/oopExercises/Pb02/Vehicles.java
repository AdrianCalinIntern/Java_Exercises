package oopExercises.Pb02;

public abstract class Vehicles {
    private String name;
    private double weight;
    private int  speed;

    public Vehicles(String name, double weight, int speed){
        this.name = name;
        this.weight = weight;
        this.speed = speed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String startEngine(){
        return "Start engine - Model class";
    }

    public String cruise(){
        return "Cruise - Model class";
    }

    public String turn(){ return "Turn - Model class"; }

    public String stopEngine(){ return "Stop Engine - Model class"; }
}
