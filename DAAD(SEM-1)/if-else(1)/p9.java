import java.util.*;
public class p9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double income, tax;
	System.out.println("\n ENTER THE ANNUAL INCOME:" );
	income=sc.nextDouble();
        if(income>80000)
	     tax=10000+(income*30)/100;	
	 else if (income>50001 && income<80000 )
	     tax=5000+(income*20)/100;
	 else if (income>50001 && income<80000 )
	     tax=1000+(income*10)/100;
	 else 
	     tax=(income*0)/100;
	System.out.println("\n  THE ANNUAL payable tax is :"+tax );
}
}
