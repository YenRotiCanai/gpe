public class Main { 
    public static void main(String[] args) {
        Account account = new Account();
        System.out.println("帳戶: " + account.getAccountNumber()); 
        System.out.println("餘額: " + account.getBalance()); 

        account = new Account("123-4567", 100.0);
        account.deposit(1000.0);
        System.out.println("帳戶: " + account.getAccountNumber()); 
        System.out.println("餘額: " + account.getBalance()); 
    } 
}

public class Account {
    private String accountNumber;
    private double balance;

    public Account() {
        this("empty", 0.0);
    }

    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double money) {
        balance += money;
    }

    public double withdraw(double money) {
        balance -= money;
        return money;
    }
}

