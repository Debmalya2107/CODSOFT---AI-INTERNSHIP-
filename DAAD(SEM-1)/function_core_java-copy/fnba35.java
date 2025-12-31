//parameterised function
import java.util.*;
public class fnba35
{
    void input()
    {   
        double p,dp=10,st;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the participle price:");
        p=sc.nextDouble();
        display(p);
    }
    void display(double p)
    {
        double dp=p-(p*10)/100;
        double st=dp+(dp*6)/100;
        System.out.println("\n the customwer price:"+dp+"\nthe printed price:"+st);
    }
}
