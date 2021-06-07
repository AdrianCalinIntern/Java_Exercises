package oopExercises.Ex8;

public class MyOwnAutoShop {
    public static void main(String[] args) {

        Sedan s1 = new Sedan(200, 80000, "White", 3);
        System.out.println(s1.toString());

        Ford f1 = new Ford(300, 120.5, "Red", 2010, 10);
        System.out.println(f1);
        Ford f2 = new Ford(320, 180.5, "Blue", 2020, 50);
        System.out.println(f2);

        Car c1 = new Car(80, 3000, "Black");
        System.out.println(c1);
    }
}
