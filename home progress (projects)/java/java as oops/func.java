import java.util.*;
class fact
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        int a = sc.nextInt();
        
        fac(a);
    }
    public static void fac(int a)
    {
        int facto=1;
        for(int i=1;i<=a;i++)
        {
            facto=facto*i;
        }
        System.out.println("the factorial of the given number is:"+facto);
    }
}