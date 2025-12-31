import java.util.Scanner;
public class po3
 {
    void check(String str, char ch) 
    {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == ch) 
            {
                count++;
            }
        }
        System.out.println("Number of '" + ch + "' present is = " + count);
    }
    void check(String s1)
    {
        String lowerStr = s1.toLowerCase();
        System.out.print("Vowels in '" + s1 + "': ");
        for (int i = 0; i < lowerStr.length(); i++) 
        {
            char c = lowerStr.charAt(i);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                System.out.print(c + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        po3 checker = new po3();
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Testing character frequency:");
        System.out.print("Enter a string: ");
        String inputStr = scanner.nextLine();
        System.out.print("Enter character to count: ");
        char inputChar = scanner.next().charAt(0);
        checker.check(inputStr, inputChar);
        
        scanner.nextLine();  
        
        // Test second method
        System.out.println("\nTesting vowel extraction:");
        System.out.print("Enter a string: ");
        String inputStr2 = scanner.nextLine();
        checker.check(inputStr2);
        
        scanner.close();
    }
}
