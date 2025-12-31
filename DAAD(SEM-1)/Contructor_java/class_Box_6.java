import java.util.*;
public class class_Box_6 {
    // Instance variables
    double length;
    double width;
    double height;

    // Default constructor
    public class_Box_6() {
        length = 0.0;
        width = 0.0;
        height = 0.0;
    }

    // Parameterized constructor
    public class_Box_6(double l, double w, double h) {
        length = l;
        width = w;
        height = h;
    }
    void displayVolume() {
        double volume = length * width * height;
        System.out.println("Length: " + length + " cm");
        System.out.println("Width: " + width + " cm");
        System.out.println("Height: " + height + " cm");
        System.out.println("Volume: " + volume + "cm");
    }

    // Main method
    public static void main(String[] args) 
    {
        class_Box_6 obj = new class_Box_6(3.89, 2.1, 1.5);
        obj.displayVolume();
    }
}