import java.util.*;
public class p1
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
        	System.out.println("\t \t \t \t ELECTRONICS SHOP:");
        	System.out.println(" ENTER YOUR NAME:");
        	String n =sc.nextLine();
        	System.out.println("\n2. ENTER YOUR ADDRESS");
        	String ad =sc.nextLine();
        	System.out.println("\n l/L LAPTOP:");
        	System.out.println("\n D/d DESKTOP:");
       		System.out.println("\n enter your choise :");
        	int ch=sc.next().charAt(0);
        	double na;
       		switch(ch)
        	{
            		case 'l':	
            		case 'L':   System.out.println("\n enter the price:");
                             	     double p=sc.nextInt();
                       	     	     if(p>=10000)
                              	        na=p-(p*10)/100; 
                            	     else if(p>=5701 && p<10000)
                              		na=p-(p*7.5)/100; 
                        	     else if(p>=2501 && p<5701)
                             		na=p-(p*5)/100;
                        	      else
                              		na=p-(p*0)/100;
                        	System.out.println("\nname is:"+n);
                        	System.out.println("\naddress is:"+ad);
                        	System.out.println("\n net amount is:"+na);
                        	break;
            		case 'd':
            		case 'D':   System.out.println("\n enter the price:");
                        	     double p2=sc.nextInt();
                        	     if(p2>=10000)
                              		na=p2-(p2*15)/100; 
                        	     else if(p2>=5701 && p2<10000)
                              		na=p2-(p2*10)/100; 
                        	     else if(p2>=2501 && p2<5701)
                              		na=p2-(p2*7.5)/100;
                        	     else
                              		na=p2-(p2*5)/100;
                        	     System.out.println("\nname is:"+n);
                        	     System.out.println("\naddress is:"+ad);
                                     System.out.println("\n net amount is:"+na);
                      		     break;
            		default:    System.out.println("wrong input");
      		 	}
    		}
	}

