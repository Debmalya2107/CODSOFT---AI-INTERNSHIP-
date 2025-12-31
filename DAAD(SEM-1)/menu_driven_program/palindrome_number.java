import java.util.*;
public class palindrome_number
{
    double result(double num1,double rem,double rev,double temp)
    {
            pro_vari pv=new pro_vari();
            while(num1!=0)
            {
        	rem=num1%10;
        	rev=rev*10+rem;
        	num1=num1/10;
            }
                System.out.println("\n the reverse is:"+rev);
            if(rev==temp)
        	System.out.println("\n the reverse is palindrome:"+temp);
            else
        	System.out.println("\n the reverse is not a palindrome:"+temp);
            return pv.result;
    }
}
