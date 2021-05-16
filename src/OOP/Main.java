package OOP;

public class Main {
    public static void main(String[] args) {
        Cylinder cy1 = new Cylinder(70,99,"pink");
        System.out.println("Cylinder height: " + cy1.getHeight()
                            + "Cylinder radius: " + cy1.getRadius()
                            + "Cylinder color: " + cy1.getColor()
        );

    }
}
