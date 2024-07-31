// This Keyword:
// -------------
// What is use of this keyword?
//    this is a generic keyword 
//    1) It is used to store the address of currently executing
//        object.
//    2) It is used to differentiate the local and member varaible if 
//    both are having same name in that use this keyword before the 
//    member varaible name.

// Example without using this keyword:
// ------------------------------------
public class OOP_ThisKeywordExample {
   int a;
   OOP_ThisKeywordExample(int a)
   {
       a=a;
       System.out.println("value of a in constructor : "+a);
   }

    public static void main(String[] args) {
        OOP_ThisKeywordExample th=new OOP_ThisKeywordExample(4);
        System.out.println(th.a);
    }
}
