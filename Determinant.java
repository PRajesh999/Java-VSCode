import java.util.*;
public class Determinant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a,b,c;
        double root1, root2;
        System.out.println("Enter values of a,b,c");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();    
        double det = b*b - 4*a*c;
        if(det>0) 
        {
            root1 = -b+(Math.sqrt(det))/2*a;
            root2 = -b-(Math.sqrt(det))/2*a;
            System.out.format("Root1 : %.2f, Root2=%.2f",root1,root2);
        }
        else if(det==0) {
            root1 = root2 = -b/2*a;
            System.out.format("Root1=Root2=%.2f",root1);
        }
        else{
            double real,imag;
            real = -b/2*a;
            imag = Math.sqrt(-det)/2*a;
            System.out.format("Root1 = %.2f+%.2fi",real,imag);
            System.out.format("\nroot2 = %.2f-%.2fi",real,imag);
        }


    }
    
}
