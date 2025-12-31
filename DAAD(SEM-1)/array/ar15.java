import java.util.*;
public class ar15
{
    public static void main(String args[])
    {
        int i,ts;
        Scanner sc=new Scanner(System.in);
        int rlno[]=new int[50];
        int eg[]=new int[50];
        int ma[]=new int[50];
        int be[]=new int[50];
        double per[]= new double[50];
	double total[]= new double[50];
        System.out.println("input the total students:");
        ts=sc.nextInt();
        for(i=0;i<ts;i++)
        {
            System.out.println("enter the roll no:");
            rlno[i]=sc.nextInt();
            System.out.println("enter the marks of english:");
            eg[i]=sc.nextInt();
            System.out.println("enter the marks of maths:");
            ma[i]=sc.nextInt();
            System.out.println("enter the marks of bengali:");
            be[i]=sc.nextInt();
	    total[i]=eg[i]+ma[i]+be[i];
            per[i]=(eg[i]+ma[i]+be[i])/3;
        }
	System.out.println(" \n total marks: \t percentage in marks:");

            for(i=0;i<ts;i++)
        {
            System.out.println("\t"+total[i]+"\t"+per[i]);
           
        }
}
}
        

