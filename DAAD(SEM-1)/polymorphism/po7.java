import java.util.Scanner;
public class po7
{
    public double series(double n) 
    {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) 
        {
            sum += 1.0 / i;
        }
        return sum;
    }
    public double series(double a, double n) 
    {
        double sum = 0.0;
        for (int i = 0; i < n; i++) 
        {
            sum += (3 * i + 1) / Math.pow(a, 3 * i + 2);
        }
        return sum;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        po7 calculator = new po7();
        
        System.out.println("Enter a positive integer n for the first series (1/n + 1/(n-1) + ... + 1/1):");
        double n1 = scanner.nextDouble();
        if (n1 <= 0) 
        {
            System.out.println("Please enter a positive number.");
        } else
        {
            double result1 = calculator.series(n1);
            System.out.printf("Sum of the series 1/1 + 1/2 + ... + 1/%.0f = %.4f\n", n1, result1);
        }
        
        System.out.println("Enter a positive number a and a positive integer n for the second series:");
        double a = scanner.nextDouble();
        double n2 = scanner.nextDouble();
        if (a <= 0 || n2 <= 0) {
            System.out.println("Please enter positive numbers for a and n.");
        } else {
            double result2 = calculator.series(a, n2);
            System.out.printf("Sum of the series 1/%.2f^2 + 4/%.2f^5 + ... to %.0f terms = %.4f\n", a, a, n2, result2);
        }
        scanner.close();
    }
}
