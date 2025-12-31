public import java.util.*;
class p1
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner (System.in);
        int r=0,c=0,i,j;
        System.out.println("enter row value : ");
        r=sc.nextInt();
        System.out.println("enter column value : ");
        c=sc.nextInt();
        
        for(i=1;i<=r;i++)
        {
            for(j=1;j<=c;j++)
            {
                if(i==1 || j==1 || i==c ||j==c)
                {
                    System.out.print("*"+" ");
                }
                else
                {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
} 
    
