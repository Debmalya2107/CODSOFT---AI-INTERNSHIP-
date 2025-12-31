import java.util.Scanner;

class f11 {
    private double kg;
    private double g;
    private double km;
    private double m;
    private double l;
    
    public f11(double kilogram, double kilometer, double liter) {
        kg = kilogram;
        km = kilometer;
        l = liter;
        g = 0; 
        m = 0; 
    }
    
    public void convert()
    {
        g = kg * 1000;   
        m = km * 1000;   
    }
    
    public void display() 
    {
        System.out.println("Conversions:");
        System.out.printf("Kilograms to grams: %.2f kg = %.2f g\n", kg, g);
        System.out.printf("Kilometers to meters: %.2f km = %.2f m\n", km, m);
        System.out.printf("Liters to cubic meters: %.2f l = %.4f m³\n", l, l * 0.001);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);    
        System.out.print("Enter weight in kilograms: ");
        double kg = scanner.nextDouble();
        System.out.print("Enter distance in kilometers: ");
        double km = scanner.nextDouble();
        System.out.print("Enter volume in liters: ");
        double l = scanner.nextDouble();
        f11 converter = new f11(kg, km, l);
        converter.convert();
        converter.display();
        scanner.close();
    }
}
