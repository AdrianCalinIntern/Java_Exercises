package oopExercises.Ex1;

import java.awt.font.ShapeGraphicAttribute;

public class MainClass {
    public static void main(String[] args) {
        Shape square = new Square(2);
        System.out.println(square.toString() + "\n");

        Shape rectangle = new Rectangle(2,5);
        System.out.println(rectangle.toString() + "\n");

        Shape rhombus = new Rhombus(17,8);
        System.out.println(rhombus.toString() + "\n");

        Shape hexagon = new Hexagon(9);
        System.out.println(hexagon.toString() + "\n");

        Shape triangle = new Triangle(9, 2);
        System.out.println(triangle.toString() + "\n");

        Shape circle = new Circle(55.8);
        System.out.println(circle.toString() + "\n");
    }
}
