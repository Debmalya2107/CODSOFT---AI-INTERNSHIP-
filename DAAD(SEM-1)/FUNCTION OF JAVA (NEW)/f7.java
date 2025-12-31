import java.util.Scanner;
class f7 {
    private int ac_num;   
    private String ac_name;  
    private double bal;      

    
    public f7(int _ac_num, String _ac_name, double _bal) {
        ac_num = _ac_num;
        ac_name = _ac_name;
        bal = _bal;
    }

    
    public void display() {
        System.out.println("\nAccount Details:");
        System.out.println("Account Number: " + ac_num);
        System.out.println("Account Holder: " + ac_name);
        System.out.println("Current Balance: $" + bal);
    }

    
    public void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            System.out.println("\nDeposited: $" + amount);
            display();
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid withdrawal amount.");
        } else if (amount > bal) {
            System.out.println("\nInsufficient funds. Current balance: $" + bal);
        } else {
            bal -= amount;
            System.out.println("\nWithdrawn: $" + amount);
            display();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Bank Account System");
        System.out.println("-------------------");
        
        
        System.out.print("Enter account number: ");
        int accNumber = sc.nextInt();
        sc.nextLine(); 
        
        System.out.print("Enter account holder name: ");
        String accName = sc.nextLine();
        
        
        double initialBalance = 2234000;
        f7 account = new f7(accNumber, accName, initialBalance);
        
        
        account.display();
        
        
        System.out.print("\nEnter deposit amount: $");
        double depositAmount = sc.nextDouble();
        account.deposit(depositAmount);
        
        
        System.out.print("\nEnter withdrawal amount: $");
        double withdrawAmount = sc.nextDouble();
        account.withdraw(withdrawAmount);
        
        sc.close();
        System.out.println("\nTransaction completed. Thank you!");
    }
}
