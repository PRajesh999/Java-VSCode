public class MethodOverloadingExample1 {
    static void add(int a, int b) {
        System.out.println(a + b);
    }
    static void add(int a, int b, int c) {
        System.out.println(a + b + c);
    }
    static void add(double a, double b) {
        System.out.println(a + b); 
    }
    static void add(int[] arr, int n) {
        int sum = 0;
        for(int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        add(10, 20, 30);
        add(10, 20);
        add(1.34, 2.54);
        int arr[] = {10, 20, 30, 40, 50};
        add(arr, 5);
        
    }
}
