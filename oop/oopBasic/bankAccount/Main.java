public class Main {
    
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        int number = BankAccount.numberOfAccounts;
        b1.setCheckingBalance(100);
        
        System.out.println(number);
    }
}
