import java.util.*;
public class conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if(n<0)
        {
            System.out.println(n + " is a negative number");
        }
        else if(n>0)
        {
            System.out.println(n +" is a positive number");
        }
        else
        {
            System.out.println(n + " is equal to zero");
        }
    }
}
