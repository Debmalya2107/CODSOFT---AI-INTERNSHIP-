import java.util.Scanner;
public class ATM 
{
    private double accountBalance;  

    public ATM() 
    {
        accountBalance = 200000.0;  
    }

    public void withdraw(double amountToWithdraw)
    {
        if (amountToWithdraw <= accountBalance)
        {
            accountBalance -= amountToWithdraw;
            System.out.println("Withdrawal successful! You have withdrawn:  \u20B9" + amountToWithdraw);
        } 
        else
        {
            System.out.println("Insufficient Funds!");
        }
    }

    public void deposit(double amountToDeposit) 
    {
        accountBalance += amountToDeposit;
        System.out.println("Deposit successful! You have deposited:  \u20B9" + amountToDeposit);
    }

    public void checkBalance() 
    {
        System.out.println("Your current balance is: \u20B9" + accountBalance);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        ATM atm = new ATM();
        int choice;

        do {
            System.out.println("\nATM Menu:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Please choose an option (1-4): ");
            choice = scanner.nextInt();

            switch (choice)
            {
                case 1:
                    System.out.print("Enter amount to withdraw:  \u20B9");
                    double withdrawAmount = scanner.nextDouble();
                    atm.withdraw(withdrawAmount);
                    break;
                case 2:
                    System.out.print("Enter amount to deposit:  \u20B9");
                    double depositAmount = scanner.nextDouble();
                    atm.deposit(depositAmount);
                    break;
                case 3:
                    atm.checkBalance();
                    break;
                case 4:
                    System.out.println("Thank you for using the ATM. Good Day!");
                    break;
                default:
                    System.out.println("Invalid option! Please choose again.");
            }
        } while (choice != 4);

        scanner.close();
    }
}
