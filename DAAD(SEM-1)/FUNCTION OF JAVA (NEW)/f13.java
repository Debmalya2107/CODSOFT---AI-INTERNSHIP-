import java.util.Scanner;

class f13
 {
    private double length;
    private double width;
    private double side;
    private double rectPerimeter;
    private double squarePerimeter;
    
    public void accept(double len, double wid, double s) 
    {
        length = len;
        width = wid;
        side = s;
    }

    public void calculatePerimeters() 
    {
        rectPerimeter = 2 * (length + width);
        squarePerimeter = 4 * side;
    }
    
    public void showResult() 
    {
        System.out.printf("Perimeter of rectangle: %.2f\n", rectPerimeter);
        System.out.printf("Perimeter of square: %.2f\n", squarePerimeter);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter rectangle length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter rectangle width: ");
        double width = scanner.nextDouble();
        
        System.out.print("Enter square side length: ");
        double side = scanner.nextDouble();
        
        f13 perimeterCalculator = new f13();
        perimeterCalculator.accept(length, width, side);
        perimeterCalculator.calculatePerimeters();
        perimeterCalculator.showResult();
        
        scanner.close();
    }
}
