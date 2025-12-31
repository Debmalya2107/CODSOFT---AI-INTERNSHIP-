import java.util.*;
public class fnba8
{
	void input()
	{
            int a,b;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter 1st number:");
            a=sc.nextInt();
            System.out.println("enter 2nd number:");
            b=sc.nextInt();
            cal(a,b);
	}
	void cal(int a,int b)
	{	
            a=a+b;
            b=a-b;
            a=a-b;
            display (a,b);
	}
	void display(int a, int b)
	{
		System.out.println("now a:"+a +"\n"+"now b:"+b);
	}
}

