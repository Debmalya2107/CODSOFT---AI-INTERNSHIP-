import java.util.*;
public class p31
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the laptop price : ");
		double l=sc.nextDouble();
		System.out.println("Enter the printer price : ");
		double p=sc.nextDouble();
		double ld=(l*15)/100;
		double pd=(p*10)/100;
		System.out.println("now the laptop discount is=" +ld);
		System.out.println("now the printer discount is=" +pd);

	}
}