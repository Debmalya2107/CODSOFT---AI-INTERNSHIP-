import java.util.*;
class mc
{
    public static void main(String args[])
    {
        double p,r,t,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the principle : ");
        p=sc.nextDouble();
        System.out.println("enter the rate : ");
        r=sc.nextDouble();
        System.out.println("enter the time : ");
        t=sc.nextDouble();
        m = p * r * Math.pow(1 + r, t) / (Math.pow(1 + r, t) - 1);
        System.out.println("The mortgagae is "+m);
    }
    
}