package USERFN;
import java.util.Scanner;

public class USERFN2{

    public static boolean checkCredentials(String user, String pass) {
        return user.equals("admin") && pass.equals("1234");
    }

    public static void showWelcomeMessage(String username) {
        System.out.println("Welcome, " + username + "! You have successfully logged in.");
    }

    public static String getSystemName() {
        return "User Login Portal";
    }

    public static void showLoginPage() {
        System.out.println("---------- LOGIN PAGE ----------");
    }

    public static void runLoginSystem() {

        System.out.println("This is a function WITHOUT parameters & WITHOUT return type");
        showLoginPage();

        System.out.println("This is a function WITHOUT parameters & WITH return type");
        String systemName = getSystemName();
        System.out.println("System: " + systemName);
        System.out.println("--------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Username: ");
        String username = sc.nextLine();

        System.out.print("Enter Password: ");
        String password = sc.nextLine();

        System.out.println("This is a function WITH parameters & WITH return type");
        boolean status = checkCredentials(username, password);

        if (status) {
            System.out.println("This is a function WITH parameters & WITHOUT return type");
            showWelcomeMessage(username);
        } else {
            System.out.println("Invalid username or password! Try again.");
        }
    }

    public static void main(String[] args) {
        System.out.println("***** REAL-LIFE LOGIN SYSTEM USING ALL FUNCTION TYPES *****");
        runLoginSystem();
    }
}
