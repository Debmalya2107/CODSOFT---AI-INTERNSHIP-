import java.io.*;
import java.util.*;
public class main_control
{
    public static void main(String args[])throws IOException
    {
        variable v=new variable();
        addition a=new addition();
        subtraction s=new subtraction();
        multification m=new multification();
        division d=new division();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Scanner sc=new Scanner(System.in);
        System.out.println("\t \t Calculator:\t \t ");
        System.out.println("Enter 1st number:");
        v.a = sc.nextDouble();

        System.out.println("Enter 2nd number:");
        v.b = sc.nextDouble();

        System.out.println("\t\t\t\t MENU DRIVEN PROGRAM");
        System.out.println("Enter your choice (1. Addition / 2. Subtraction / 3. Multiplication / 4. Division):");
        v.ch = sc.next().charAt(0);

        switch (v.ch) {
            case '1':
                v.result = a.result(v.a, v.b);
                break;
            case '2':
                v.result = s.result(v.a, v.b);
                break;
            case '3':
                v.result = m.result(v.a, v.b);
                break;
            case '4':
                v.result = d.result(v.a, v.b);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result = " + v.result);
    }
}
        

    