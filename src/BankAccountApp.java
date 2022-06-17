public class BankAccountApp {
    public static void main(String[] args) {
        Checking checkacc1 = new Checking("Akash","123456789",1200);
        Savings saveacc1 = new Savings("Dhingra","987654321", 800);

        checkacc1.showInfo();
        System.out.println("***************");
        saveacc1.showInfo();
    }
}