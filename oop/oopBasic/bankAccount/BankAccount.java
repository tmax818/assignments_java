
class BankAccount {

    double checkingBalance;
    double savingsBalance;
    static int numberOfAccounts;
    static double totalDeposits;

    public double getCheckingBalance() {
        return this.checkingBalance;
    }

    public void setCheckingBalance(double amount) {
        this.checkingBalance += amount;
        BankAccount.totalDeposits += this.checkingBalance;
    }

    public double getSavingsBalance() {
        return this.savingsBalance;
    }

    public void setSavingsBalance(double savingsBalance) {
        this.savingsBalance = savingsBalance;
    }
    
    public BankAccount(){
        BankAccount.numberOfAccounts += 1;
    }
}