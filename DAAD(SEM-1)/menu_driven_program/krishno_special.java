
public class krishno_special
{
    double result(double num1)
    {
        pro_vari pv = new pro_vari();
        double i,sum=0,fact,rem;
        double temp=num1;
        while(num1>0)
        {
            rem=num1%10;
            fact=1;
        for(i=1;i<=rem;i++)
        {
                fact=fact*i;
        }
        sum=sum+fact;
        num1=num1/10;
    }
    if(sum==temp)
    System.out.println("\n this is a special krishnomurti number" );
    else
    System.out.println("\n this is not a special krishnomurti number");
    return pv.result;
    }
}
