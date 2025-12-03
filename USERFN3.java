import java.util.Scanner;

public class USERFN3
{

    public static int calculateTotal(int m1, int m2, int m3) {
        return m1 + m2 + m3;
    }

    public static void showGrade(int total) {
        if (total >= 250) System.out.println("Grade: A");
        else if (total >= 200) System.out.println("Grade: B");
        else if (total >= 150) System.out.println("Grade: C");
        else System.out.println("Grade: D");
    }

    public static String getSchoolName() {
        return "National Public School";
    }

    public static void displayHeader() {
        System.out.println("===== STUDENT MARK REPORT =====");
    }

    public static void generateReport() {

        System.out.println("This is a function WITHOUT parameters & WITHOUT return type");
        displayHeader();

        System.out.println("This is a function WITHOUT parameters & WITH return type");
        String school = getSchoolName();
        System.out.println("School: " + school);
        System.out.println("--------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Mark 1: ");
        int m1 = sc.nextInt();

        System.out.print("Enter Mark 2: ");
        int m2 = sc.nextInt();

        System.out.print("Enter Mark 3: ");
        int m3 = sc.nextInt();

        System.out.println("This is a function WITH parameters & WITH return type");
        int total = calculateTotal(m1, m2, m3);
        System.out.println("Total Marks = " + total);

        System.out.println("--------------------------------");

        System.out.println("This is a function WITH parameters & WITHOUT return type");
        showGrade(total);

        System.out.println("--------------------------------");
        System.out.println("Report Generated Successfully for " + name);
    }

    public static void main(String[] args) {
        System.out.println("***** STUDENT REPORT CARD USING ALL FUNCTION TYPES *****");
        generateReport();
    }
}
