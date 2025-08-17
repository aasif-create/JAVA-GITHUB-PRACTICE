/* 
Q. Make a Calculator. 
   Take 2 numbers (a & b) from the user and an operation as follows : 
   1 : + (Addition) a + b
   2 : - (Subtraction) a - b
   3 : * (Multiplication) a * b
   4 : / (Division) a / b
   5 : % (Modulo or remainder) a % b

   Keep asking until the user enters 0 for both numbers → then quit.
*/
// HELLO EVERYONE THIS IS MY FIRST JAVA PROBLEM I TRIED ON MY OWN

import java.util.Scanner;

public class SWITCHCASE1 {
    public static void main(String[] args) {

        Scanner number = new Scanner(System.in);
        while (true) {
            System.out.println("----ENTER 0 FOR BOTH NUMBERS, TO QUIT CALCULATOR----\n");

            System.out.print("ENTER THE FIRST NUMBER  : ");
            int a = number.nextInt();

            System.out.print("ENTER THE SECOND NUMBER : ");
            int b = number.nextInt();

            if (a == 0 && b == 0) {
                System.out.println("OPERATIONS FINISHED");
                break;
            }

            System.out.println("CHOOSE OPERATION : ");
            System.out.println("1 : Addition");
            System.out.println("2 : Subtraction");
            System.out.println("3 : Multiplication");
            System.out.println("4 : Division");
            System.out.println("5 : Modulo");
            int choice = number.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("ADDITION OF " + a + " AND " + b + " IS : " + (a + b) + "\n");
                    break;
                case 2:
                    System.out.println("SUBTRACTION OF " + a + " AND " + b + " IS : " + (a - b) + "\n");
                    break;
                case 3:
                    System.out.println("MULTIPLICATION OF " + a + " AND " + b + " IS : " + (a * b) + "\n");
                    break;
                case 4:
                    if (b != 0)
                        System.out.println("DIVISION OF " + a + " AND " + b + " IS : " + (a / b) + "\n");
                    else
                        System.out.println("ERROR: Division by zero not allowed!\n");
                    break;
                case 5:
                    if (b != 0)
                        System.out.println("MODULUS OF " + a + " AND " + b + " IS : " + (a % b) + "\n");
                    else
                        System.out.println("ERROR: Modulus by zero not allowed!\n");
                    break;
                default:
                    System.out.println("INVALID CHOICE! ENTER A NUMBER BETWEEN 1–5.\n");
            }
        }

        number.close();
    }
}

