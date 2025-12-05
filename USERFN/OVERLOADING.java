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


class LoginSystem {

    public void login(String username, String password) {
        System.out.println("login(String username, String password) called");
        System.out.println("Logging in using username: " + username);
    }

    public void login(long phoneNumber) {
        System.out.println("login(long phoneNumber) called");
        System.out.println("Logging in using phone number: " + phoneNumber);
    }
}


public class OVERLOADING {
    public static void main(String[] args) {

        Demo obj1 = new Demo();
        System.out.println("Result (2 numbers): " + obj1.add(5, 10));
        System.out.println("Result (3 numbers): " + obj1.add(5, 10, 15));

        LoginSystem obj2 = new LoginSystem();
        obj2.login("aasif", "1234");
        obj2.login(9876543210L);
    }
}
