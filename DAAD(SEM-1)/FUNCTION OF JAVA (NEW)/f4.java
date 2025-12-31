import java.util.*;
public class f4

{
    void cube(int a1, int a2, int a3)
    {
        System.out.println("The volume of the cube is :"+(a1*a2*a3));
    }
    void sp(int r1, int r2, int r3)
    {
        System.out.println("The volume of the spheere is : "+((4/3)*(3.14)*(r1*r2*r3)));
    }
    void cubo(int s1, int s2, int s3)
    {
        System.out.println("The volume of the cuboid is: " +((4/3)*(3.14)*(s1*s2*s3)));
    }
    public static void main(String[]args)
        {
            char ch;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the first side of cube: ");
            int a1= sc.nextInt();
            System.out.println("Enter the second side of cube: ");
            int a2= sc.nextInt();
            System.out.println("Enter the third side of cube: ");
            int a3= sc.nextInt();
            
            System.out.println("Enter the first side of sphere: ");
            int r1= sc.nextInt();
            System.out.println("Enter the second side of sphere: ");
            int r2= sc.nextInt();
            System.out.println("Enter the third side of sphere: ");
            int r3= sc.nextInt();
  
            
            System.out.println("Enter the first side of cuboid: ");
            int s1= sc.nextInt();
            System.out.println("Enter the second side of cuboid: ");
            int s2= sc.nextInt();
            System.out.println("Enter the third side of cuboid: ");
            int s3= sc.nextInt();
            
            System.out.println("choose which you want to perform?(press c for cube , s for sphere , o for cuboid");
            ch= sc.next().charAt(0);
            
            f4 obj=new f4();
            
            if(ch=='c')
            {
              obj.cube(a1,a2,a3);
            }
            else if(ch=='s')
            {
              obj.sp(r1,r2,r3);
            }
            else if(ch=='o')
            {
              obj.cubo(s1,s2,s3);
            }
        }
    }




