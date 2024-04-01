// Base class BankAccount
class BankAccount {
    protected double balance;
    
    // Constructor
    public BankAccount(double initialBalance) {
        balance = initialBalance;
    }
    
    // Method to deposit money
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: $" + amount);
        System.out.println("Current Balance: $" + balance);
    }
    
    // Method to withdraw money (to be overridden by subclasses)
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

// Subclass SavingsAccount
class SavingsAccount extends BankAccount {
    private static final double WITHDRAWAL_LIMIT = 500.0;
    
    // Constructor
    public SavingsAccount(double initialBalance) {
        super(initialBalance);
    }
    
    // Override withdraw method to impose withdrawal limit
    @Override
    public void withdraw(double amount) {
        if (amount <= balance && amount <= WITHDRAWAL_LIMIT) {
            balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Withdrawal amount exceeds withdrawal limit or insufficient funds!");
        }
    }
}

// Subclass CheckingAccount
class CheckingAccount extends BankAccount {
    private static final double WITHDRAWAL_FEE = 1.0;
    
    // Constructor
    public CheckingAccount(double initialBalance) {
        super(initialBalance);
    }
    
    // Override withdraw method to impose withdrawal fee
    @Override
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            balance -= WITHDRAWAL_FEE; // Apply withdrawal fee
            System.out.println("Withdrawn: $" + amount);
            System.out.println("Withdrawal Fee: $" + WITHDRAWAL_FEE);
            System.out.println("Current Balance: $" + balance);
        } else {
            System.out.println("Insufficient funds!");
        }
    }
}

public class practical21 {
    public static void main(String[] args) {
        // Create objects of each class
        SavingsAccount savingsAccount = new SavingsAccount(1000);
        CheckingAccount checkingAccount = new CheckingAccount(1500);
        
        // Demonstrate deposit and withdrawal for savings account
        System.out.println("Savings Account:");
        System.out.println("Initial Balance: $" + savingsAccount.balance);
        savingsAccount.deposit(500);
        savingsAccount.withdraw(200);
        savingsAccount.withdraw(700);
        System.out.println();
        
        // Demonstrate deposit and withdrawal for checking account
        System.out.println("Checking Account:");
        System.out.println("Initial Balance: $" + checkingAccount.balance);
        checkingAccount.deposit(300);
        checkingAccount.withdraw(100);
        checkingAccount.withdraw(1800);
        
    }
}