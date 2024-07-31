class Person {
    //member variables / attributes
    String name; //non-static / instance member
    int age;  //non-static / instance member
    //non-static / instance method
    void printDetails() {
        System.out.println("My name is : " + name + " and I am " + age + " years old");
    }
}

public class OOPExample1 {
    public static void main(String[] args) {
        Person p1 = new Person(); //creating an object of person
        // System.out.println(p1.age); //0 -> default
        // System.out.println(p1.name); //null -> string
        p1.name = "Rajesh";
        p1.age = 17;
        p1.printDetails();

        Person p2 = new Person();
        p2.name = "Prakash";
        p2.age = 24;
        p2.printDetails();
        
    }
}
