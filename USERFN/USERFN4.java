import java.util.Scanner;

public class USERFN4 {

    public static void displayHeader() {
        System.out.println("===== ATM MACHINE =====");
    }

    public static String getBankName() {
        return "TrustBank ATM";
    }

    public static boolean validatePin(int enteredPin, int actualPin) {
        return enteredPin == actualPin;
    }

    public static void dispenseCash(int amount) {
        System.out.println("Please collect your cash: Rs " + amount);
    }

    public static void runATM() {
        System.out.println("This is a function WITHOUT parameters & WITHOUT return type");
        displayHeader();

        System.out.println("This is a function WITHOUT parameters & WITH return type");
        String bank = getBankName();
        System.out.println("Bank: " + bank);
        System.out.println("--------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        System.out.println("This is a function WITH parameters & WITH return type");
        boolean ok = validatePin(pin, 1234);

        if (ok) {
            System.out.println("This is a function WITH parameters & WITHOUT return type");
            dispenseCash(2000);
        } else {
            System.out.println("Invalid PIN. Transaction cancelled.");
        }
    }

    public static void main(String[] args) {
        System.out.println("***** ATM SYSTEM DEMO *****");
        runATM();
    }
}
