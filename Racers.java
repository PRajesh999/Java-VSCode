import java.util.Scanner;
class Racers
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter 5 Bike Racers Speeds");
    int racer1=sc.nextInt();
    int racer2=sc.nextInt();
    int racer3=sc.nextInt();
    int racer4=sc.nextInt();
    int racer5=sc.nextInt();
    int sum=racer1+racer2+racer3+racer4+racer5;
    float avg_Speed=(float)sum/5;
    System.out.println("The Qualified Racers are:");
    if(racer1>avg_Speed)
    System.out.println(racer1);
    if(racer2>avg_Speed)
    System.out.println(racer2);
    if(racer3>avg_Speed)
    System.out.println(racer3);
    if(racer4>avg_Speed)
    System.out.println(racer4);
    if(racer5>avg_Speed)
    System.out.println(racer5);
}
}