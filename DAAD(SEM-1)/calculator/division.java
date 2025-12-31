public class division
{
    double result(double a, double b)
    {
        pro_vari pv=new pro_vari();
        if (b == 0) 
        {
                    System.out.println("Error: Cannot divide by zero.");
        }
        else
                pv.result = a / b;
        return pv.result;
    }
}
