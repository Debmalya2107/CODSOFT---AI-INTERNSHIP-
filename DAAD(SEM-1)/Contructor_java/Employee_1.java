// default constructor & parameterised constructor 
import java.util.*;
class Employee_1{
    String name;
    double basic;
    double da, hra, pf, np, gs;

    Employee_1(String empName, double basicPay)
    {
        name = empName;
        basic = basicPay;

        da = 0.25 * basic;
        hra = 0.15 * basic;
        pf = 0.0833 * basic;

        np = basic + da + hra;
        gs = np - pf;
    }
    void display() {
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Pay: " + basic);
        System.out.println("Gross Salary: " + gs);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();

        System.out.print("Enter Basic Pay: ");
        double basicPay = sc.nextDouble();

        Employee_1 obj = new Employee_1(empName, basicPay);
        obj.display();
    }
}