import java.util.Scanner;
public class po9 
{
    public void compare(int num1, int num2) 
    {
        if(num1 > num2) 
        {
            System.out.println("Greater integer: " + num1);
        } 
        else 
        {
            System.out.println("Greater integer: " + num2);
        }
    }
    
     public void compare(char ch1, char ch2)
     {
        System.out.println("ASCII values:");
        System.out.println(ch1 + ": " + (int)ch1);
        System.out.println(ch2 + ": " + (int)ch2);
        
        if(ch1 > ch2) {
            System.out.println("Character with higher ASCII value: " + ch1 + " (" + (int)ch1 + ")");
        } 
        else
        {
            System.out.println("Character with higher ASCII value: " + ch2 + " (" + (int)ch2 + ")");
        }
    }
    
    public void compare(String str1, String str2)
    {
        if(str1.length() > str2.length()) 
        {
            System.out.println("Longer string: " + str1);
        } 
        else
        {
            System.out.println("Longer string: " + str2);
        }
    }

    public static void main(String[] args) 
    {
        po9 comparator = new po9();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter two integers:");
        int int1 = sc.nextInt();
        int int2 = sc.nextInt();
        
        sc.nextLine(); 
        
        System.out.println("Enter two characters:");
        char char1 = sc.nextLine().charAt(0);
        char char2 = sc.nextLine().charAt(0);
        
        System.out.println("Enter two strings:");
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        
        System.out.println("\nComparison Results:");
        comparator.compare(int1, int2);     
        comparator.compare(char1, char2);     
        comparator.compare(str1, str2);     
        
        sc.close();
    }
}
