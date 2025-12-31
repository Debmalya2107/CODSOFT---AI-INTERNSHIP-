import java.util.*;

public class number_operation_5 {
    // Instance variables
    int number;
    int doubleVal;
    int squareVal;
    double halfVal;

    // Default constructor
    public number_operation_5() {
        doubleVal = 0;
        squareVal = 0;
        halfVal = 0.0;
    }

    // Parameterized constructor (not used here but okay to keep)
    public number_operation_5(int doubleValc, int squareValc, double halfValc) {
        doubleVal = doubleValc;
        squareVal = squareValc;
        halfVal = halfValc;
    }

    // Constructor that computes the values
    public number_operation_5(int n) {
        number = n;                         // assign to instance variable
        doubleVal = n * 2;
        squareVal = n * n;
        halfVal = n / 2.0;
    }

    // Display the results
    void display() {
        System.out.println("Original Number: " + number);
        System.out.println("Double: " + doubleVal);
        System.out.println("Square: " + squareVal);
        System.out.println("Half: " + halfVal);
    }

    // Main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        number_operation_5 obj = new number_operation_5(number);
        obj.display();
        sc.close();
    }
}
