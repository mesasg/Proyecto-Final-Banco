
public class Account {
    int accountNumber;
    String client;
    double balance;
    
    /** Constructor cuenta
     * @param accountNumber nNmero de cuenta
     * @param client Cliente al cual pertenece
     * @param balance Dinero que tiene en la cuenta
     */
    public Account(int accountNumber, String client, double balance) {
        this.accountNumber = accountNumber;
        this.client = client;
        this.balance = balance;
    }
    /** Getter numero de cuenta
     * @return El numero de la cuenta
    */
    public int getAccountNumber() {
        return accountNumber;
    }
    /** Setter numero de cuenta
     * @param accountNumber Numero de la cuenta
     */
    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }
    /** Getter cliente
     * @return Cliente dueño de la cuenta
     */
    public String getClient() {
        return client;
    }
    /** Setter cliente 
     * @param client Cliente dueño de la cuenta
    */
    public void setClient(String client) {
        this.client = client;
    }
    /** Getter balance 
     * @return Cantidad de dinero que hay en la cuenta
    */
    public double getBalance() {
        return balance;
    }
    /** Setter balance
     * @param balance Cantidad de dinero que hay en la cuenta
     */
    public void setBalance(double balance) {
        this.balance = balance;
    }
   

    @Override
    public String toString() {
        return "Account [accountNumber=" + accountNumber + ", client=" + client + ", balance=" + balance;
    }
    
    
}
