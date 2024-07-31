import java.util.Scanner;

public class ForEachLoop {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in)  ;
    int n = read.nextInt(); //size
    int[] arr = new int[n];  //creating array of n elements
    for(int i=0;i<n;i++)
    {
       arr[i] = read.nextInt();
    }
    //Accessing (for each loop)
    for(int var : arr)
    {
        System.out.print(var + " ");
    }
}
}
