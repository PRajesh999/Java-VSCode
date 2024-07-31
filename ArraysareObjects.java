import java.util.Scanner;
public class ArraysareObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ;
        sc.close();
        // arrays are objects
        // belong to object class
        //Object class in java.lang package
        System.out.println(sc instanceof Scanner);
        System.out.println(sc instanceof Object);
        System.out.println(sc instanceof Object);
        
    }
}
