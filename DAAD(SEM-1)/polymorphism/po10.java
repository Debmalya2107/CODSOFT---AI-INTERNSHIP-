import java.util.Scanner;

public class po10 
{
    public void num_calc(int num, char ch) 
    {
        if (ch == 's') 
        {
            System.out.println("Square of " + num + " is: " + (num * num));
        } else
        {
            System.out.println("Cube of " + num + " is: " + (num * num * num));
        }
    }
    
    public void num_calc(int a, int b, char ch)
    {
        if (ch == 'p') 
        {
            System.out.println("Product of " + a + " and " + b + " is: " + (a * b));
        } else 
        {
            System.out.println("Sum of " + a + " and " + b + " is: " + (a + b));
        }
    }

    public void num_calc(String s1, String s2) 
    {
        if (s1.equals(s2))
        {
            System.out.println("The strings are equal.");
        } else 
        {
            System.out.println("The strings are not equal.");
        }
    }

    public static void main(String[] args)
    {
        po10 calculator = new po10();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter an integer and a character (s for square, c for cube):");
        int num = sc.nextInt();
        char choice1 = sc.next().charAt(0);
        calculator.num_calc(num, choice1);

        System.out.println("Enter two integers and a character (p for product, any other for sum):");
        int a = sc.nextInt();
        int b = sc.nextInt();
        char choice2 = sc.next().charAt(0);
        calculator.num_calc(a, b, choice2);

        sc.nextLine(); 
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        calculator.num_calc(str1, str2);

        sc.close();
    }
}
