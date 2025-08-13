abstract class bankaccount {
    int accountnumber;
    double balance;

    abstract public void deposit(int amount);
    abstract public void withdraw(int amount);
    abstract public double getbalance();
}

class savingbankaccount extends bankaccount {
    savingbankaccount(int accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    @Override
    public double getbalance() {
        return balance;
    }
}

class fixedbankaccount extends bankaccount {
    fixedbankaccount(int accountnumber, double balance) {
        this.accountnumber = accountnumber;
        this.balance = balance;
    }

    @Override
    public void deposit(int amount) {
        balance += amount;
    }

    @Override
    public void withdraw(int amount) {
        throw new UnsupportedOperationException("Withdrawals not allowed on fixed accounts");
    }

    @Override
    public double getbalance() {
        return balance;
    }
}

public class p1 {
    public static void main(String[] args) {
        bankaccount acc1 = new savingbankaccount(101, 5000);
        acc1.deposit(1000);
        acc1.withdraw(2000);
        System.out.println("Saving Account Balance: ₹" + acc1.getbalance());

        bankaccount acc2 = new fixedbankaccount(102, 10000);
        acc2.deposit(500);
        System.out.println("Fixed Account Balance: ₹" + acc2.getbalance());
        acc2.withdraw(1000); 
    }
}

 
 