import java.util.Scanner;
public class input{
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.print("ENTER YOUR NAME :");
        String name=obj.nextLine();
        obj.nextLine();
        System.out.print("ENTER YOUR ROLL.NO :");
        int rollno=obj.nextInt();
        obj.nextLine();
        System.out.print("ENTER YOUR DEPARTMENT :");
        String dept=obj.nextLine();
        obj.nextLine();
        System.out.print("ENTER YOUR SECTION :");
        char sec = obj.nextLine().charAt(0);
        obj.nextLine();


        //DISPLAYING THE STUDENTS DETAILS
    }
}