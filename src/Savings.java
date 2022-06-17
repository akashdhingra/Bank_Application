public class Savings extends Accounts {

    // List properties specific for savings account
    int SafetyDepositBoxID;
    int SafetyDepositBoxKey;

    // Constructor to initialize settings for the savings properties
    public Savings(String name, String SSN, float deposit){
        super(name, SSN, deposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositInfo();
    }

    private void setSafetyDepositInfo()
    {
        SafetyDepositBoxID = (int)(Math.random() * Math.pow(10,3));
        SafetyDepositBoxKey = (int)(Math.random() * Math.pow(10,4));
    }

    // List any methods specific for saving account
    public void showInfo()
    {
        super.showInfo();
        System.out.println("Savings Account feature- " +
                "\nSafety Deposit Box ID: " + SafetyDepositBoxID +
                "\nSafety Deposit Box Key: " + SafetyDepositBoxKey
                );
    }
}
