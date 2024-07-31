class Student {
    int id;
    String name;
    String branch;
    String college;
    double cgpa;

    void setValues(int i, String n, String b, String c, double d) {
        id = i;
        name = n;
        branch = b;
        college = c;
        cgpa = d;
    }

    void printValues() {
        System.out.println(id + " " +  name + " " + branch + " " + college + " " + cgpa);
    }
}

public class OOPExample4 {
    public static void main(String[] args) {
         Student  s1 = new Student();
         s1.setValues(1, "Rajesh", "CSE", "ACOE", 8.7);
         s1.printValues();
         
         Student s2 = new Student();
         s2.setValues(2, "Prakash", "IT", "AEC", 9.2);
         s2.printValues();
    }
}
