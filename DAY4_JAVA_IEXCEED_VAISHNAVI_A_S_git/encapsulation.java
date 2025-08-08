class BankAccount{
    private String AccountHolder;
    private double balance;
    BankAccount(String AccountHolder,double balance){
        this.AccountHolder=AccountHolder;
        this.balance=balance;

    }
    public String getAccountHolder(){
        return AccountHolder;

    }
    public double getBalance(){
        return balance;

    }


}
public class encapsulation {
    public static void main(String[] args) {
        BankAccount user1=new BankAccount("raj",2000.0 );
        System.out.println(user1.getAccountHolder());
        System.out.println(user1.getBalance());
    }

}
































// class BankAccount {
//     private String accountHolder;
//     private double balance;

//     BankAccount(String accountHolder, double balance) {
//         this.accountHolder = accountHolder;
//         this.balance = balance;
//     }

//     public String getAccountHolder() {
//         return accountHolder;
//     }

//     public double getBalance() {
//         return balance;
//     }

//     public void deposit(double amount) {
//         if (amount > 0)
//             balance += amount;
//     }

//     public void withdraw(double amount) {
//         if (amount > 0 && amount <= balance)
//             balance -= amount;
//     }
// }

// class DemoBank {
//     public static void main(String[] args) {
//         BankAccount acc = new BankAccount("Priya", 5000.0);
//         System.out.println("Holder: " + acc.getAccountHolder());
//         System.out.println("Balance: ₹" + acc.getBalance());

//         acc.deposit(1500.0);
//         System.out.println("After deposit: ₹" + acc.getBalance());

//         acc.withdraw(2000.0);
//         System.out.println("After withdrawal: ₹" + acc.getBalance());
//     }
// }
