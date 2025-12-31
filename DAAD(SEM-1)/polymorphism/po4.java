import java.util.Scanner;

public class po4 {

    // Method to calculate the alternating series
    public void SumSeries(int n, double x) {
        double sum = 0.0;
        for (int i = 1; i <= n; i++) {
            double term = x / i;
            if (i % 2 == 0) {
                sum -= term;
            } else {
                sum += term;
            }
        }
        System.out.println("Sum of the series (up to " + n + " terms) is: " + sum);
    }

    // Method to calculate the sum of factorials from 1 to 20
    public void SumSeries() {
        long sum = 0;
        long factorial = 1;
        for (int i = 1; i <= 20; i++) {
            factorial *= i;
            sum += factorial;
        }
        System.out.println("Sum of factorials from 1 to 20 is: " + sum);
    }

    public static void main(String[] args) {
        po4 calculator = new po4();
        Scanner scanner = new Scanner(System.in);

        // Get user input for the first method
        System.out.println("Enter the number of terms (n):");
        int n = scanner.nextInt();
        
        System.out.println("Enter the value of x:");
        double x = scanner.nextDouble();
        
        // Call the first overloaded method with user input
        calculator.SumSeries(n, x);

        // Call the second overloaded method
        calculator.SumSeries();

        scanner.close();
    }
}
