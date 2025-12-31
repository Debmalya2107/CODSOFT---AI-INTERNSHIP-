import java.util.*;
public class p6
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println(" ENTER THE 1ST ANGLE:");
    int a=sc.nextInt();
    System.out.println(" ENTER THE 2nd ANGLE:");
    int b=sc.nextInt();
    int c =a+b;
    System.out.println(" check here:(S=SUPLEMENTARY/ C=COMPLEMENTARY");
    char ch=sc.next().charAt(0);
    if(ch=='S')
	{
		if(c==180)
                    System.out.println("the angle is supplementary"+c); 
		else
		    System.out.println("the angle is not supplementary"+c); 

        }
    else if(ch=='C')
    {
      		 if(c==90)
          		System.out.println("\n the angle is complementary: "+c); 
		else
		    System.out.println("the angle is not complementary"+c); 
    }
    else
	  System.out.println("\n not supplementary not complementary "); 
    }
}