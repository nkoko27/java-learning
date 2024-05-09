package ClassesChallenge;

public class ClassesChallenge {
    public static void main(String[] args) {
        BankAccount empty = new BankAccount();
        BankAccount bankAccount = new BankAccount("12345", 1000.00, "Bob Brown", "myemail@bob.com", "(087) 123-4567");
        System.out.println(bankAccount.getBalance());
        bankAccount.depositFunds(1000.00);
        System.out.println(bankAccount.getBalance());
        bankAccount.withdrawFunds(500.00);
        System.out.println(bankAccount.getBalance());
        System.out.println(empty.getName());

        BankAccount nicks = new BankAccount("Nick", "nick@email", "12345" );
        System.out.println(nicks.getAccountNumber() + " " + nicks.getName());
    }
}
