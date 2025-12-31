import java.util.*;
public class p5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double diagonal;
		System.out.println("Enter length: ");
		double l=sc.nextDouble();
		System.out.println("Enter breadth: ");
		double b=sc.nextDouble();
		double area=l*b;
		double perimeter=2*(l+b);
		diagonal=Math.sqrt(Math.pow(l,2)+Math.pow(b,2));
		System.out.println("the area is=" +area);
		System.out.println("the perimeter is=" +perimeter);
		System.out.println("the diagonal is=" +diagonal);

	}
}