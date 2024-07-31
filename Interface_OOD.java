// OOD (Object Oriented Design)
// ----------------------------

// Clean Code Book -> Uncle Bob
// SOLID Principles
// ----------------
// Single Responsibility Principle
// Open/Closed
// Liskov's Substutution Principle
// Interface Segregation
// Dependency Inversion

// 1. You can achieve 100% abstraction, using interfaces.
// 2. Java doesn't support Multiple-Inheritance usning classes.
// 3. Interfaces support multiple-inheritance 
// 4. Interfaces contains only abstract methods
// 5. You need to write only the declaration of the method in the interfaces
// 6. Classes can implement interfaces using 'implements' keyword
// 7. The class that implements an interface should provide concrete implementation of the methods in the interface
// 8. Syntax:
// interface MyInterface {
// methods
// }

import java.lang.management.OperatingSystemMXBean;

interface Operations {
    //every thing you create is by-default public and abstract
    int factorial(int n); //public abstract int factorial(int n);
}
class Math1 implements Operations {
    public int factorial(int n) { //Iterative
        int f=1;
        for(int i=1;i<=n;i++) f*=i;
        return f;
    }
}
class Math2 implements Operations { //REcursive
    public int factorial(int n) {
        if(n==1) return 1;
        return n*factorial(n-1);
    }
}

public class Interface_OOD {
    public static void main(String[] args) {
        Math1 m1 = new Math1();
        System.out.println(m1.factorial(5));
        Math2 m2 = new Math2();
        System.out.println(m2.factorial(7));
    }
}
