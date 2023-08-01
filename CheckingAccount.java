// A CheckingAccount class that extends the BankAccount class
public class CheckingAccount extends BankAccount {

    // Static constant FEE representing the withdrawal fee for the checking account
    private static final double FEE = 0.15;

    // Constructor to create a new CheckingAccount object with a given name and initial balance
    public CheckingAccount(String name, double initialBalance) {
        // Call the constructor of the parent BankAccount class with the given name and initial balance
        super(name, initialBalance);

        // Modify the account number by appending "-10" at the end
        setAccountNumber(getAccountNumber() + "-10");
    }

    // Method to withdraw money from the checking account, including the withdrawal fee
    // Returns true if the withdrawal is successful, otherwise false
    public boolean withdraw(double amount) {
        // Calculate the total amount to be withdrawn, including the fee
        double total = amount + FEE;

        // Call the withdraw method of the parent BankAccount class with the total amount
        // This method will handle the actual withdrawal and check if there's enough balance
        return super.withdraw(total);
    }
}


