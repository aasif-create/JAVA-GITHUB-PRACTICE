import java.util.Scanner;
public class INPUT{
    public static void main(String[] args)
    {
        Scanner obj =new Scanner(System.in);
        System.out.print("ENTER YOUR NAME :");
        String name=obj.nextLine();
        System.out.print("ENTER YOUR ROLL.NO :");
        int rollno=obj.nextInt();
        obj.nextLine();
        System.out.print("ENTER YOUR DEPARTMENT :");
        String dept=obj.nextLine();
        System.out.print("ENTER YOUR SECTION :");
        char sec = obj.nextLine().charAt(0);

        //DISPLAYING THE STUDENTS DETAILS
        System.out.print("STUDENT'S DETAILS : \n");
        System.out.print("NAME :"+name +"\n");
        System.out.print("ROLLNO :"+rollno+"\n");
        System.out.print("DEPARTMENT :"+dept+"\n");
        System.out.print("SECTION :"+sec+"\n");
        obj.close();
    }
}