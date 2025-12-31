import java.util.Scanner;
public class po2
 {
    public static double volume(double r) 
    {
        return (4.0 / 3.0) * (22.0 / 7.0) * Math.pow(r, 3);
    }
    public static double volume(double h, double r)
    {
        return (22.0 / 7.0) * Math.pow(r, 2) * h;
    }
    public static double volume(double l, double b, double h)
    {
        return l * b * h;
    }
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("VOLUME CALCULATOR USING METHOD OVERLOADING");
        System.out.println("==========================================");
        System.out.println("1. Sphere");
        System.out.println("2. Cylinder");
        System.out.println("3. Cuboid");
        System.out.print("Enter your choice (1-3): ");
        int choice = scanner.nextInt();
        switch (choice) {
            case 1: 
                System.out.print("Enter the radius of the sphere: ");
                double radius = scanner.nextDouble();
                System.out.printf("Volume of sphere: %.2f%n", volume(radius));
                break;

            case 2: 
                System.out.print("Enter the height of the cylinder: ");
                double height = scanner.nextDouble();
                System.out.print("Enter the radius of the cylinder: ");
                radius = scanner.nextDouble();
                System.out.printf("Volume of cylinder: %.2f%n", volume(height, radius));
                break;

            case 3:
                System.out.print("Enter the length of the cuboid: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the breadth of the cuboid: ");
                double breadth = scanner.nextDouble();
                System.out.print("Enter the height of the cuboid: ");
                height = scanner.nextDouble();
                System.out.printf("Volume of cuboid: %.2f%n", volume(length, breadth, height));
                break;

            default: 
                System.out.println("Invalid choice!");
        }
        
        scanner.close();
    }
}
