public class Checking extends Accounts{
    // List properties specific for checking account
    private int DebitCardNumber;
    private int DebitCardPin;

    // Constructor to initialize settings for the checking properties
    public Checking(String name, String SSN, float deposit){
        super(name, SSN, deposit);
        accountNumber = "2" + accountNumber;
        DebitCardInfo();
    }

    @Override
    public void setRate() {
        rate = getBaseRate() * 0.15;
    }

    private void DebitCardInfo()
    {
        DebitCardNumber = (int)(Math.random() * Math.pow(10,12));
        DebitCardPin = (int)(Math.random() * Math.pow(10,4));
    }

    // List any methods specific for checking account
    public void showInfo()
    {
        super.showInfo();
        System.out.println("Checking Account feature- " +
                "\nDebit Card Number: " + DebitCardNumber +
                "\nDebit Card Pin: " + DebitCardPin +
                "\nBase rate: " + rate
        );
    }
}
