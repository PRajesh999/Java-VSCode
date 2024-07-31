import java.util.Arrays;
public class ParsingExamples3 {
    public static void main(String[] args) {
        int[] a = {10, 20, 30, 40}; // in-place operations
        int[] b = a.clone(); // a shallow copy
        // change a
        a[1] = 2000;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        String[] names = {"tokyo", "nairobi", "professor"};
        String[] new_names = names.clone();
        new_names[2] = "berlin";
        System.out.println(Arrays.toString(names));
        System.out.println(Arrays.toString(new_names));
    }
}