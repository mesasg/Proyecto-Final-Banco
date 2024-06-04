
public class Account {
    int accountNumber;
    String client;
    double balance;
    
    /** Constructor cuenta */
    public Account(int accountNumber, String client, double balance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }
    /** getter numero de cueta*/
    public int getAccountNumber() {
        return accountNumber;
    }
    /** setter numero de cuenta */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /** getter cliente */
    public String getClient() {
        return client;
    }
    /** setter cliente */
    public void setClient(String client) {
        this.client = client;
    }
    /** getter balance */
    public double getBalance() {
        return balance;
    }
    /** Setter balance */
    public void setBalance(double balance) {
        this.balance = balance;
    }
   

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", client=" + client + ", balance=" + balance;
    }
    
    
}
