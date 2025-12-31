import java.util.Scanner;
class js8
{
    public static void main(String args[])
    {
        int num , i =0 ;
        int bin[]=new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Decimal number");
        num=sc.nextInt();
        while(num!=0)
        {
            bin[i]=num%2;
            num=num/2;
            i++;
        }
        System.out.println("Binnary value is :");
        for(int j=i-1; j>=0;j--)
        {
            System.out.print(" "+bin[j]);
        }
        }
    }
