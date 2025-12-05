class Demo {
    public int add(int a, int b) {
        System.out.println("add(int a, int b) called");
        return a + b;
    }
    public int add(int a, int b, int c) {
        System.out.println("add(int a, int b, int c) called");
        return a + b + c;
    }
}
public class OVERLOADING
{
    public static void main(String[] args) {
        Demo obj = new Demo();
        System.out.println("Result (2 numbers): " + obj.add(5, 10));
        System.out.println("Result (3 numbers): " + obj.add(5, 10, 15));
    }
}
