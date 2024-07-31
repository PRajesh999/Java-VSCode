// public class ExcepionHandlingExample2 {
//     public static void main(String[] args) {
//         try {
//             int[] arr = {10, 20};
//             System.out.println(arr[0]);
//             System.out.println(arr[1]);
//             System.out.println(arr[2]);
//         }
//         catch (ArithmeticException e) {
//             System.out.println(e);
//         }
//         catch (IndexOutOfBoundsException e) {
//             System.out.println(e);
//         }
//         System.out.println("Hey, I am last line");
//     }
// }



// public class ExcepionHandlingExample2 {
//     public static void main(String[] args) {
//         try {
//             int[] arr = {10, 20};
//             System.out.println(arr[0]);
//             System.out.println(arr[1]);
//             System.out.println(arr[2]);
//         }
//         catch (Exception e) {
//             System.out.println(e);
//         }
//         System.out.println("Hey, I am last line");
//     }
// }


public class ExcepionHandlingExample2 {
    public static void main(String[] args) {
        try {
            int[] arr = {10, 20};
            System.out.println(arr[0]);
            System.out.println(arr[1]);
            System.out.println(arr[2]);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        finally {
            System.out.println("Hey, I am last line");
        }
           
    }
}

