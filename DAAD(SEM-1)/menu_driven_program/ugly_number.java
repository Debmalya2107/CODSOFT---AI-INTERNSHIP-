public class ugly_number {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;

        if (num <= 0) 
        {
            System.out.println(num + " is not an Ugly number.");
            return pv.result;
        }

        while (num % 2 == 0) 
            num /= 2;
        while (num % 3 == 0)
            num /= 3;
        while (num % 5 == 0) 
            num /= 5;

        if (num == 1) 
        {
            System.out.println((int)num1 + " is an Ugly number.");
        } 
        else 
        {
            System.out.println((int)num1 + " is not an Ugly number.");
        }

        return pv.result;
    }
}
//An Ugly number is a number whose prime factors are only 2, 3, or 5.

//Examples:

//✅ 6 → 2 × 3

//✅ 8 → 2 × 2 × 2

//✅ 15 → 3 × 5

//❌ 14 → 2 × 7 → has a factor 7 → Not Ugly

//❌ 21 → 3 × 7 → has a factor 7 → Not Ugly
