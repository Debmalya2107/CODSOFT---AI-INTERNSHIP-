import java.util.*;

public class Po1 {
    // Parameterized constructor for exponential series
    public Po1(int x, int n) {
        s1(x, n);
    }

    // Default constructor
    public Po1() {
        // This constructor can be empty or initialize default values
    }

    void s1(int x, int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += Math.pow(x, i);
        }
        System.out.println("Sum of the exponential series: " + sum);
    }

    void s2(int p) {
        System.out.print("The cubic series is: ");
        for (int i = 1; i <= p; i++) {
            int term = (int) (Math.pow(i, 3) - 1);
            System.out.print(term);
            if (i < p) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void series() {
        double sum = 0.0;
        for (int i = 2; i <= 10; i++)
        {
            sum =sum+1.0 / i;
        }
        System.out.println("Sum of harmonic series: " + String.format("%.4f", sum));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Choose a series to print:");
        System.out.println("1. Exponential Series (x^1 + x^2 + ... + x^n)");
        System.out.println("2. Cubic Series (0, 7, 26, 63, ...)");
        System.out.println("3. Harmonic Series (1/2 + 1/3 + ... + 1/10)");
        System.out.print("Enter your choice (1-3): ");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the base number (x):");
                int x = sc.nextInt();
                System.out.println("Enter the number of terms (n):");
                int n = sc.nextInt();
                Po1 obj1 = new Po1(x, n); 
                break;
            case 2:
                System.out.println("Enter the number of terms for cubic series:");
                int p = sc.nextInt();
                Po1 obj2 = new Po1(); 
                obj2.s2(p);
                break;
            case 3:
                series(); 
                break;
            default:
                System.out.println("Invalid choice!");
        }
        sc.close(); // Close the scanner
    }
}
