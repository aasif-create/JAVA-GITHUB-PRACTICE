package USERFN;
public class USERFN{

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
         System.out.println("2. WITH parameters & WITHOUT return type");
        subtract(30, 10);
        System.out.println("----------------------------------");

        System.out.println("3. WITHOUT parameters & WITH return type");
        int value = getNumber();
        System.out.println("Returned Number = " + value);
        System.out.println("----------------------------------");

        System.out.println("4. WITHOUT parameters & WITHOUT return type");
        display();
        System.out.println("----------------------------------");

        public class CombinedFunctionDemo {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void divide(int a, int b) {
        if (b == 0) {
            System.out.println("Cannot divide by zero!");
        } else {
            System.out.println("Division Result = " + (a / b));
        }
    }

    public static int generateRandomNumber() {
        return (int)(Math.random() * 100);
    }

    public static void greet() {
        System.out.println("Welcome to the Combined Function Calculator!");
    }
    public static void fullDemo() {

        System.out.println("1. WITHOUT parameters & WITHOUT return type");
        greet();
        System.out.println("--------------------------------");

        System.out.println("2. WITH parameters & WITH return type");
        int r1 = multiply(5, 6);
        System.out.println("Multiplication Result = " + r1);
        System.out.println("--------------------------------");

        System.out.println("3. WITH parameters & WITHOUT return type");
        divide(20, 4);
        System.out.println("--------------------------------");

        System.out.println("4. WITHOUT parameters & WITH return type");
        int randomValue = generateRandomNumber();
        System.out.println("Random Number Generated = " + randomValue);
        System.out.println("--------------------------------");
    }

    public static void main(String[] args) {
        System.out.println("***** COMBINED FUNCTION DEMO *****");
        fullDemo();
    }
}
    }
}
