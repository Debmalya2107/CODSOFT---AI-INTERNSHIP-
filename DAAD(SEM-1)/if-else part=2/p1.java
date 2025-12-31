import java.util.*;
public class p1
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("\t \t \t \t Result:");
    System.out.println(" ENTER YOUR NAME:");
    String n =sc.nextLine();
    System.out.println("\n ENTER YOUR MARKS:");
    double marks =sc.nextDouble();
    if(marks>=80)
          System.out.println("\n grades=Distinction"); 
    else if(marks>=60 && marks<80)
 	System.out.println("\n grades=first division"); 
    else if(marks>=45 && marks<60)        
         System.out.println("\n grades=second division"); 
    else if(marks>=40 && marks<45)
	 System.out.println("\n grades=pass"); 
     else
	  System.out.println("\n promotion not granted"); 
}
}