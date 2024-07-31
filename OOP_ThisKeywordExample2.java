// Constructor chaining in Java refers to the process of one constructor calling another constructor 
// in the same class or in its superclass. This allows you to write code more efficiently by reusing 
// initialization code rather than duplicating it in multiple constructors.

// Example:
// --------
public class OOP_ThisKeywordExample2 {
   String name;
   int age;
   String campus;
   String branch;
  OOP_ThisKeywordExample2(String name) {
       this.name = name;
   }

   OOP_ThisKeywordExample2(String name,int age)
   {
       this(name);
       this.age=age;

   }
   OOP_ThisKeywordExample2(String name,int age,String campus)
   {
       this(name, age);
       this.campus=campus;

   }
    OOP_ThisKeywordExample2(String name,int age,String campus,String branch)
    {
        this(name, age, campus);
        this.branch=branch;

    }
    public void displayValues() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Campus: " + campus);
        System.out.println("Branch: " + branch);
    }

    public static void main(String[] args) {
        OOP_ThisKeywordExample2 th1=new OOP_ThisKeywordExample2("Alice");
        OOP_ThisKeywordExample2 th2=new OOP_ThisKeywordExample2("Bob",22);
        OOP_ThisKeywordExample2 th3=new OOP_ThisKeywordExample2("John",23,"ACOE");
        OOP_ThisKeywordExample2 th4=new OOP_ThisKeywordExample2("Mosh",34,"ACET","IT");
        th1.displayValues();
        th2.displayValues();
        th3.displayValues();
        th4.displayValues();
    }
}