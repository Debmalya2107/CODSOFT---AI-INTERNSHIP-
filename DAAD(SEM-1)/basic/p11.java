import java.util.*;
public class p11
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius: ");
		double r=sc.nextInt();
		double area=3.14*r*r;
		double perimeter=2*3.14*r;
		System.out.println("circle area is=" +area);
		System.out.println("circle perimeter is=" +perimeter);
	}
}