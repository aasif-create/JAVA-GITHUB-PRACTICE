import java.util.Scanner;
public class AverageOfMarks
{
    public static void main(String args[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.print("ENTER THE NUMBER OF SUBJECTS : ");
        int n=obj.nextInt();
        int sum=0;
        for(int i=1 ;i<=n;i++)
        {
                System.out.print("ENTER THE MARK"+ i +": ");
                int mark=obj.nextInt();
                sum=sum+mark;
        }
        System.out.println("SUM OF ALL SUBJECTS :"+sum);
        float avrg=sum/n;
        System.out.println("AVERAGE MARK :"+ avrg);
    }
}
