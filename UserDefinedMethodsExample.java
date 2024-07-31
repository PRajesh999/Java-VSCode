public class UserDefinedMethodsExample {
    static void sayHello()
    {
        System.out.println("Hello All");
    }
    static boolean isFactor(int a, int b)
    {
        return a % b ==0;
    }
    public static void main(String[] args) {
        sayHello();
        System.out.println(isFactor(10, 2));
        System.out.println(isFactor(100, 3));
    }
}
