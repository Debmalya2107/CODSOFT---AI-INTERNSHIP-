public class prime_Palindrome 
{
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int n = (int) num1;
        int rev = 0, temp = n;

        // Check for Palindrome
        while (temp > 0) {
            int digit = temp % 10;
            rev = rev * 10 + digit;
            temp = temp / 10;
        }

        // Check for Prime
        int count = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count == 2 && rev == n) {
            System.out.println(n + " is a Prime Palindrome number.");
        } else {
            System.out.println(n + " is not a Prime Palindrome number.");
        }

        return pv.result;
    }
}
