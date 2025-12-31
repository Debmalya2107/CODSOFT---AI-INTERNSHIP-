import java.util.*;

public class fnifp8 {
    void input() {
        double clp, na;
        char ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n M/m mill cloth:");
        System.out.println("\n H/h handloom items:");
        System.out.print("Enter the choice: ");
        ch = sc.next().charAt(0);

        switch (ch) {
            case 'M':
            case 'm':
                System.out.print("Enter the cloth price: ");
                clp = sc.nextDouble();
                na = display1(clp);
                System.out.println("Net amount is: " + na);
                break;

            case 'H':
            case 'h':
                System.out.print("Enter the cloth price: ");
                clp = sc.nextDouble();
                na = display2(clp);
                System.out.println("Net amount is: " + na);
                break;

            default:
                System.out.println("Invalid choice!");
        }
    }

    double display1(double clp) {
        double dise;
        if (clp > 10000) {
            dise = (clp * 50) / 100;
        } else if (clp > 5001) {
            dise = (clp * 40) / 100;
        } else if (clp > 1000) {
            dise = (clp * 20) / 100;
        } else {
            dise = (clp * 20) / 100;
        }
        return clp - dise;
    }

    double display2(double clp) {
        double dise;
        if (clp > 10000) {
            dise = (clp * 60) / 100;
        } else if (clp > 5001) {
            dise = (clp * 50) / 100;
        } else if (clp > 1000) {
            dise = (clp * 25) / 100;
        } else {
            dise = (clp * 5) / 100;
        }
        return clp - dise;
    }
}
