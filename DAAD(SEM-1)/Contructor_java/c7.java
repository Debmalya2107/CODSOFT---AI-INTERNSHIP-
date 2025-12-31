import java.util.*;
public class c7 {
    double hypotenuse;
    double base;
    double thirdside;

    // Constructor to initialize the sides of the triangle
    public c7(double hyp, double b) {
        hypotenuse = hyp;
        base = b;
        thirdside = calculatethirdside();
    }

    // Method to calculate the height (the third side)
    double calculatethirdside() {
        return Math.sqrt(hypotenuse * hypotenuse - base * base);
    }

    // Method to display the sides of the triangle
    void displaySides() {
        System.out.println("Hypotenuse: " + hypotenuse + " cm");
        System.out.println("Base: " + base + " cm");
        System.out.println("Third side: " + thirdside + " cm");
    }

    public static void main(String[] args) {
        c7 triangle = new c7(6, 4);
        triangle.displaySides();
    }
}