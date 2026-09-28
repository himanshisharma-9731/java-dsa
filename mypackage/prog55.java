package mypackage;
abstract class Account {
    int accountNumber;
    String holderName;
    double balance;

    Account(int n, String name, double b) {
        accountNumber = n;
        holderName = name;
        balance = b;
    }

    abstract void deposit(double amount);
    abstract void withdraw(double amount);

    void display() {
        System.out.println("Account No: " + accountNumber);
        System.out.println("Name: " + holderName);
        System.out.println("Balance: " + balance);
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int n, String name, double b, double rate) {
        super(n, name, b);
        interestRate = rate;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (balance - amount >= 2000) {
            balance = balance - amount;
        } else {
            System.out.println("Minimum balance of 2000 required");
        }
    }

    void applyInterest() {
        balance = balance + balance * interestRate / 100;
    }
}

class CurrentAccount extends Account {
    double overdraftLimit;

    CurrentAccount(int n, String name, double b, double limit) {
        super(n, name, b);
        overdraftLimit = limit;
    }

    void deposit(double amount) {
        balance = balance + amount;
    }

    void withdraw(double amount) {
        if (amount <= balance + overdraftLimit) {
            balance = balance - amount;
        } else {
            System.out.println("Overdraft limit exceeded");
        }
    }

    void checkOverdraft() {
        System.out.println("Remaining overdraft: "
                + (overdraftLimit + balance));
    }
}

public class prog55 {
    public static void main(String[] args) {

        Account a1 = new SavingsAccount(
                101, "Aman", 10000, 5);

        Account a2 = new CurrentAccount(
                102, "Riya", 5000, 3000);

        a1.deposit(2000);
        a1.withdraw(1000);

        a2.deposit(1000);
        a2.withdraw(7000);

        a1.display();
        System.out.println();

        a2.display();

        System.out.println();

        ((SavingsAccount)a1).applyInterest();
        System.out.println("Savings balance after interest: "
                + a1.balance);

        ((CurrentAccount)a2).checkOverdraft();
    }
}