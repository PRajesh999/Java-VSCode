// Abstraction in Java:
// Abstraction is nothing but hiding some details and showing only the details that are necessary.
// 1.Abstract class
// i.An abstract method is method without body.
// ii.Abstract methods can be created by adding a keyword 'abstract' in front of method.
// iii.If a class contains at least one abstract method then you have to make the class also as abstract.
// iv.You cannot create instances for an abstract class.
// v.Abstract classes can also contain concrete methods(MEthods with body)
// vi.The major use of ab stract classes can be used in inheritance. A class which inherits from an abstract class should provide the 
// implementation of abstract methods.
//vii. If a child class fails to provide implementation for all the abstract methods in parent class, the child class should 
//also be made as abstract.

abstract class Animal {
    String name;
    int age;
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //2 implementations
    abstract void introduce(); //abstract method
}
class Cat extends Animal {
    Cat(String name, int age) {
        super(name, age);
        }
    void introduce() {
        System.out.println("Hey, I am a cat!");
    }
}
class Elephant extends Animal {
    Elephant(String name, int age) {
        super(name, age);
    }
    void introduce() {
        System.out.println("Hey, I am an Elaphant!");
    }
}

public class O_Abstraction {
    public static void main(String[] args) {
        Cat c1 = new Cat("Whiskers", 3);
        c1.introduce();
        Elephant e1 = new Elephant("Jumbo", 50);
        e1.introduce();
    }
    
}
