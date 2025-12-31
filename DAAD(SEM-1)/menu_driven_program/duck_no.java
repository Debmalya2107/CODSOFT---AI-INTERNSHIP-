public class duck_no
{
    double result(double num1) 
    {
        pro_vari pv = new pro_vari();
        String numStr = String.valueOf((int) num1); 
        
        if (numStr.charAt(0) == '0') {
            System.out.println(num1 + " is not a Duck number.");
        } else if (numStr.contains("0")) {
            System.out.println(num1 + " is a Duck number.");
        } else {
            System.out.println(num1 + " is not a Duck number.");
        }

        return pv.result;
    }
}