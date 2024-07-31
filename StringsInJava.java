public class StringsInJava {
    public static void main(String[] args) {
        //Characters Arrays -> Mutable
        //Ability to be chanaged even after created
        char[] arr = {'H', 'e', 'l', 'l', 'o'};
        arr[1] = 'W';
        System.out.println(arr);


        //String -> Immutable
        //Can't be modified once created

        String s = "Hello"; //String Consntant Pool
        String t = "Hello"; // Stored in String Constant Pool
        String p = "Hello"; // Stored in String Constant Pool
        System.out.println(s == t);
        String x = new String("Hello");
        String y = new String("Hello");
        System.out.println(x == y);
    
    
    }
}
