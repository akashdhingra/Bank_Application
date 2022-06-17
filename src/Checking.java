public class Checking extends Accounts{
    // List properties specific for checking account
    int DebitCardNumber;
    int DebitCardPin;

    // Constructor to initialize settings for the checking properties
    public Checking(String name, String SSN, float deposit){
        super(name, SSN, deposit);
        accountNumber = "2" + accountNumber;
        System.out.println("Account No: " + accountNumber);
        System.out.println("NEW CHECKING ACCOUNT");
    }

    // List any methods specific for checking account
}
