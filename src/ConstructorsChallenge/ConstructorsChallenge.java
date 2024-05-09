package ConstructorsChallenge;

public class ConstructorsChallenge {

    public static void main(String[] args) {
        Customer nick = new Customer();
        Customer full = new Customer("nick", 2000.00, "nick@nite.com");
        Customer fake = new Customer("ehy", "ehy@ai.com");

        System.out.println(nick.getName());
        System.out.println(fake.getCreditLimit());
        System.out.println(full.getCreditLimit());
    }
}
