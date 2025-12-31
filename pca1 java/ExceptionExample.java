import java.util.Scanner;

// Custom Exception (User-defined)
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class ExceptionExample {
    // Method that throws custom exception
    static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or above to vote.");
        } else {
            System.out.println("Eligible to vote!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            // Normal exception handling
            System.out.print("Enter a number to divide 100: ");
            int num = sc.nextInt();
            int result = 100 / num;   // may cause ArithmeticException
            System.out.println("Result = " + result);

            // Custom exception handling
            System.out.print("Enter your age: ");
            int age = sc.nextInt();
            checkAge(age);

        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (InvalidAgeException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e);
        } finally {
            System.out.println("Program execution finished.");
            sc.close();
        }
    }
}