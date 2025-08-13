public class interface_seg {
    public static void main(String[] args) {
        System.out.println("=== Savings Account Operations ===");
        SavingsAccount sa = new SavingsAccount();
        sa.deposit(10000);
        sa.withdraw(2500);
        sa.openFixedDeposit(5000, 3);
        System.out.println("Final Balance: ₹" + sa.getBalance());

        System.out.println("\n=== Credit Card Department ===");
        CreditCardDepartment cc = new CreditCardDepartment();
        cc.issueCreditCard();

        System.out.println("\n=== Loan Department ===");
        LoanDepartment ld = new LoanDepartment();
        ld.processLoan();
    }
}
