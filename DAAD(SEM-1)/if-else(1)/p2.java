import java.util.*;
public class p2
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		double c,f;
               	System.out.println("\n fahrenheit[f/F]:"); 
        	System.out.println("\n celcious [c/C]:");
       		System.out.println("\n enter your choise :");
        	char ch=sc.next().charAt(0);
       		switch(ch)
        	{
            		case 'f':	
            		case 'F':   System.out.println("\n enter the TEMP in fahrenhait:");
                             	     f=sc.nextDouble();
				     c=(5*f-160)/9;
                       	     	     System.out.println("\n the temp in celcious is:"+c);
                        	     break;
            		case 'c':
            		case 'C':   System.out.println("\n enter the TEMP in celcious:");
                             	     c=sc.nextDouble();
				     f=(9*c-160)/5;
                       	     	     System.out.println("\n the temp in fahrenhait is:"+f);
                        	     break;

            		default:    System.out.println("wrong input");
      		 	}
    		}
	}

