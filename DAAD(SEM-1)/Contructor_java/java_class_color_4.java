import java.util.*;
public class java_class_color_4 {

    // Instance Variables
    String colTop;
    String colBottom;

    // Default Constructor
    public java_class_color_4() {
        colTop = "Pink";
        colBottom = "Black";
    }

    // Parameterized Constructor
    public java_class_color_4(String top, String bottom) {
        colTop = top;
        colBottom = bottom;
    }

    // Main Method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Object with default constructor
        java_class_color_4 defaultColor = new java_class_color_4();
        System.out.println("Default Colors:");
        System.out.println("Top Color: " + defaultColor.colTop);
        System.out.println("Bottom Color: " + defaultColor.colBottom);

        // Object with parameterized constructor
        java_class_color_4 assignedColor = new java_class_color_4("Red", "Blue");
        System.out.println("\nAssigned Colors:");
        System.out.println("Top Color: " + assignedColor.colTop);
        System.out.println("Bottom Color: " + assignedColor.colBottom);
    }
}