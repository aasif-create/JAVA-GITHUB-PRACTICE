import java.util.Scanner;
public class FUNCTIONS
{
    void Add(int a , int b)
    {
        System.out.print("ADDITION OF A + B IS : " +(a+b));
    }
public static void main(String[] args)
{
    Scanner obj =new Scanner(System.in);
    FUNCTIONS sc=new FUNCTIONS();
    System.out.println("ADDITION");
    System.out.print("ENTER A VALUE : ");
    int a=obj.nextInt();
    System.out.print("ENTER B VALUE : ");
    int b=obj.nextInt();
    sc.Add(a,b);
}
}