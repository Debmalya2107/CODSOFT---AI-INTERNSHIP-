import java.util.*;
public class p7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double root1,root2,real,img;
        System.out.println(" ENTER a:");
        int a =sc.nextInt();
        System.out.println("\n ENTER b");
        int b =sc.nextInt();
        System.out.println("\n ENTER c");
        int c =sc.nextInt();
        int d=b*b-4*a*c;
        if(d>0)
        {
            root1=(-b+(Math.sqrt(d))/(2*a));
            root2=(-b-(Math.sqrt(d))/(2*a));          
            System.out.println("\n the roots are real \n root1:"+root1+"\n root2:"+root2);
        }
        else if(d==0)
        {
            root1=root2=(-b/(2*a));          
            System.out.println("\n the roots are equal \n root1=root2:"+root1);
        }
        else
        {
            real=(-b/(2*a));   
            img=(Math.sqrt(b)/(2*a)); 
            System.out.println("\n the roots are imaginary \n REAL:"+real+"\n img:"+img);
        }
        }
    }


