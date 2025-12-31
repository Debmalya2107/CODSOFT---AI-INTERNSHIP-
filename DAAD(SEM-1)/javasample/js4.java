import  java.util.Scanner;
class js4
{
    public static void main()
    {
        Scanner sc= new Scanner(System.in);
        int n,p,dig,i;
        int digit[] = new int[10];
        System.out.println("Enter the number you want to check");
        n= sc.nextInt();
        p=n;
        while(p>0)
        {
            dig = p%10;
            for(i=0;i<=9;i++)
            {
                if(dig == i)
                {
                    digit[i]++;
                }
            }
            p=p/10;
        }
        System.out.println("From the number :"+n);
        for(i=0;i<9;i++)
        {
            if (digit[i]!=0)
            {
                System.out.println("Frequency of "+i+" is: "+digit[i]);
            }
        }
    }
}