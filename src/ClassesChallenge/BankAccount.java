package ClassesChallenge;

public class BankAccount {
    private String accountNumber;
    private double balance;
    private String name;
    private String email;
    private String phoneNumber;

    public BankAccount(){
        this("09876", 0.00, "Default Name", "Default Email", "Default Phone");
        System.out.println("Empty constructor called");
    }

    public BankAccount(String number, double balance, String customerName, String email, String phoneNumber){
        System.out.println("Account constructor with parameters called");
        this.accountNumber = number;
        this.balance = balance;
        name = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public BankAccount(String name, String email, String phoneNumber) {
        this("09999", 100.55, name, email, phoneNumber);
//        this.name = name;
//        this.email = email;
//        this.phoneNumber = phoneNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void depositFunds(double deposit){
        this.setBalance(this.balance+deposit);
    }

    public void withdrawFunds(double withdraw){
        if (withdraw > balance) {
            System.out.println("Insufficient funds");
        } else {
            this.setBalance(this.balance - withdraw);
        }
    }
}

