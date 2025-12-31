public class circular_Prime 
{
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int n = (int) num1;
        int count = 0, temp = n;

        // Count number of digits
        while (temp > 0) {
            count++;
            temp /= 10;
        }

        int num = n, flag = 1;

        for (int i = 0; i < count; i++) {
            // Check if num is prime
            int primeCount = 0;
            for (int j = 1; j <= num; j++) {
                if (num % j == 0) {
                    primeCount++;
                }
            }
            if (primeCount != 2) {
                flag = 0;
                break;
            }

            // Rotate the number
            int lastDigit = num % 10;
            num = num / 10;
            num = lastDigit * (int) Math.pow(10, count - 1) + num;
        }

        if (flag == 1) {
            System.out.println(n + " is a Circular Prime number.");
        } else {
            System.out.println(n + " is not a Circular Prime number.");
        }

        return pv.result;
    }
}
