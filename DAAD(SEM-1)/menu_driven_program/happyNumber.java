public class happyNumber {
    double result(double num1) {
        pro_vari pv = new pro_vari();  // your style
        int n = (int) num1;

        int slow = n;
        int fast = n;
        int flag = 0;

        do {
            slow = digitSquareSum(slow);
            fast = digitSquareSum(digitSquareSum(fast));
        } while (slow != fast);

        if (slow == 1) {
            System.out.println(n + " is a Happy Number.");
        } else {
            System.out.println(n + " is not a Happy Number.");
        }

        return pv.result;
    }

    // Method to calculate sum of squares of digits
    int digitSquareSum(int num) {
        int sum = 0;
        while (num > 0) {
            int d = num % 10;
            sum = sum + d * d;
            num = num / 10;
        }
        return sum;
    }
}
// 7 → Happy
//Steps:

//7² = 49

//4² + 9² = 16 + 81 = 97

//9² + 7² = 81 + 49 = 130

//1² + 3² + 0² = 1 + 9 + 0 = 10

//1² + 0² = 1 ✅

//So, 7 is a Happy Number