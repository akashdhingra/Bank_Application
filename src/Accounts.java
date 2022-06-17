public abstract class Accounts implements IBaseRate {

    // List common properties for savings and checking account
    String name;
    String SocialSecurityNumber;
    String accountNumber;
    static int index = 10000;
    double balance;
    double rate;

    // Constructor to set base properties and initialize the account
    public Accounts(String name, String SSN, float deposit)
    {
        this.name = name;
        SocialSecurityNumber = SSN;
        balance = deposit;
        System.out.println("Name: "+ name + " SSN : " + SocialSecurityNumber + " Balance: $" + balance);

        ++index;

        // Account number
        this.accountNumber = setAccountNumber();
        System.out.println("Account No: " + accountNumber);
    }

    // set Account number
    private String setAccountNumber()
    {
        String SSN_sub = SocialSecurityNumber.substring(SocialSecurityNumber.length()-2,SocialSecurityNumber.length());
        int count = index;
        int rand = (int)(Math.random() * Math.pow(10,3));
        return SSN_sub + index + rand;
    }

    // List common methods
}
