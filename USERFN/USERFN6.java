import java.util.Scanner;

public class USERFN6 {

    public static void displayHeader() {
        System.out.println("===== MOVIE BOOKING =====");
    }

    public static String getPortalName() {
        return "QuickTickets";
    }

    public static boolean checkSeatAvailability(int seatsRequested, int seatsAvailable) {
        return seatsRequested <= seatsAvailable;
    }

    public static void confirmBooking(String movie, int seats) {
        System.out.println("Booking Confirmed for '" + movie + "' | Seats: " + seats);
    }

    public static void runBooking() {
        System.out.println("This is a function WITHOUT parameters & WITHOUT return type");
        displayHeader();

        System.out.println("This is a function WITHOUT parameters & WITH return type");
        String portal = getPortalName();
        System.out.println("Portal: " + portal);
        System.out.println("--------------------------------");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Movie Name: ");
        String movie = sc.nextLine();
        System.out.print("Enter Seats to Book: ");
        int seats = sc.nextInt();

        System.out.println("This is a function WITH parameters & WITH return type");
        boolean ok = checkSeatAvailability(seats, 10);

        if (ok) {
            System.out.println("This is a function WITH parameters & WITHOUT return type");
            confirmBooking(movie, seats);
        } else {
            System.out.println("Not enough seats available.");
        }
    }

    public static void main(String[] args) {
        System.out.println("***** MOVIE BOOKING DEMO *****");
        runBooking();
    }
}
