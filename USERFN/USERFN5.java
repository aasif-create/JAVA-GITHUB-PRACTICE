import java.util.Scanner;

public class USERFN5 {

    public static void displayHeader() {
        System.out.println("===== SHOPPING CART CHECKOUT =====");
    }

    public static String getStoreName() {
        return "DailyMart";
    }

    public static double calculateTotal(double price, int qty) {
        return price * qty;
    }

    public static void printReceipt(String item, int qty, double total) {
        System.out.println("Receipt: " + item + " x" + qty + " => Rs " + total);
    }

    public static void runCheckout() {
        System.out.println("This is a function WITHOUT parameters & WITHOUT return type");
        displayHeader();

        System.out.println("This is a function WITHOUT parameters & WITH return type");
        String store = getStoreName();
        System.out.println("Store: " + store);
        System.out.println("--------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Item Name: ");
        String item = sc.nextLine();
        System.out.print("Enter Price: ");
        double price = sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int qty = sc.nextInt();

        System.out.println("This is a function WITH parameters & WITH return type");
        double total = calculateTotal(price, qty);
        System.out.println("Total Amount = Rs " + total);

        System.out.println("This is a function WITH parameters & WITHOUT return type");
        printReceipt(item, qty, total);
    }

    public static void main(String[] args) {
        System.out.println("***** SHOPPING CART DEMO *****");
        runCheckout();
    }
}
