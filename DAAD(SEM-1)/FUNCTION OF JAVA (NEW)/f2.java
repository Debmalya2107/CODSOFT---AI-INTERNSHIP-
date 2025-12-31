import java.util.*;
public class f2
{
    public static void main(String[] args) {
        int ch;
        Scanner sc=new Scanner (System.in);
        System.out.println("To print the series :  0, 3, 8, 15, 24 … n  enter 1  & To print the series: S  =  ½  +  ¾  +  5/6  +  7/8 …….  19/20  enter 2");
        ch= sc.nextInt();

        switch (ch) {
            case 1:
                System.out.println("Enter the value of n: ");
                int n=sc.nextInt();
                for(int k =1;k<=n;k++)
                {
                    System.out.println((k*k)-1);
                }
                break;
            case 2:
                double sum=0;
                double k=2;
                for(int p=1 ; p<=19;p=p+2)
                {
                    sum=sum+p/k;
                    k=k+2;
                }
                
                System.out.println(sum);
                break;
            default:
                System.out.println("Invalid choice");
        }
    }
}