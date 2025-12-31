import java.util.*;
class p1
{
    public static void main(String args[])
   {
        Scanner sc = new Scanner(System.in);
        int i=0,j=0;
        System.out.println("enter the special character to print the pattern");
        char ch=sc.next().charAt(0);
        System.out.println("how many lines do u want it ?");
        int n=sc.nextInt();
        System.out.println("how many times in a line do u want it ?");
        int l=sc.nextInt();
        
                
        for(i=1;i<=n;i++)
        {
            for(j=1;j<=l;j++)
            {
                System.out.print(ch+"  ");
            }
           System.out.println(); 
        }
   }

}