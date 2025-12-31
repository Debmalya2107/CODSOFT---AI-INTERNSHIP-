import java.util.*;
public class p11
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t \t \t \t railway tickits:");
        System.out.println(" ENTER YOUR age:");
        int age=sc.nextInt();
        System.out.println("\n2. ENTER YOUR distance");
        double dis = sc.nextInt();
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
        if(age>10 && age<60)
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
        System.out.println("\n the fare is:"+fare);
    }
}

