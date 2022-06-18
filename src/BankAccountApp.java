import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        String file = "/Users/akashdhingra/Desktop/Coding courses/Java Projects/Bank_Application/NewBankAccounts.csv";

//        Checking checkacc1 = new Checking("Akash","123456789",1200);
//        Savings saveacc1 = new Savings("Dhingra","987654321", 800);
//        checkacc1.showInfo();
//        System.out.println("***************");
//        saveacc1.showInfo();

        // Read a CSV file
        List<String[]> newAccountHolder = CSV.read(file);
        for(String[] accountHolder : newAccountHolder)
        {
            String name = accountHolder[0];
            String SSN = accountHolder[1];
            String AccType = accountHolder[2];
            double balance = Double.parseDouble(accountHolder[3]);
            System.out.println("Name: "+name + ", SSN: " + SSN + ", AccType: " + AccType + ", Balance: "+balance);
        }

    }
}