abstract class Bank {

    abstract void withdraw();
}

class ATM extends Bank {

    void withdraw() {
        System.out.println("Withdraw option shown to the user");
        System.out.println("Internal bank processing is hidden");
    }
}

public class ABSTRACTION {

    public static void main(String[] args) {

        System.out.println("Creating ATM object using Bank reference");
        Bank b = new ATM();

        System.out.println("Calling withdraw method");
        b.withdraw();
    }
}
