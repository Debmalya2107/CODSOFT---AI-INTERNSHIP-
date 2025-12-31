import java.util.Scanner;
class js11
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;
        System.out.println("enter the number ");
        n=sc.nextInt();
        for (int d =2;d<n;d++)
        {
            while (n%d==0)
            {
                n=n/d;
                System.out.println(d);
            }
        }
    }
}