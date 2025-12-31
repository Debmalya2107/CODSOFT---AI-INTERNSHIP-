import java.util.*;
public class ar5
{
    public static void main(String args[])
    {
        int l,i;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter total customer:");
        l=sc.nextInt();
        int c[]=new int[10];
        double dis[]=new double[10];
        double na[]=new double[10];
        double amt[]=new double[10];
        for(i=0;i<l;i++)
        {
            System.out.println("enter customer code:");
            c[i]=sc.nextInt();
            System.out.println("enter customer ticket amount:");
            amt[i]=sc.nextDouble();
        }
        for(i=0;i<l;i++)
        {
            if(amt[i]>70000)
                 dis[i]=(amt[i]*18)/100;
            else if(amt[i]>=55000 && amt[i]<=77000)  
                 dis[i]=(amt[i]*16)/100;
            else if(amt[i]>=35000 && amt[i]<=55000)  
                 dis[i]=(amt[i]*12)/100;
            else if(amt[i]>=25000 && amt[i]<=35000)  
                 dis[i]=(amt[i]*10)/100;
            else
                dis[i]=(amt[i]*2)/100;
            na[i]=amt[i]-dis[i];
}
System.out.println("sl.no \t code \t ticket amont \t discount \net");
for(i=0;i<l;i++)
{
	System.out.println(i+ "\t" +c[i] +"\t" +amt[i]+ "\t" +dis[i] +"\t"+na[i]);
}
}
}	