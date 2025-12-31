import java.util.Scanner;
public class po8
 {
    public static void polygon(int n, char ch)
    {
        for (int i = 0; i < n; i++) 
        {
            for (int j = 0; j < n; j++)
            {
                System.out.print(ch);
            }
            System.out.println();
        }
    }

    public static void polygon(int x, int y) 
    {
        for (int i = 0; i < x; i++)
        {
            for (int j = 0; j < y; j++)
            {
                System.out.print('@');
            }
            System.out.println();
        }
    }
    public static void polygon() 
    {
        for (int i = 1; i <= 3; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print('*');
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Select polygon type:");
        System.out.println("1. Square (n, ch)");
        System.out.println("2. Rectangle (x, y)");
        System.out.println("3. Triangle");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();

        switch (choice)
        {
            case 1:
                System.out.print("Enter side length (n): ");
                int nSide = scanner.nextInt();
                System.out.print("Enter character (ch): ");
                char ch = scanner.next().charAt(0);
                polygon(nSide, ch);
                break;
                
            case 2:
                System.out.print("Enter length (x): ");
                int xLen = scanner.nextInt();
                System.out.print("Enter breadth (y): ");
                int yBre = scanner.nextInt();
                polygon(xLen, yBre);
                break;
                
            case 3:
                polygon();
                break;
                
            default:
                System.out.println("Invalid choice!");
        }
        scanner.close();
    }
}
