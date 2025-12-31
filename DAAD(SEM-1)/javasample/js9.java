import java.util.*;
class js9
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,c=0,dig;
        System.out.println("enter the number you want to check:");
        n=sc.nextInt();
        while(n>0)
        {
            dig=n%10;
            if(dig==0)
            {
                c++;
                break;
            }
            n=n/10;
        }
        if(c==1)
        {
            System.out.println("it is a duck number");
        }
        else
        {
            System.out.println("it is not a duck number");
        }
    }
}