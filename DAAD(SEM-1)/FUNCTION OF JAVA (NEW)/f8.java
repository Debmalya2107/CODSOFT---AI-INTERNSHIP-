import java.util.Scanner;
public class f8 
{
    
    private String cust_id;
    private String cust_name;
    private String cust_Add;
    private double due_amt;      
    private double amount_to_pay; 

    
    public f8(String id, String name, String address, double due, double toPay) {
        cust_id = id;
        cust_name = name;
        cust_Add = address;
        due_amt = due;
        amount_to_pay = toPay;
    }

    
    public void getValues() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Customer ID: ");
        cust_id = scanner.nextLine();

        System.out.print("Enter Customer Name: ");
        cust_name = scanner.nextLine();

        System.out.print("Enter Customer Address: ");
        cust_Add = scanner.nextLine();

        System.out.print("Enter Amount Due TO Customer (Credit/Refund): $");
        due_amt = scanner.nextDouble();

        System.out.print("Enter Amount to Pay BY Customer (Bill): $");
        amount_to_pay = scanner.nextDouble();
    }

    
    public double calculate() {
        return amount_to_pay - due_amt; 
    }

    
    public void display() {
        System.out.println("\n--- Customer Details ---");
        System.out.println("ID: " + cust_id);
        System.out.println("Name: " + cust_name);
        System.out.println("Address: " + cust_Add);
        System.out.println("Amount Due TO Customer (Credit): $" + due_amt);
        System.out.println("Amount to Pay BY Customer (Bill): $" + amount_to_pay);
        System.out.println("Net Amount to Pay: $" + calculate());
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        f8 customer = new f8("", "", "", 0.0, 0.0);

        System.out.println("Enter Customer Details:");
        customer.getValues(); 
        customer.display();   

        scanner.close();
    }
}