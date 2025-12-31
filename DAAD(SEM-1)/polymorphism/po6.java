import java.util.Scanner;
public class po6 
{
    public double area(double a, double b, double c) 
    {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    public double area(int a, int b, int height) 
    {
        return 0.5 * height * (a + b);
    }

    public double area(double diagonal1, double diagonal2) 
    {
        return 0.5 * diagonal1 * diagonal2;
    }

    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        po6 calculator = new po6();

        System.out.println("Enter the lengths of the three sides of the scalene triangle:");
        double side1 = scanner.nextDouble();
        double side2 = scanner.nextDouble();
        double side3 = scanner.nextDouble();
        double triangleArea = calculator.area(side1, side2, side3);
        System.out.printf("Area of the scalene triangle: %.2f\n", triangleArea);

        System.out.println("Enter the lengths of the two parallel sides of the trapezium and the height:");
        int base1 = scanner.nextInt();
        int base2 = scanner.nextInt();
        int height = scanner.nextInt();
        double trapeziumArea = calculator.area(base1, base2, height);
        System.out.printf("Area of the trapezium: %.2f\n", trapeziumArea);

        System.out.println("Enter the lengths of the two diagonals of the rhombus:");
        double diagonal1 = scanner.nextDouble();
        double diagonal2 = scanner.nextDouble();
        double rhombusArea = calculator.area(diagonal1, diagonal2);
        System.out.printf("Area of the rhombus: %.2f\n", rhombusArea);

        scanner.close();
    }
}