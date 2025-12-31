import java.util.*;
public class f3

{
    void cale(int num, char ch)
    {
        if(ch=='s')
        {
        System.out.println("The square of the given number is :"+(num*num));
    }
    else 
    {
        System.out.println("The cube of the given number is : "+(num*num*num));
    }    
}
void calc(int num1,int num2, char cho)
{
    if (cho=='p')
    {
        System.out.println("The product of the two numbers are as follows: "+(num1*num2));
    }
    else 
    {
        System.out.println("The sum of both the numbers are as follows:"+(num1+num2));
    }
}
void calc(String s1, String s2)
{
    if(s1.equals(s2))
    {
        System.out.println("the both stringss are equal !");
    }
    else
    {
        System.out.println("Not equal!" );
    }
}
    public static void main(String[]args)
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number: ");
            int num= sc.nextInt();
            System.out.println("Enter your choice(press 's' for findinfg the square & any other key for cube: ");
            char ch= sc.next().charAt(0);;
            
            System.out.println("Enter the first number: ");
            int num1= sc.nextInt();
            System.out.println("Enter the second number: ");
            int num2= sc.nextInt();
            System.out.println("Enter your choice(press 'p' for findinfg the product & any other key for addition: ");
            char cho= sc.next().charAt(0);
            sc.nextLine();
  
            
            System.out.println("Enter first string: ");
            String s1= sc.nextLine();
            System.out.println("Enter second string: ");
            String s2= sc.nextLine();
            f3 obj=new f3();
            obj.cale(num,ch);
            obj.calc(num1,num2,cho);
            obj.calc(s1,s2);
        }
    }

