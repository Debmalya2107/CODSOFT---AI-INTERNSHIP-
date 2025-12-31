public class armstrong 
{
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }
        temp = num;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }
        if (sum == original) {
            System.out.println(num1 + " is an Armstrong number.");
        } else {
            System.out.println(num1 + " is not an Armstrong number.");
        }

        return pv.result;
    }
}
//Example: 153 → 1³ + 5³ + 3³ = 153 → ✅