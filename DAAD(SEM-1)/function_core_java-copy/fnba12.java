import java.util.*;
public class fnba12
{
    void input()
    {
            int s,ar,pr;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a side of a square:");
            s=sc.nextInt();
            cal(s);
	}
    void cal(int s)
       {
        int ar=s*s;
        int pr=4*s;
        display (ar,pr);
    }
    void display(double ar, double pr)
	{
		System.out.println("\n area="+ar+"\n perimeter="+pr);
	}
}

