import java.util.*; 
class tc13
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int u,mr=35; 
        double bill=0.0d; 
        try 
        { 
            System.out.print("Enter Units Consumed : "); 
            u=sc.nextInt(); 
            if(u<=200) 
            bill = u * 4.5d; 
            if(u>200 && u<=400) 
            bill = 200*4.5 + ((u-200) * 5.5d); 
            if(u>400) 
            bill = 200 * 4.5d + 200 * 5.5d + ((u-400) * 6.5d); 
            bill = bill + mr; 
 
            System.out.println("Bill with Meter Rent = "+bill);  
        } 
        catch(Exception e){
        System.out.println("please enter the units consumed in numeric numbers only ");  
        }; 
    } 
} 