public class ParsingExamples2 {
    public static void main(String[] args) {
        int a = 12; //1100
        int b = 2748; //ABC
        String x = Integer.toString(a,2); //"1100" -> Binary String
        String y = Integer.toString(b, 16); //"abc" -> Hex String
        System.out.println(x);
        System.out.println(y);
    }                                   
}

// Integer.parseInt() -> Converts a String to an integer
// Integer.toString() -> Converts an integer to a String
// Integer.toBinaryString() -> Converts an integer to Binary
// Integer.toHexString() -> Converts an integer to Hexa Decimal
// Integer.toOctalString() -> Converts an integer to Octal
 