class Person {
    String name;
    int age;
    String gender;
    Person() {}
    Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    void printPersonDetails() {
        System.out.println(name + " " + age + " " + gender);
    }
}
class Student extends Person {
    String studentID;
    String branch;
    String college;
    Student() {}
    Student(String name, int age, String gender, String studentID, String branch, String college) {
        super(name, age, gender);
        this.studentID = studentID;
        this.branch = branch;
        this.college = college;
    }
    void printDetails2() {
        System.out.println(studentID + " " + branch + " " + college);
    }
}
class Teacher extends Person {
    String teacherID;
    double salary;
    String branch;
    void printDetails2() {
        System.out.println(teacherID + " " + salary + " " + branch);
    }
}
public class OOPExample9 {
    public static void main(String[] args) {
       Student s1 = new Student("Alice", 17, "Female", "123", "ACET", "IT");
       s1.printPersonDetails();
       s1.printDetails2();
    }
}