public class digitToWord {
    double result(double num1) {
        pro_vari pv = new pro_vari();
        int n = (int) num1;

        // Reverse the number first to maintain left-to-right order
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }

        // Convert digits to words
        while (rev > 0) {
            int d = rev % 10;
            switch (d) {
                case 0: System.out.print("Zero "); break;
                case 1: System.out.print("One "); break;
                case 2: System.out.print("Two "); break;
                case 3: System.out.print("Three "); break;
                case 4: System.out.print("Four "); break;
                case 5: System.out.print("Five "); break;
                case 6: System.out.print("Six "); break;
                case 7: System.out.print("Seven "); break;
                case 8: System.out.print("Eight "); break;
                case 9: System.out.print("Nine "); break;
            }
            rev = rev / 10;
        }

        System.out.println(); // Move to next line
        return pv.result;
    }
}
