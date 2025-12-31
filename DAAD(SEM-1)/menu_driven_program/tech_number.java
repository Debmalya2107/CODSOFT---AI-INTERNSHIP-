public class tech_number {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        int digits = String.valueOf(num).length();

        if (digits % 2 != 0) {
            System.out.println(num + " is not a Tech number (odd number of digits).");
            return pv.result;
        }

        int divider = (int) Math.pow(10, digits / 2);
        int firstHalf = num / divider;
        int secondHalf = num % divider;
        int sum = firstHalf + secondHalf;

        if (sum * sum == num) {
            System.out.println(num + " is a Tech number.");
        } else {
            System.out.println(num + " is not a Tech number.");
        }

        return pv.result;
    }
}
//formula: (First half + Second half)² = Original number

//Examples:

//3025 → 30 + 25 = 55 → 55² = 3025 ✅ Tech

//81 → 8 + 1 = 9 → 9² = 81 ✅ Tech

//100 → Not a Tech number ❌