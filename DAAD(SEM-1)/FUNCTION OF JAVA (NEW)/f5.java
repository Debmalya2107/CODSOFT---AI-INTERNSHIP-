import java.util.*;
public class f5

{
    void circle(int r)
    {
        System.out.println("The area  of circle is :"+(3.14*(r*r)));
    }
    void sq(int s)
    {
        System.out.println("The area of square is : "+(s*s));
    }
    void rec(int l, int b)
    {
        System.out.println("The area of rectangle is : " +(l*b));
    }
    public static void main(String[]args)
        {
            char ch;
            Scanner sc=new Scanner(System.in);
            
            System.out.println("Enter the radius of the circle: ");
            int r=sc.nextInt();
            
            System.out.println("Enter the side of the square: ");
            int s=sc.nextInt();
            
            System.out.println("Enter the length of the rectangle: ");
            int l=sc.nextInt();
            System.out.println("Enter the breadth of the rectangle: ");
            int b=sc.nextInt();
            
            System.out.println("choose which you want to perform?(press c for circle , s for square , r for rectangle");
            ch= sc.next().charAt(0);
            
            f5 obj=new f5();
            
            if(ch=='c')
            {
              obj.circle(r);
            }
            else if(ch=='s')
            {
              obj.sq(s);
            }
            else if(ch=='r')
            {
              obj.rec(l,b);
            }
        }
    }




