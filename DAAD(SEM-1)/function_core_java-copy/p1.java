//default function
import java.util.*;
public class p1
{
    Scanner sc=new Scanner(System.in);
    int a,b,c;//global variable declaration
    void input()
    {
        System.out.println("Enter first number: ");
        a=sc.nextInt();
        System.out.println("Enter second number: ");
        b=sc.nextInt();
    }
    void cal()
    {
        c=a+b;
    }
    void display()
    {
        System.out.println("Addition is: "+c);
    }
}