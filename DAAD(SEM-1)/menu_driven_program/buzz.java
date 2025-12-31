public class buzz
{
    double result(double num1)
    {
        pro_vari pv=new pro_vari();
        if (num1 % 10 == 7 || num1 % 7 == 0) 
        {
            System.out.println(num1 + " is a Buzz number.");
        }
        else {
            System.out.println(num1 + " is not a Buzz number.");
        }
        return pv.result;
    }
    }
