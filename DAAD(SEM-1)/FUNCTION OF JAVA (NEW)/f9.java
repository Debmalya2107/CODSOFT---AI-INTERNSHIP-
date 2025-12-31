import java.util.Scanner;

public class f9 {
    
    
    public int rollNumber;
    public String name;
    public double engMarks;
    public double mathMarks;
    public double compMarks;
    public double percentage;

    
    public f9(int rollNum, String studentName, double englishMarks, double mathematicsMarks, double computerMarks) {
        rollNumber = rollNum;
        name = studentName;
        engMarks = englishMarks;
        mathMarks = mathematicsMarks;
        compMarks = computerMarks;
        percentage = 0.0; 
    }

    
    public double calculatePercentage() {
        double totalMarks = engMarks + mathMarks + compMarks;
        percentage = (totalMarks / 300) * 100; 
        return percentage;
    }

    
    public void displayResult() {
        System.out.println("\n--- Student Result ---");
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("English Marks: " + engMarks);
        System.out.println("Math Marks: " + mathMarks);
        System.out.println("Computer Marks: " + compMarks);
        System.out.println("Percentage: " + percentage + "%");
    }

    
    public void inputStudentDetails() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        rollNumber = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter Name: ");
        name = scanner.nextLine();

        System.out.print("Enter English Marks: ");
        engMarks = scanner.nextDouble();

        System.out.print("Enter Math Marks: ");
        mathMarks = scanner.nextDouble();

        System.out.print("Enter Computer Marks: ");
        compMarks = scanner.nextDouble();
    }

    
    public static void main(String[] args) {
        
        f9 student = new f9(0, "", 0.0, 0.0, 0.0);

        
        System.out.println("Enter Student Details:");
        student.inputStudentDetails();

        
        student.calculatePercentage();

        
        student.displayResult();
    }
}
