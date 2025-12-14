abstract class Bank {

    abstract void accountType();
}

class BankAccount extends Bank {

    private int balance;

    public void setBalance(int amount) {
        System.out.println("ENCAPSULATION: Setting balance using setter method");
        balance = amount;
    }

    public int getBalance() {
        System.out.println("ENCAPSULATION: Getting balance using getter method");
        return balance;
    }

    void accountType() {
        System.out.println("ABSTRACTION: Bank account type method");
    }
}

class SavingsAccount extends BankAccount {

    void accountType() {
        System.out.println("POLYMORPHISM: Overridden method in SavingsAccount");
        System.out.println("INHERITANCE: SavingsAccount uses BankAccount features");
    }
}

public class OOPS
{

    public static void main(String[] args) {

        System.out.println("Creating object using parent reference");
        BankAccount acc = new SavingsAccount();

        System.out.println("Calling encapsulated methods");
        acc.setBalance(5000);
        System.out.println("Balance = " + acc.getBalance());

        System.out.println("Calling abstract method implementation");
        acc.accountType();
    }
}
