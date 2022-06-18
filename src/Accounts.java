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

        ++index;
        // Account number
        this.accountNumber = setAccountNumber();
        setRate();
    }

    // set Account number
    private String setAccountNumber()
    {
        String SSN_sub = SocialSecurityNumber.substring(SocialSecurityNumber.length()-2);
        int count = index;
        int rand = (int)(Math.random() * Math.pow(10,3));
        return SSN_sub + index + rand;
    }

    // List common methods

    public abstract void setRate();

    public void deposit(double Amount)
    {
        balance = balance + Amount;
        System.out.println("Deposit of $" + Amount + " successfully done!");
        printBalance();
    }

    public void withDraw(double Amount)
    {
        balance = balance - Amount;
        System.out.println("Withdraw of $" + Amount + " successfully done!");
        printBalance();
    }

    public void Transfer(String toTransfer, double Amount)
    {
        balance = balance - Amount;
        System.out.println("Tranfer of $" + Amount + " successfully done to "+ toTransfer);
        printBalance();
    }

    public void printBalance()
    {
        System.out.println("Balance: $" + balance);
    }

    public void showInfo()
    {
        System.out.println("Name: " + name +
                "\nSSN : "+ SocialSecurityNumber +
                "\nAccount No: "+ accountNumber +
                "\nBalance: " + balance
        );
    }
}
