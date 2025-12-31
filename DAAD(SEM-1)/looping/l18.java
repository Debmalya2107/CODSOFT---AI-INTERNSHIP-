import java.util.*;
public class l18
{
    public static void main(String args[])
    {
    int n,f=0,a=0,ne=0,i;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the population:");
    n=sc.nextInt();
    for(i=1;i<=n;i++)
    {
        System.out.println("\n1 favour:");
        System.out.println("\n2.against:");
        System.out.println("\n3. netural:");
        System.out.println("\n enter the choice:");
        int ch=sc.nextInt();
        if(ch==1)
            f++;
        if(ch==2)
        {
            a++;
        }
        if(ch==3)
        {
            ne++;
        }
    }
        System.out.println("\n the favour is:"+f);
        System.out.println("\n the against is:"+a);
        System.out.println("\n the netural is:"+ne);
    }
}