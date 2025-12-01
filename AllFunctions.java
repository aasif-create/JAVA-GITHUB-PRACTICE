public class AllFunctions {

    public static int add(int a, int b) {
        return a + b;
    }

    public static void subtract(int a, int b) {
        System.out.println("This is a function WITH parameters & WITHOUT return type");
        int c = a - b;
        System.out.println("Subtraction = " + c);
    }
public static int getNumber() {
        return 50;
    }

    public static void display() {
        System.out.println("This is a function WITHOUT parameters & WITHOUT return type");
        System.out.println("Hello, this is a user-defined function!");
    }

    public static void main(String[] args) {
        System.out.println("1. WITH parameters & WITH return type");
        int sum = add(10, 20);
        System.out.println("Addition = " + sum);
        System.out.println("----------------------------------");