import java.util.Scanner;

public class js2 
{

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int n1 = 5 * number * number + 4;
        int n2 = 5 * number * number - 4;

        int sqrtN1 = (int) Math.sqrt(n1);
        int sqrtN2 = (int) Math.sqrt(n2);

        if ((sqrtN1 * sqrtN1 == n1) || (sqrtN2 * sqrtN2 == n2)) 
        {
            System.out.println(number + " is a Fibonacci number.");
        }
        else 
        {
            System.out.println(number + " is not a Fibonacci number.");
        }

        scanner.close();
    }
}
