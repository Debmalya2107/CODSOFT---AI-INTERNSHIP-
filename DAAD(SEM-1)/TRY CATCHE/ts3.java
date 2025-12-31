import java.util.*; 
class ts3
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n; 
        try 
        { 
            System.out.print("Enter Any Number : "); 
            n=sc.nextInt(); 
            if(n%2==0) 
            System.out.println("EVEN"); 
            else 
            System.out.println("ODD"); 
        } 
        catch(Exception e) {
        System.out.println("please enter a number! "); 
        }; 
    } 
} 