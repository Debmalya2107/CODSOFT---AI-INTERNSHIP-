import java.util.*;
public class ar6
{
    public static void main(String args[])
    {
        int i,j,k,l,m;
        Scanner sc=new Scanner(System.in);
        int p[]=new int[6];
        int q[]=new int[4];
        int r[]=new int[10];
        System.out.println("input of p[i]\n:");
        for(i=0;i<6;i++)
        {
            System.out.println("enter the elements:");
            p[i]=sc.nextInt();
        }
            System.out.println("input of q[i]\n:");
            for(j=0;j<4;j++)
        {
            System.out.println("enter the elements:");
            q[j]=sc.nextInt();
        }
         for(k=0;k<6;k++)
        {
            r[k]=p[k];
        }
        for(l=0;l<4;l++)
        {
            r[k]=q[l];
            k+=1;
        }
        System.out.println("enter the array elements of r:"); 
        for(m=0;m<10;m++)
        {
            System.out.println("\n"+r[m]);
        }
    }
}
