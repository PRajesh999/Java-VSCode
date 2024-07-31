

// Characters ---> ' '      Strings ---> " "
// To convert character into a string we can use the method or directly we can use String s = "" + 'z'

public class MethodsinCharacterClass {
    public static void main(String[] args) {
        System.out.println(Character.toString('z'));   //"z"
        System.out.println(Character.isUpperCase('a'));
        System.out.println(Character.isUpperCase('A'));
        System.out.println(Character.isAlphabetic('x'));
        System.out.println(Character.isAlphabetic('X'));
        System.out.println(Character.isWhitespace(' '));
        System.out.println(Character.isWhitespace('$'));
        System.out.println(Character.isDigit('9'));
    }
}
