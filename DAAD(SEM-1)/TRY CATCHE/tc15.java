import java.util.*; 
class tc15 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int a; 
        try 
 
        { 
            System.out.print("Enter Any Angle : "); 
            a=sc.nextInt();   
            if(a>0 && a<90) 
            System.out.println("It is an Acute Angle"); 
            if(a==90) 
            System.out.println("It is an Right Angle"); 
            if(a>90 && a<180) 
            System.out.println("It is an Obtuse Angle"); 
            if(a==180) 
            System.out.println("It is an Straight Angle"); 
            if(a>180 && a<360) 
            System.out.println("It is an Reflex Angle"); 
            if(a==360) 
            System.out.println("It is an Complete Angle"); 
            if(a<=0 || a>360) 
            System.out.println("It is an Invalid Angle"); 
        } 
        catch(Exception e) {
        System.out.println("enter the angles in number! "); 
        }; 
    } 
}