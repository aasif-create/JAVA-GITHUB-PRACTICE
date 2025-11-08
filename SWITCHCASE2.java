/* 
2. Ask the user to enter the number of the month & print the name of the month. 
For example - For ‘1’ print ‘January’, ‘2’ print ‘February’ & so on. 
*/

import java.util.Scanner;

public class SWITCHCASE2{
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);

        System.out.print("ENTER THE NUMBER OF THE MONTH : ");
        int num = month.nextInt();

        switch (num) {
            case 1:
                System.out.println("JANUARY");
                break;
            case 2:
                System.out.println("FEBRUARY");
                break;
            case 3:
                System.out.println("MARCH");
                break;
            case 4:
                System.out.println("APRIL");
                break;
            case 5:
                System.out.println("MAY");
                break;
            case 6:
                System.out.println("JUNE");
                break;
            case 7:
                System.out.println("JULY");
                break;
            case 8:
                System.out.println("AUGUST");
                break;
            case 9:
                System.out.println("SEPTEMBER");
                break;
            case 10:
                System.out.println("OCTOBER");
                break;
            case 11:
                System.out.println("NOVEMBER");
                break;
            case 12:
                System.out.println("DECEMBER");
                break;
            default:
                System.out.println("INVALID MONTH NUMBER! Please enter 1–12.");
            month.close();
        }
    


//ALTERNATIVE WITHOUT USING SWITCH

//using ARRAYS

 Scanner months =new Scanner(System.in);
            System.out.print("ENTER YOUR BIRTH MONTH NUMBER :");
            int input = months.nextInt();
            String[] mth={"null","JAN","FEB","MAR","APR","MAY","JUN","JULY","AUG","SEP","OCT","NOV","DEC"};
            if(input>0 && input <=12) {
                System.out.println(mth[input]);
            }
            else{
                System.out.println("INVALID NUMBER MONTH , ENTER A NUMBER BW 1 TO 12");
            }
            months.close();
    }
}

    