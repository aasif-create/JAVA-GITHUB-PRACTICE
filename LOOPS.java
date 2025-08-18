import java.util.Scanner;
public class LOOPS {
    public static void main(String[] args) {
        //1.FOR LOOP
        for (int i = 0; i < 5; i++) {
            System.out.println("ROLL NO :" + i);
        }

        //2.WHILE LOOP
        int i1 = 90;
        while (i1 < 95) {
            System.out.println("MARKS :" + i1);
            i1++;
        }

        //3.DO WHILE LOOP
        char i2 = 'a';
        do {
            System.out.println("GRADE :" + i2);
            i2++;
        } while (i2 < 'f');

        //4.DO WHILE INT
        int i = 97;
        do {
            System.out.println("TOPPERS MARKS :" + i);
            i++;
        } while (i < 100);


        //ASSIGNMENT PROBLEMS

        //1.Qs. Print the Sum of First Natural Numbers.( n = 4)
        int sum = 0;
        Scanner obj = new Scanner(System.in);
        System.out.println("ENTER NO.OF INTEGERS :");
        int n = obj.nextInt();
        for (i= 0; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("THE SUM OF THE GIVEN NUMBER OF TERMS :"+sum);

        //2.Qs. Print the table of a number input by the user.(n = 2)
        System.out.print("ENTER A TABLE NO :");
       int num =obj.nextInt();
       for(i=1;i<11;i++)
       {
           System.out.println(num*i);
       }
    }
}







