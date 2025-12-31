//parameterised function with  return type
import java.util.*;
public class fnifp11
{
    void input()
    {
        int age;
        double dis,fare;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the age:");
        age=sc.nextInt();
        System.out.println("enter the distance:");
        dis=sc.nextInt();
        double p=display1(age,dis);
        System.out.println("fare is:"+p);
    }
    double display1(double age,double dis)
    {
        double fare;
        if(age>60)
         {
            if(dis>=50)
                 fare=35;
            else if(dis>=10 && dis<50)
                 fare=15;
            else
                 fare=4;
         } 
        else if(age>10 && age<=60)
        {
            if(dis>=50)
                 fare=80;
            else if(dis>=10 && dis<50)
                 fare=40;
            else
                 fare=10;
        }
         else
         {
            if(dis>=50)
                 fare=50;
            else if(dis>=10 && dis<50)
                 fare=20;
            else
          
            fare=5;
        }
        return fare;
    }
}

    