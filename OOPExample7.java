class Cat {
    String name;
    int age;
    String breed;
    Cat() {
    }
    Cat(String n, int a, String b) {
        name = n;
        age = a;
        breed = b;
    }
    void printThis() {
        System.out.println(this);
    }
}
public class OOPExample7 {
    public static void main(String[] args) {
        Cat c1 = new Cat("Alice", 4, "Persian");
        System.out.println(c1);
        c1.printThis();
        Cat c2 = new Cat();
        System.out.println(c2);
        c2.printThis();
    }
}