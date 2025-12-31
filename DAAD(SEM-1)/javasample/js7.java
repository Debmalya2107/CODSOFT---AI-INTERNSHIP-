import java.util.Scanner;
class js7
{
    public static void main(String args[])
    {
        int dec,i=0,t;
        int oct[]= new int[100];
        Scanner sc=new Scanner (System.in);
        System.out.println("enter any decimal number");
        dec= sc.nextInt();
        t=dec;
        while(t!=0)
        {
          oct[i]=t%8;
          t=t/8;
          i++;
        }
        System.out.println("octal value of "+dec+"is :");
        for(int j=i - 1;j>=0;j--)
        {
            System.out.print(oct[j]);
        }
        
    }
}