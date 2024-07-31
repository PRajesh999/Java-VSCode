// try  {
// 	statement1;
// 	statement2;
// 	statement3;
// }
// catch (X e) {
// 	statement 4;
// }
// statement 5;


// Case 1 : When there is no exception raised in try block 1,2,3 & 5 gets executed
// Case 2 : If there is an exception at statement 1 and catch block is having corresponding handler - 4 & 5 gets executed
// Case 3 : If there is an exception at statement 1 and catch block is not having corresponding handler - program crashes after statement1



public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 2);
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
        System.out.println("Hey, I am last line");
    }
}
