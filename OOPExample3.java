class Circle {
    double radius;
    static final double PI = 3.14;
    void printDiameter() {
        System.out.println("Diameter is : " + 2 * radius);
    }
    void printArea() {
        System.out.println("Area is : " + PI * radius * radius);
    }
    void printPerimeter() {
        System.out.println("Perimeter is : " + 2 * PI * radius);
    }
}
public class OOPExample3 {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        c1.radius = 5.6;
        c1.printDiameter();
        c1.printArea();
        c1.printPerimeter();
    }
}
