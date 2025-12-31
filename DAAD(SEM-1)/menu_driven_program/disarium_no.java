public class disarium_no {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        int temp = num;
        int len = String.valueOf(num).length();
        int sum = 0;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, len);
            temp = temp / 10;
            len--;
        }

        if (sum == num) {
            System.out.println(num + " is a Disarium number.");
        } else {
            System.out.println(num + " is not a Disarium number.");
        }

        return pv.result;
    }
}
//A Disarium number is a number where the sum of its digits powered with their positions equals the number itself.

//Formula:
//If number = 135 → 1¹ + 3² + 5³ = 135 → ✅ Disarium

//Examples:

//89 → 8¹ + 9² = 8 + 81 = 89 ✅

//80 → 8¹ + 0² = 8 + 0 = 8 ❌ Not Disarium