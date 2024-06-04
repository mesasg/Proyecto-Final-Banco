public class Client {
    String name;
    int consecutive;
    int accountNumber;

    public Client(String name, int consecutive, int accountNumber) {
        this.name = name;
        this.consecutive = consecutive;
        this.accountNumber = accountNumber;
    }

    @Override
    public String toString() {
        return "Client [name=" + name + ", consecutive=" + consecutive + ", accountNumber=" + accountNumber + "]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getConsecutive() {
        return consecutive;
    }

    public void setConsecutive(int consecutive) {
        this.consecutive = consecutive;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    
}
