import java.util.*;

class Employee_2 {
    // Data members
    int code;
    String name;
    double basic, hra, da, pf;

    // Default constructor
    Employee_2() {
        code = 0;
        name = "";
        basic = 0.0;
        hra = 0.0;
        da = 0.0;
        pf = 0.0;
    }

    // Parameterized constructor
    Employee_2(int code, String empname, double basicpay) {
        code = code;
        name = empname;
        basic  = basicpay;
        hra = 0.10 * basic;
        da = 0.55 * basic;
        pf = 1000;
    }
    void displayNetSalary() {
        double netSalary = basic + hra + da - pf;
        System.out.println("Employee Code: " + code);
        System.out.println("Employee Name: " + name);
        System.out.println("Basic Salary: Rs." + basic);
        System.out.println("HRA: Rs." + hra);
        System.out.println("DA: Rs." + da);
        System.out.println("PF: Rs." + pf);
        System.out.println("Net Salary: Rs." + netSalary);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee code: ");
        int code = sc.nextInt();
        sc.nextLine();
        
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        
        System.out.print("Enter Basic Pay: ");
        double basic = sc.nextDouble();
        
        // Create object using parameterized constructor
        Employee_2 obj = new Employee_2(code, empName, basic);
        obj.displayNetSalary();
    }
}