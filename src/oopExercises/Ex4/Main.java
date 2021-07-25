package oopExercises.Ex4;

public class Main {
    public static void main(String[] args) {
        Ford f1 = new Ford(4, "Focus");
        System.out.println(f1.toString());
        System.out.println(f1.startEngine());
        System.out.println(f1.accelerate());
        System.out.println(f1.brake() + "\n");

        Bwm bmw1 = new Bwm(8, "X3");
        System.out.println(bmw1.toString());
        System.out.println(bmw1.startEngine());
        System.out.println(bmw1.accelerate());
        System.out.println(bmw1.brake() + "\n");
    }
}
