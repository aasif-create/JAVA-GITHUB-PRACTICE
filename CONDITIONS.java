import java.util.Scanner;
public class CONDITIONS {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.print("ENTER YOUR AGE : ");
        int age = obj.nextInt();
        if (age >= 18)
            System.out.print("YOU ARE ELIGIBLE TO VOTE");
        else
            System.out.print("YOU ARE NOT ELIGIBLE TO VOTE");
    }
}