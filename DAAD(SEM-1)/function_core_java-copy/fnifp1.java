import java.util.*;

public class fnifp1 {
    void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("\t \t \t \t ELECTRONICS SHOP:");
        
        System.out.print("ENTER YOUR NAME: ");
        String n = sc.nextLine();
        
        System.out.print("ENTER YOUR ADDRESS: ");
        String ad = sc.nextLine();
        
        System.out.println("\nL/l - LAPTOP");
        System.out.println("D/d - DESKTOP");
        System.out.print("Enter your choice: ");
        char ch = sc.next().charAt(0);
        
        double price, netAmount;
        
        switch (ch) {
            case 'l':
            case 'L':
                System.out.print("Enter the price: ");
                price = sc.nextDouble();
                netAmount = laptopDiscount(price);
                break;
                
            case 'd':
            case 'D':
                System.out.print("Enter the price: ");
                price = sc.nextDouble();
                netAmount = desktopDiscount(price);
                break;
                
            default:
                System.out.println("Wrong input.");
                return; 
            }
        System.out.println("\nName: " + n);
        System.out.println("Address: " + ad);
        System.out.println("Net Amount to Pay: ₹" + netAmount);
    }
    double laptopDiscount(double price) {
        double na;
        if (price >= 10000)
            na = price - (price * 10) / 100;
        else if (price >= 5701 && price < 10000)
            na = price - (price * 7.5) / 100;
        else if (price >= 2501 && price < 5701)
            na = price - (price * 5) / 100;
        else
            na = price; 
        return na;
    }
    double desktopDiscount(double price) {
        double na;
        if (price >= 10000)
            na = price - (price * 15) / 100;
        else if (price >= 5701 && price < 10000)
            na = price - (price * 10) / 100;
        else if (price >= 2501 && price < 5701)
            na = price - (price * 7.5) / 100;
        else
            na = price - (price * 5) / 100;
        return na;
    }
}
