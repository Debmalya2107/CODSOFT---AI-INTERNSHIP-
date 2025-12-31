public class spy
{
    double result(double num1) {
    pro_vari pv = new pro_vari();
    double i,sum=0,mul=1,rem=0;
    
    while(num1!=0)
    {
    rem=num1%10;
    sum=sum+rem;
    mul=mul*rem;    
    num1=num1/10;
    }
    if(sum==mul)
    System.out.println("\n this is a spy number" );
    else
    System.out.println("\n this is not a spy number");
    return pv.result;
    }
}
