class Rectangle {
    double length, width;
    void printArea() {
        System.out.println("Area is : " + (length * width));
    }

    void  printPerimeter(){
        System.out.println("Perimeter is: " +2 * (length + width));
    }
}

public class OOPExample2 {
     public static void main(String[] args) {
        Rectangle r1 = new Rectangle();
        r1.length = 4.5;
        r1.width = 3.3;
        r1.printArea();
        r1.printPerimeter();
     }
}
