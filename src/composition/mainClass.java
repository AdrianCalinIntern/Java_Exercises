package composition;

public class mainClass {
    public static void main(String[] args) {
        Circle c1 = new Circle(6.2);
        double x = c1.getArea();
        System.out.println(x);

        Cylinder c2 = new Cylinder(6.2,6.2,"Blue");
        System.out.println(c2);
    }


}
