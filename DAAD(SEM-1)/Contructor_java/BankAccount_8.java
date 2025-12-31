import java.util.*;
 class BankAccount_8 
 {
    int AcNum;
    String AcName;
    double AcBalance;

    // Default constructor 
    public BankAccount_8 () {
        AcNum = 0;
        AcName= " ";
        AcBalance= 0.0;
    }
    // parameterized constructor
    public BankAccount_8 (int num, String name, double balance) 
    {
       AcNum = num;
       AcName = name;
       AcBalance=balance;
    }
    
    void displayAccount() {
        System.out.println("Account Number: " + AcNum);
        System.out.println("Account Holder: " + AcName);
        System.out.println("Account Balance: " + AcBalance);
    }

    //Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Account Number: ");
        int num = sc.nextInt();
        sc.nextLine();  

        System.out.print("Enter Account Holder Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Account Balance: ");
        double balance = sc.nextDouble();
        
        BankAccount_8 obj = new BankAccount_8(num, name, balance);
        obj.displayAccount();

        sc.close();
    }
}