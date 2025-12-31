import java.util.*;
public class p6
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("\t \t \t \t Result:");
    System.out.println(" ENTER YOUR NAME:");
    String n =sc.nextLine();
    System.out.println("\n ENTER YOUR eng marks");
    int eg =sc.nextInt();
    System.out.println("\n ENTER YOUR maths marks");
    int ma =sc.nextInt();
    System.out.println("\n ENTER YOUR computer marks");
    int co =sc.nextInt();
    int total=eg+ma+co;
    double per=total/3;
    char g;
        if(per>=80)
        {
          g='A'; 
        }
        else if(per>=60 && per<80)
        {
          g='B'; 
        }
        else if(per>=50 && per<60)
       { 
           g='C';
       }
     else
     {
        g='D';
     }
    System.out.println("\nname is:"+n);
    System.out.println("\t total is:"+total);
    System.out.println("\t net persentage is:"+per);
    System.out.println("\t net grade is:"+g);
}
}