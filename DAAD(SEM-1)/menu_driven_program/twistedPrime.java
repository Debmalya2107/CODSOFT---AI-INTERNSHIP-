public class twistedPrime {
    double result(double num1) {
        pro_vari pv = new pro_vari();  // Same style as buzz
        int n = (int) num1;

        // Step 1: Reverse the number
        int rev = 0, temp = n;
        while (temp > 0) {
            int d = temp % 10;
            rev = rev * 10 + d;
            temp = temp / 10;
        }

        // Step 2: Check if n is prime
        int count1 = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0)
                count1++;
        }

        // Step 3: Check if reverse is prime
        int count2 = 0;
        for (int i = 1; i <= rev; i++) {
            if (rev % i == 0)
                count2++;
        }

        // Step 4: Check both are prime
        if (count1 == 2 && count2 == 2) {
            System.out.println(n + " is a Twisted Prime Number.");
        } else {
            System.out.println(n + " is not a Twisted Prime Number.");
        }

        return pv.result;
    }
}
//A number is called Twisted Prime if:

//The number itself is prime AND

//Its reverse is also a prime

//Example:
//13 is prime and reverse is 31, which is also prime → so it's a Twisted Prime.