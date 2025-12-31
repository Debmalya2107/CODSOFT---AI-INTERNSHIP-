public class pronic_number {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int num = (int) num1;
        int i = 0;
        int found = 0;

        while (i * (i + 1) <= num) {
            if (i * (i + 1) == num) {
                found = 1;
                break;
            }
            i++;
        }

        if (found == 1) {
            System.out.println(num + " is a Pronic number.");
        } else {
            System.out.println(num + " is not a Pronic number.");
        }

        return pv.result;
    }
}
//Formula:
//Pronic number = n × (n + 1)

//Examples:

//6 = 2 × 3 → ✅ Pronic

//12 = 3 × 4 → ✅ Pronic

//20 = 4 × 5 → ✅ Pronic

//10 = ❌ Not Pronic

