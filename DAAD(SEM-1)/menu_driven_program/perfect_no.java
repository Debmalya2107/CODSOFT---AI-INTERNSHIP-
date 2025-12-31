public class perfect_no {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        int sum = 0;

        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            System.out.println(num + " is a Perfect number.");
        } else {
            System.out.println(num + " is not a Perfect number.");
        }

        return pv.result;
    }
}
//A Perfect number is a number that is equal to the sum of its proper divisors (excluding the number itself).

//Examples:

//6 → 1 + 2 + 3 = 6 ✅

//28 → 1 + 2 + 4 + 7 + 14 = 28 ✅

//12 → 1 + 2 + 3 + 4 + 6 = 16 ≠ 12 ❌
