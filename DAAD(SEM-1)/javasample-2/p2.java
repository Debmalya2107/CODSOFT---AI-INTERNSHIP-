import java.util.*;
class p2
{
    static int rev(int n)
    {
        int rem,sum=0;
        while(n!=0)
        {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        return sum;
    }
    static int prime(int n)
    {
        int i,f=0;
        for(i=2;i<n;i++)
        {
            if(n%i==0)
            {
                f=1;
                break;
            }
        }
        if(f==0)
        return 0;
        else
        return 1;
    }
    static int adam(int n)
    {
        int sqr,r;
        sqr=n*n;
        r=rev(n)*rev(n);
        if(rev(r)==sqr)
        return 0;
        else
        return 1;
    }
    public static void main(String args[])
    {
        int num , num1,count=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter starting number: ");
        num=sc.nextInt();
        System.out.println("Enter last number: ");
        num1=sc.nextInt();
        System.out.println("Prime adam numbers are ....");
        while(num<=num1)
        {
            if (prime(num)==0 && adam(num)==0)
            {
                System.out.println(num+" ");
                count ++;
            }
            num++;
        }
        if(count>0)
        System.out.println("prime adam number in "+count+"times");
        else
        System.out.println("no prime adam number is found in the given limit");
    }    
    }
