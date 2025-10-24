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
        if (a > b && a > c) {
            System.out.println(a + " is the greatest number.");
        } 
        else if (b > a && b > c) {
            System.out.println(b + " is the greatest number.");
        } 
        else if (c > a && c > b) {
            System.out.println(c + " is the greatest number.");
        } 
        else {
            System.out.println("Two or more numbers are equal.");
     }
     System.out.print("Enter a character: ");
        char ch = sc.next().toLowerCase().charAt(0);

        switch (ch) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':

            System.out.println(ch + " is a Vowel.");
                break;
            default:
                if (Character.isLetter(ch))
                    System.out.println(ch + " is a Consonant.");
                else
                    System.out.println("Invalid input! Please enter an alphabet.");
                    }        sc.close();
    }
}
    

