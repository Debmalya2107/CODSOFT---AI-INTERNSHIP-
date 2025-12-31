import java.util.*;
public class p3
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the price:");
    double p=sc.nextInt();
    double amt;
    if(p>10000)
    {
         amt=p-(p*50)/100;
    }
    else if(p>5001 && p<10000)
    {
          amt=p-(p*35)/100;
    }
    else if(p>2001 && p<5000)
    {
          amt=p-(p*25)/100;
    }
    else
    {
         amt=p-(p*5)/100;
    }
    System.out.println("now the final price:"+amt);
    }
}
