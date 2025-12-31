import java.util.*;
public class f1

{
    void in(int a, int b)
    {
        if(a>b)
        {
        System.out.println("This is  greater than B: "+a);
    }
    else if(a<b)
    {
        System.out.println("This is  greater than A: "+b);
    }
    else
    {
        System.out.print("equal");
    }
}
void ch(char ch1 , char ch2)
{
    if ((int)ch1 > (int)ch2)
    {
        System.out.println("Character with higher numeric value : "+ch1);
    }
    else if((int)ch2 > (int)ch1)
    {
        System.out.println("Charater with higher numeric value is : " +ch2);
    }
    else 
    {
        System.out.println("Both are equal");
    }
}
void str(String s1, String s2)
{
    if(s1.length() > s2.length())
    {
        System.out.println("longer string:" +s1);
    }
    else if(s2.length() > s1.length())
    {
        System.out.println("longer string:" +s2);
    }
    else
    {
        System.out.println("Equal string!" );
    }
}
    public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter first number: ");
            int a= sc.nextInt();
            System.out.println("Enter second number: ");
            int b= sc.nextInt();
            
            System.out.println("Enter character: ");
            char ch1= sc.next().charAt(0);
            System.out.println("Enter character: ");
            char ch2= sc.next().charAt(0);
            sc.nextLine();
            
            System.out.println("Enter first string: ");
            String s1= sc.nextLine();
            System.out.println("Enter second string: ");
            String s2= sc.nextLine();
            f1 obj=new f1();
            obj.in(a, b);
            obj.ch(ch1,ch2);
            obj.str(s1,s2);
        }
    }

