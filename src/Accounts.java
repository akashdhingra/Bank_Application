public abstract class Accounts implements IBaseRate {

    // List common properties for savings and checking account
    String name;
    String SocialSecurityNumber;
    String accountNumber;
    double balance;
    double rate;

    // Constructor to set base properties and initialize the account
    public Accounts(String Name)
    {
        System.out.println("Name : "+ Name);
    }

    // List common methods
}
