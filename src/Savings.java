public class Savings extends Accounts {

    // List properties specific for savings account
    int SafetyDepositBoxID;
    int SafetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String SSN, float deposit){
        super(name, SSN, deposit);
        accountNumber = "1" + accountNumber;
    }

    // List any methods specific for saving account
    public void showInfo()
    {
        super.showInfo();
        System.out.println("Account type : Savings Account");
    }
}
