import java.util.Scanner;
class f10
 {
    private double rate;
    private int time;
    private double principal;
    private double CI;
    
    public f10(double r, int t, double p)
    {
        rate = r;
        time = t;
        principal = p;
        CI = 0; 
    }
    public void calculateInterest()
    {
        double amount = principal * Math.pow((1 + rate / 100), time);
        CI = amount - principal;
    }
    public void display() 
    {
        System.out.printf("The compound interest is: %.2f\n", CI);
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the rate of interest per annum (in %): ");
        double rate = scanner.nextDouble();
        System.out.print("Enter the number of years: ");
        int time = scanner.nextInt();
        System.out.print("Enter the principal amount: ");
        double principal = scanner.nextDouble();
        f10 comp = new f10(rate, time, principal);
        comp.calculateInterest();
        comp.display();

        scanner.close();
    }
}
