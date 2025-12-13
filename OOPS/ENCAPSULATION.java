class BankAccount {

    private int balance;

    public void setBalance(int amount) {
        System.out.println("Setting balance using setter method");
        balance = amount;
    }

    public int getBalance() {
        System.out.println("Getting balance using getter method");
        return balance;
    }
}

public class ENCAPSULATION {

    public static void main(String[] args) {

        System.out.println("Creating BankAccount object");
        BankAccount acc = new BankAccount();

        System.out.println("Trying to set balance directly is not allowed");
        acc.setBalance(5000);

        System.out.println("Accessing balance through getter method");
        System.out.println("Account Balance = " + acc.getBalance());
    }
}
