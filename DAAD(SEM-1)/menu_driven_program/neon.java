public class neon 
{
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        int square = num * num;
        int sum = 0;

        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }

        if (sum == num) {
            System.out.println(num1 + " is a Neon number.");
        } else {
            System.out.println(num1 + " is not a Neon number.");
        }

        return pv.result;
    }
}
