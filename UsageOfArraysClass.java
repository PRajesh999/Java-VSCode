import java.lang.reflect.Array;
import java.util.Arrays;

public class UsageOfArraysClass {
    public static void main(String[] args) {

        // <-------String()-------->

        int arr[] = {10, 20, 30 , 40};
        String[] arr1 = {"abc", "xyz"};
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(arr1));

        //<--------Sort()-------->

        int A[] = {7, 8, 11, -1, -36, 24, 6};
        //Performs sort in-place (no longer original array)
        // Arrays.sort(A);  -->1 method
        // System.out.println(Arrays.toString(A));

        // Arrays.sort(A, 2, 6);    //-->2 method   sorts from 2 to 6 index
        // System.out.println(Arrays.toString(A));

        Arrays.sort(A, 3, A.length);   //--> 3 method
        System.out.println(Arrays.toString(A));


        //<--------Filling-------->

        int X[] = new int[10];
        Arrays.fill(X, -1);
        System.out.println(Arrays.toString(X));

        String[] strArray = new String[50];
        Arrays.fill(strArray, "Rajesh");
        System.out.println(Arrays.toString(strArray));


        //<-----------Compare()------------->

        // compare(p, q)
        // 0 --> p == q
        // 1 --> p > q
        // -1 --> p < q
        // compare(q, p)
        // 0 --> q == p
        // 1 --> q > p
        // -1 --> q < p
        // Streams() & Collections
        // ArrayList --> vector
        // HashMap --> map
        // HashSet --> Set
        // Stack --> stack


        int[] p = {10, 20, 30, 40};
        int[] q = {10, 20, 30, 40};
        System.out.println(Arrays.compare(p,q));    //0-->p == q   1-->p > q   -1-->p < q  [Lexicography]

        System.out.println(Arrays.equals(p,q));     // true if both are equal   

        
        //<-----------Mismatch()------------->
         
        int[] r = {10, 20, 15, 40};
        int[] s = {10, 20, 30, 40};
        System.out.println(Arrays.mismatch(r,s));   //returns the index where the elements are mismatched


    }
}
