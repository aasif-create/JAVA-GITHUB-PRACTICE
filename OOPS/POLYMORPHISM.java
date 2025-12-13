class MathOperation {

    public void add(int a, int b) {
        System.out.println("Adding two numbers");
        System.out.println("Result = " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Adding three numbers");
        System.out.println("Result = " + (a + b + c));
    }
}

public class POLYMORPHISM {

    public static void main(String[] args) {

        System.out.println("Creating MathOperation object");
        MathOperation obj = new MathOperation();

        System.out.println("Calling add method with two parameters");
        obj.add(10, 20);

        System.out.println("Calling add method with three parameters");
        obj.add(10, 20, 30);
    }
}
