import java.util.*;
public class fnba11
{
	void input()
	{
            int r,ar,cr;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter radius:");
            r=sc.nextInt();
            cal(r);
	}
	void cal( int r)
	{	
            double ar=3.14*r*r;
            double cr=2*3.14*r;
            display (ar,cr);
	}
	void display(double ar, double cir)
	{
		System.out.println("now area:"+ar +"\n"+"now circumference:"+cir);
	}
}

