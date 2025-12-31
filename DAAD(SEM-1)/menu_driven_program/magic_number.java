public class magic_number {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        while (num > 9) {
            int sum = 0;
            while (num > 0) {
                sum += num % 10;
                num /= 10;
            }
            num = sum;
        }

        if (num == 1) {
            System.out.println(num1 + " is a Magic number.");
        } else {
            System.out.println(num1 + " is not a Magic number.");
        }

        return pv.result;
    }
}
//example:1729 → 1+7+2+9 = 19 → 1+9 = 10 → 1+0 = 1 → ✅ Magic

//1234 → 1+2+3+4 = 10 → 1+0 = 1 → ✅ Magic

//19 → 1+9 = 10 → 1+0 = 1 → ✅ Magic

//56 → 5+6 = 11 → 1+1 = 2 → ❌ Not Magic

