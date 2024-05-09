package ConstructorsChallenge;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer(){
        this("def name","def email");
    }

    public Customer(String name, double limit, String email){
        this.name = name;
        creditLimit = limit;
        this.email = email;
    }

    public Customer(String name, String email){
        this(name, 1000.00, email);
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmail() {
        return email;
    }
}
