import java.util.Scanner;
public class CONDITIONS {public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE : ");
        int age = sc.nextInt();
        if (age >= 18)
            System.out.print("YOU ARE ELIGIBLE TO VOTE");
        else
            System.out.print("YOU ARE NOT ELIGIBLE TO VOTE \n");

         System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.print("Enter third number: ");
        int c = sc.nextInt();
    }
}