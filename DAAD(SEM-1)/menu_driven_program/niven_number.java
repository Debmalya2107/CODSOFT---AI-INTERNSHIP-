public class niven_number
 {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        int sum = 0, temp = num;

        // Find sum of digits
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        // Check if number is divisible by sum of digits
        if (sum != 0 && num % sum == 0) {
            System.out.println(num + " is a Niven number.");
        } else {
            System.out.println(num + " is not a Niven number.");
        }

        return pv.result;
    }
}
//18 → 1 + 8 = 9 → 18 % 9 == 0 → ✅ Niven number
