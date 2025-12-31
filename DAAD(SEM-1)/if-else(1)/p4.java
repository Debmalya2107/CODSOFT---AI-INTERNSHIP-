import java.util.*;
public class p4
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the unit:");
    double u=sc.nextInt();
    double charge;
    if(u>=200)
    {
          charge=(u*1)+250;
    }
    else if(u>=100 && u<200)
    {
          charge=(u*0.60)+250;
    }
    else
    {
         charge=(u*0.40)+250;
    }
    System.out.println("now the final charge:"+charge);
    }
}
