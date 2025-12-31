//parameterised function with  return type
import java.util.*;
public class fnif13    
{
    void input()
    {
        double a,b,result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("\t \t calculator:\t \t ");
        System.out.println("enter 1st number");
        a=sc.nextInt();
        System.out.println("enter 2nd number");
        b=sc.nextInt();
        System.out.println("\n enter your choice(1.addition// 2.subtraction //3.multification//4.division:");
        char ch=sc.next().charAt(0);
        double res = display1(a, b,ch,result);  // calling function with parameters
        System.out.println("Result: " + res);
    } 
        double display1 (double a, double b ,char ch, double result)
        {
        
        switch(ch)
        { 
            case '1': 
                result = a + b;
                break;
            case '2':
                result = a - b;
                break;
            case '3':
                result = a * b;
                break;
            case '4':
                if (b == 0) {
                    System.out.println("Error: Cannot divide by zero.");
                    return 0;
                }
                result = a / b;
                break;
            default:
                System.out.println("Invalid operator.");
                return 0;
        }
        return result;
    }
    }

    