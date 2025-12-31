import java.util.*;
public class p15
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the basic salary: bs");
		double bs=sc.nextDouble();
		double hra=(10*bs)/100;
		double da=(5*bs)/100;
		double ta=(15*bs)/100;
		double pf=(20*bs)/100;
		double gs=hra+da+ta+bs;
		double np=gs-pf;
		System.out.println(" hra is=" +hra+"da is=" +da +"ta is=" +ta+"pf is=" +pf+"gs is=" +gs+"np is=" +np);
	}
}