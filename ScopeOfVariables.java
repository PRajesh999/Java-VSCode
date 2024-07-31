// 3 different types
// -------------------
// We can create variables
// ->inside a class
// ->inside a class also inside a method
// ->with in the block / method scope

// instance variables(non-static)
// inside the class outside the method without static keyword
// belong to the instance of that class
// Scope:
// inside the same class
// outside the class with an instance

// static/class variables
// inside a class outside a method with static keyword
// Scope:
// inside the class
// outside the class with the class name directly

// -->If you are able to access class memebers directly by using classname that means those members are static.
// -->If you need to create an instance to access classs members then they are non-static or instance.

class Student {
    int age; // instance variable
    String name;// instance variable
    String rollNumber;// instance variable
    static String collegename = "ACOE";// static variable
    // instance method can only be accessed with instance

    void printDetails() {
        System.out.println(age + " " + name + " " + rollNumber);
    }

    // static method -> which can be accessed using class name or object of that
    // class
    static void printCollegeDetails() {
        System.out.println(collegename);
    }
}

public class ScopeOfVariables {
    public static void main(String[] args) {

        System.out.println(Student.collegename);
        Student s1 = new Student(); // Creating an instance of student class
        s1.age = 19;
        s1.name = "Narasimha";
        s1.rollNumber = "22MH1A05K4";
        s1.printDetails();
        Student.printCollegeDetails();
        s1.printCollegeDetails();
    }
}