import java.util.*;
public class p7
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\t \t \t \t TRIANGLE:");
        System.out.println(" AREA OF EQUILATERAL TRIANGLE=1");
        System.out.println("\n AREA OF ISOSCELES TRIANGLE=2");
        System.out.println("\n AREA OF SCALENE TRIANGLE=3");
        System.out.println("\n enter your choise :");
        int ch=sc.nextInt();
        double si,a,b,EQAREA,ISOAREA,SCAAREA;
        switch(ch)
        {
            case 1:     System.out.println("\n enter the EQUILATERAL  :");
                        si=sc.nextInt();
                        EQAREA=Math.sqrt(3)/4*si*si;
                        System.out.println("\n the area is:"+EQAREA);
                        break;
            case 2:     System.out.println("\n enter the ISOSCELES   :");
                        a=sc.nextInt();
                        System.out.println("\n enter the ISOSCELES  :");
                        b=sc.nextInt();
                        ISOAREA=b/4*Math.sqrt(4)*a*a-b*b;
                        System.out.println("\n the area is:"+ISOAREA);
                        break;
            case 3:     System.out.println("\n enter the 1ST ANGLE OF SCALENE:");
                        double M=sc.nextInt();
                        System.out.println("\n enter the 2ND ANGLE OF SCALENE:");
                        double N=sc.nextInt();
                        System.out.println("\n enter the 3RD ANGLE OF SCALENE:");
                        double P=sc.nextInt();
                        double s=(M+N+P)/4;
                        SCAAREA=Math.sqrt(s)*(s-M)*(s-N)*(s-P);
                        System.out.println("\n the area is:"+SCAAREA);
                        break;
            default:    System.out.println("wrong input");
       }
    }
}

