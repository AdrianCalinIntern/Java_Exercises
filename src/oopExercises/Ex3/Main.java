package oopExercises.Ex3;

public class Main {
    public static void main(String[] args) {
        Printer o1 = new Printer(true);
        o1.fillThePrinter(20);
        o1.pagesToPrint(8);

        System.out.println(o1.toString());
    }
}
