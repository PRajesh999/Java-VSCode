// Integer.toString() method is used to convert an int to String. It can be used in multiple ways.

// Examples:
// Integer.toString(123) -> Converts integer 123 into String 123 ("123").
// Integer.toString(123, 2) -> Converts integer 123 into Binary String ("1111011")
// Integer.toString(95, 8) -> Converts integer 95 into an Octal String ("137")
// Integer.toString(2748, 16) -> Converts integer 2748 into an Hexa Decimal String ("abc")

// Alternatively you can also use

// Integer.toBinaryString() to convert an integer into a Binary String.
// Integer.toOctalString() to convert an integer into a Octal String.
// Integer.toHexString() to convert an integer into a Hexa Decimal String.

//-------------------------------------------------------------------------------

// Integer.parseInt() -> Converts a String to an integer
// Integer.toString() -> Converts an integer to a String
// Integer.toBinaryString() -> Converts an integer to Binary
// Integer.toHexString() -> Converts an integer to Hexa Decimal
// Integer.toOctalString() -> Converts an integer to Octal
// Integer.parseInt() method has multiple uses.

// Examples:

// Integer.parseInt("1111011", 2) -> means String is in Base 2 representation. So it will be converted into it's 
// decimal representation which is 123.
// Integer.parseInt("137", 8) -> means String is in Base 8 representation. So it will be converted into it's 
// decimal representation which is 95.
// Integer.parseInt("ABC", 16) -> means String is in Base 16 representation. So it will be converted into it's 
// decimal representation which is 2748.


public class ParsingExamples {
    public static void main(String[] args) {
        String x = "10"; //Decimal Stirng
        String y = "1100"; //Binary String
        String z = "ABC";  //Hex String
        int a =  Integer.parseInt(x);
        int b = Integer.parseInt(y, 2);
        int c = Integer.parseInt(z, 16);
        System.out.println(a*a);
        System.out.println(b);
        System.out.println(c);
    }
}
