import java.util.Scanner;
public class js10
 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int[] deno = {1000, 500, 100, 50, 20, 10, 5, 2, 1};
        System.out.print("Enter the amount (up to 5 digits): ");
        int amount = sc.nextInt();
        if (amount < 1 || amount > 99999)
        {
            System.out.println("Please enter a valid amount between 1 and 99999.");
            return;
        }
        System.out.println("Denomination breakdown for the amount: " + amount);
        for (int i = 0; i < deno.length; i++)
        {
            int count = 0;
            while (amount >= deno[i]) 
            {
                amount = amount- deno[i];
                count++;
            }
            if (count > 0)
            {
                System.out.println(deno[i] + " : " + count);
            }
        }
        sc.close();
    }
}
