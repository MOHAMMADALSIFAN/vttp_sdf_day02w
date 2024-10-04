import src.BankAccount;

public class App {

    public static void main(String[] args) {
        // Test BankAccount
        BankAccount account = new BankAccount("John Doe", 1000);
        account.deposit(500);
        account.withdraw(200);
        account.displayTransactions();
        System.out.println("Balance: " + account.getBalance());
    }
}