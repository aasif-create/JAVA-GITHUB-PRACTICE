import java.util.Scanner;
public class CONDTIONS
{
    public static void main(String[] args)
    {
     Scanner obj = new Scanner(System.in);
     int age =obj.nextInt();
     System.out.print("ENTER YOUR AGE :");
     if(age >=18)
        System.out.print("YOU ARE ELIGIBLE TO VOTE ");
     else
        System.out.print("YOU ARE NOT ELIGIBLE TO VOTE ");
    }
}