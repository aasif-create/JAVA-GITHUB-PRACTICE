public class RECURSFN
{

    public static int factorial(int n) {
        System.out.println("factorial(" + n + ") called");

        if (n == 1) {
            System.out.println("Base case reached, returning 1");
            return 1;
        }

        System.out.println("Calculating " + n + " * factorial(" + (n - 1) + ")");
        int result = n * factorial(n - 1);

        System.out.println("Returning " + result + " for factorial(" + n + ")");
        return result;
    }

    public static void main(String[] args) {
        int number = 5;
        System.out.println("Calling factorial(" + number + ")");
        int result = factorial(number);
        System.out.println("Final Answer: Factorial of " + number + " = " + result);

         public static void climbSteps(int step) {
        System.out.println("You are currently on step " + step);
        if (step == 0) {
            System.out.println("You reached the ground level — stopping");
            return;
        }
        System.out.println("Moving from step " + step + " to step " + (step - 1));
        climbSteps(step - 1);
    }
    }
}
