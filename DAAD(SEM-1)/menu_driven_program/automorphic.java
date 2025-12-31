public class automorphic 
{
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;         
        int square = num * num;      

        if (square % Math.pow(10, String.valueOf(num).length()) == num) {
            System.out.println(num + " is an Automorphic number.");
        } else {
            System.out.println(num + " is not an Automorphic number.");
        }

        return pv.result;
    }
}
