public class prime 
{
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        boolean isPrime = true;

        if (num <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }

        if (isPrime) {
            System.out.println(num1 + " is a Prime number.");
        } else {
            System.out.println(num1 + " is not a Prime number.");
        }

        return pv.result;
    }
}
