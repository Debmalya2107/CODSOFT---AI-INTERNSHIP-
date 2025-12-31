//parameterised function with  return type
import java.util.*;
public class fnif11
{
    void input()
    {
        double cp,sp,profit,loss,f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the cost price:");
        cp=sc.nextInt();
        System.out.println("enter the selling price:");
        sp=sc.nextInt();
        double p=display1(cp,sp);
        if(p==1)
           System.out.println("profit by selling items");
        else if(p==2)
            System.out.println("loss byselling items");
        else
            System.out.println("no profit no loss");
    }
    double display1(double cp,double sp)
    {
            double profit, loss,f=0;
            if(sp>cp)
            {
                profit=sp-cp;
                f=1;
            }
            else if(cp>sp)
            {
                loss=cp-sp;
                f=2;
            }     
            else
                 f=3;
            return f;
    }
    
}

    