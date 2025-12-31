import java.util.Scanner;

public class po5 
{
    public void joyString(String s, char ch1, char ch2) 
    {
        String newString = s.replace(ch1, ch2);
        System.out.println(newString);
    }
    
    public void joyString(String s)
    {
        int firstIndex = s.indexOf(' ');
        int lastIndex = s.lastIndexOf(' ');

        if (firstIndex != -1)
        {
            System.out.println("First index: " + firstIndex + " Last index: " + lastIndex);
        } else {
            System.out.println("No spaces found in the string.");
        }
    }
    
    public void joyString(String s1, String s2)
    {
        String combinedString = s1 + " " + s2;
        System.out.println(combinedString);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        po5 js = new po5();

        System.out.println("Enter a string for method (i):");
        String str1 = scanner.nextLine();
        System.out.println("Enter character to replace (ch1):");
        char ch1 = scanner.next().charAt(0);
        System.out.println("Enter character to replace with (ch2):");
        char ch2 = scanner.next().charAt(0);
        js.joyString(str1, ch1, ch2);
        scanner.nextLine(); 
        
        System.out.println("Enter a string for method (ii):");
        String str2 = scanner.nextLine();
        js.joyString(str2);

        System.out.println("Enter the first string for method (iii):");
        String str3 = scanner.nextLine();
        System.out.println("Enter the second string for method (iii):");
        String str4 = scanner.nextLine();
        js.joyString(str3, str4);

        scanner.close();
    }
}
