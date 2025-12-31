public class co_prime_number {
    double result(double num1,double num2) {
        pro_vari pv = new pro_vari();
        
        int a = (int) num1;
        int b = (int) num2;         

        int gcd = 1;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                gcd = i;
            }
        }

        if (gcd == 1) {
            System.out.println(a + " and " + b + " are Co-Prime numbers.");
        } else {
            System.out.println(a + " and " + b + " are not Co-Prime numbers.");
        }

        return pv.result;
    }
}
//Two numbers are Co-Prime (also called Relatively Prime) if their Greatest Common Divisor (GCD) is 1.

//Examples:

//(8, 15) → GCD = 1 → ✅ Co-Prime

//(14, 21) → GCD = 7 → ❌ Not Co-Prime