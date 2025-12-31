public class twin_prime {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;

        if (isPrime(num) && (isPrime(num - 2) || isPrime(num + 2))) {
            System.out.println(num + " is a Twin Prime number.");
        } else {
            System.out.println(num + " is not a Twin Prime number.");
        }

        return pv.result;
    }

    // Helper method to check if a number is prime
    boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
//A Twin Prime pair consists of two prime numbers whose difference is 2.

//Examples of twin prime pairs:

//(3, 5) ✅

//(5, 7) ✅

//23 → Not part of any twin pair ❌