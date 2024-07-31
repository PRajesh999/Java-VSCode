class Person {
    String name;
    int age;
    String gender;
    Person() {
        System.out.println("This is Person Class");
    }
    void printPersonDetails() {
        System.out.println(name + " " + age + " " + gender);
    }
}
class Student extends Person {
    String studentID;
    String branch;
    String college;
    Student() {
        System.out.println("This is Student class");
    } 
    void printDetails2() {
        System.out.println(studentID + " " + branch + " " + college);
    }
}
class Teacher extends Person {   
    String teacherID;
    double salary;
    String branch;
    Teacher() {
        System.out.println("This is teacher class");
    }
    void printDetails2() {
        System.out.println(teacherID + " " + salary + " " + branch);
    }
}
public class OOPExample8   {
    public static void main(String[] args) {
        Student s1 = new Student();
        Teacher t1 = new Teacher();
    }
}