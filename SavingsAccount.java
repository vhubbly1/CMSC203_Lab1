
// A SavingsAccount class that extends the BankAccount class
public class SavingsAccount extends BankAccount {
    // Static constant RATE representing the interest rate for the savings account
    private static final double RATE = 0.025;

    // Static variable to keep track of the number of savings accounts created
    private static int savingsNumber = 0;

    // Instance variable to store the account number of the savings account
    private String accountNumber;

    // Constructor to create a new SavingsAccount object with a given name and initial balance
    public SavingsAccount(String name, double initialBalance) {
        // Call the constructor of the parent BankAccount class with the given name and initial balance
        super(name, initialBalance);

        // Increment the savingsNumber to create a unique account number for this savings account
        savingsNumber++;

        // Concatenate the account number of the parent account with the savingsNumber to get a unique account number
        accountNumber = getAccountNumber() + "-" + savingsNumber;
    }

    // Method to add interest to the savings account based on the current balance and interest rate
    public void postInterest() {
        // Calculate the interest by multiplying the balance with the interest rate
        double interest = getBalance() * RATE;

        // Deposit the calculated interest amount into the savings account
        deposit(interest);
    }

    // Getter method to retrieve the account number of the savings account
    public String getAccountNumber() {
        return accountNumber;
    }

    // Constructor to create a new SavingsAccount object as a copy of an existing SavingsAccount object
    // with a given initial balance
    public SavingsAccount(SavingsAccount name, double initialBalance) {
        // Call the constructor of the parent BankAccount class, passing the name of the existing savings account and initial balance
        super(name, initialBalance);

        // Increment the savingsNumber to create a unique account number for this new savings account
        savingsNumber++;

        // Concatenate the account number of the existing savings account with the savingsNumber to get a unique account number for the new account
        accountNumber = name.getAccountNumber() + "-" + savingsNumber;
    }
}
