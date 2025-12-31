import java.util.Scanner;

class f14
 {
    private double dollars;
    private double euros;
    private double rupeesFromDollars;
    private double rupeesFromEuros;

    public void accept(double dollarAmount, double euroAmount) 
    {
        dollars = dollarAmount;
        euros = euroAmount;
    }

    public void convert() 
    {
        final double DOLLAR_TO_RUPEE_RATE = 82.5;  
        final double EURO_TO_RUPEE_RATE = 88.2;    
        
        rupeesFromDollars = dollars * DOLLAR_TO_RUPEE_RATE;
        rupeesFromEuros = euros * EURO_TO_RUPEE_RATE;
    }

    public void showResult() 
    {
        System.out.printf("%.2f USD = %.2f INR\n", dollars, rupeesFromDollars);
        System.out.printf("%.2f EURO = %.2f INR\n", euros, rupeesFromEuros);
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter amount in US Dollars: ");
        double dollarAmount = scanner.nextDouble();
        
        System.out.print("Enter amount in Euros: ");
        double euroAmount = scanner.nextDouble();
        
        f14 currencyConverter = new f14();
        currencyConverter.accept(dollarAmount, euroAmount);
        currencyConverter.convert();
        currencyConverter.showResult();
        
        scanner.close();
    }
}
