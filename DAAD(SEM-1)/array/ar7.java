import java.util.*;
public class ar7
{
    public static void main(String args[])
    { 
        int i,ts;
        Scanner sc=new Scanner(System.in);
        int rlno[]=new int[50];
        int sa[]=new int[50];
        int sb[]=new int[50];
        int scs[]=new int[50];
        double avg[]= new double[50];
        System.out.println("input the total students:");
        ts=sc.nextInt();
        for(i=0;i<ts;i++)
       {
         System.out.println("enter the roll no:");
            rlno[i]=sc.nextInt();
            System.out.println("enter the sub a:");
            sa[i]=sc.nextInt();
            System.out.println("enter the sub b:");
            sb[i]=sc.nextInt();
            System.out.println("enter the sub c:");
            scs[i]=sc.nextInt();
            avg[i]=(sa[i]+sb[i]+scs[i])/3;
        }
            System.out.println("\n rollno \t avarage marks:");
            for(i=0;i<ts;i++)
        {
            System.out.println("\t"+rlno[i]+"\t"+avg[i]);
         }
	System.out.println("\n avarage marks above 80:");
         for(i=0;i<ts;i++)
        {
            if(avg[i]>80)
                System.out.println("\t"+rlno[i]+"\t"+avg[i]);
        }
	System.out.println("\n avarage marks above 40:");
         for(i=0;i<ts;i++)
        {
            if(avg[i]<40)
                System.out.println("\t"+rlno[i]+"\t"+avg[i]);
        }
}
}

	

