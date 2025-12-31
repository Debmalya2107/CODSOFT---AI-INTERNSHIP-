import java.util.*; 
class tc6
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int a,b,s=0; 
        try 
        { 
            System.out.print("Enter First Angle : "); 
            a=sc.nextInt(); 
            System.out.print("Enter Second Angle : "); 
            b=sc.nextInt(); 
            s=a+b; 
            System.out.println("Sum of Angles = "+s); 
            if(s==90) 
            System.out.println("It is a Complementary Angle");   
            else 
            System.out.println("It is NOT a Complementary Angle"); } 
            catch(Exception e) {
            System.out.println("please enteer a integer digit to continue the program! ");   
            }; 
        } 
} 