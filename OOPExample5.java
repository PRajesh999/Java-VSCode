class Student {
    String name;
    int age;
    String branch;
    String college;
    double cgpa;
    Student(String n, int a, String b, String c, double cg) {
        name = n;
        age = a;
        branch = b;
        college = c;
        cgpa = cg;
    }
    void printDetails() {
        System.out.println("Hey I am " + name + " (" + age + ") from " + branch);
    }
}
public class OOPExample5 {
    public static void main(String[] args) {
        Student s1 = new Student("Alice", 17, "CSE", "AEC", 7.5);
        s1.printDetails();
        Student s2 = new Student("Bob", 18, "IT", "ACOE", 8.5);
        s2.printDetails();
    }
}