import java.io.*;
import java.util.*;
public class main_control
{
    public static void main(String args[])throws IOException
    {
        variable v=new variable();
        laptop l=new laptop();
        desktop d=new desktop();
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter customer Name: ");
        v.num=in.readLine();
        System.out.println("Enter customer Address: ");
        v.add=in.readLine();
        System.out.println("\t\t\t\t MENU DRIVEN PROGRAM");
        System.out.println("L/l LAPTOP");
        System.out.println("D/d Desktop");
        System.out.println("Enter your choise: ");
        v.ch=sc.next().charAt(0);
        switch(v.ch)
        {
            case 'l':
            case 'L':   System.out.println("Enter Amount: ");
                        v.amt=Double.parseDouble(in.readLine());
                        v.disc=l.discount(v.amt);
                        v.na=v.amt-v.disc;
                        break;
            case 'd':
            case 'D':   System.out.println("Enter Amount: ");
                        v.amt=Double.parseDouble(in.readLine());
                        v.disc=d.discount(v.amt);
                        v.na=v.amt-v.disc;
                        break; 
            default:    System.out.println("Wrong Input");
        }
        System.out.println("Name: "+v.num);
        System.out.println("Address: "+v.add);
        System.out.println("Main Amount: "+v.amt);
        System.out.println("Discount Amount: "+v.disc);
        System.out.println("Net amount: "+v.na);
    }
}