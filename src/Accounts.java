public abstract class Accounts implements IBaseRate {

    // List common properties for savings and checking account
    String name;
    String SocialSecurityNumber;
    String accountNumber;
    double balance;
    double rate;

    // Constructor to set base properties and initialize the account
    public Accounts(String name, String SSN, float deposit)
    {
        this.name = name;
        SocialSecurityNumber = SSN;
        balance = deposit;
        System.out.println("Name: "+ name + " SSN : " + SocialSecurityNumber + " Balance: $" + balance);
    }

    // List common methods
}
