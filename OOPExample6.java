class Employee {
    String name;
    int age;
    int empID;
    double salary;
    String org;
    Employee() {

    }
    Employee(String n) {
        name = n;
    }
    Employee(String n, int a) {
        name = n;
        age = a;
    }
    Employee(String n, int a, int e) {
        name = n;
        age = a;
        empID = e;
    }
    Employee(String n, int a, int e, double s, String o) {
        name = n;
        age = a;
        empID = e;
        salary = s;
        org = o;
    }
    void display()
    {
        System.out.println("Name:"+name);
        System.out.println("Age: "+age);
        System.out.println("Employee ID: "+empID);
        System.out.println("Salary:" +salary);
        System.out.println("Organization: "+org);   
    }
}
public class OOPExample6 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.display();
        Employee e2 = new Employee("Pavan");
        e2.display();
        Employee e3 = new Employee("Pavan", 27);
        e3.display();
        Employee e5 = new Employee("Rajesh", 29, 456);
        e5.display();
        Employee e4 = new Employee("Kiran", 30, 123, 100000.00, "THub");
        e4.display();
    }
}