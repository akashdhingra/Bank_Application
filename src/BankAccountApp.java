import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Accounts> accounts = new LinkedList<Accounts>();
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
            double deposit = Double.parseDouble(accountHolder[3]);
            System.out.println("Name: "+name + ", SSN: " + SSN + ", AccType: " + AccType + ", Balance: "+deposit);
            if(AccType.equals("Savings"))
            {
                System.out.println("Opening a Savings Account");
                accounts.add(new Savings(name, SSN, deposit));
            }
            else if(AccType.equals("Checking"))
            {
                System.out.println("Opening a Checking Account");
                accounts.add(new Checking(name, SSN, deposit));
            }
            else
                System.out.println("Error reading account type!!!");
        }
        for(Accounts acc : accounts)
        {
            System.out.println("\n***************************");
            acc.showInfo();
        }

    }
}