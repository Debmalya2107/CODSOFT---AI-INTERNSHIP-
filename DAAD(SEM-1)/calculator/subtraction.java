public class subtraction
{
    double result(double a, double b)
    {
        pro_vari pv=new pro_vari();
        if(a>b)
            pv.result=a-b;
        else
            pv.result=b-a; 
        return pv.result;
    }
}