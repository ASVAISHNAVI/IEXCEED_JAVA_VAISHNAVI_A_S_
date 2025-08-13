public class SavingsAccount implements DepositService, WithdrawService, FixedDepositService {
    private double balance = 0;

    @Override
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited ₹" + amount + " | Current Balance: ₹" + balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrew ₹" + amount + " | Current Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance. Withdrawal of ₹" + amount + " failed.");
        }
    }

    @Override
    public void openFixedDeposit(double amount, int years) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Opened Fixed Deposit of ₹" + amount + " for " + years + " years.");
            System.out.println("Remaining Balance: ₹" + balance);
        } else {
            System.out.println("Insufficient balance to open Fixed Deposit.");
        }
    }

    public double getBalance() {
        return balance;
    }
}
