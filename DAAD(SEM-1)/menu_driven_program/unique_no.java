public class unique_no {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        int[] digits = new int[10]; // For digit count
        int temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            digits[digit]++;
            temp = temp / 10;
        }

        int repeat = 0;
        for (int i = 0; i < 10; i++) {
            if (digits[i] > 1) {
                repeat = 1;
                break;
            }
        }

        if (repeat == 1) {
            System.out.println(num + " is not a Unique number.");
        } else {
            System.out.println(num + " is a Unique number.");
        }

        return pv.result;
    }
}
//123 → ✅ All digits different → Unique

//121 → ❌ Digit '1' repeats → Not Unique
