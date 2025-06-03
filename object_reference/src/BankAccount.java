public class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double balnace) {
        balance += 500;
    }

    public void displayBalance() {
        System.out.println("Initial Balance (" + owner + "):" + balance);
    }
}

