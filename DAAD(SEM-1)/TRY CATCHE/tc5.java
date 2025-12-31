import java.util.*; 
class tc5
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,sq=0; 
        try 
        { 
            System.out.print("Enter Any Number : "); 
            n=sc.nextInt(); 
            sq = (int)Math.sqrt(n); 
            if((sq*sq)==n) 
            System.out.println("PERFECT SQUARE"); 
            else 
            System.out.println("NOT A PERFECT SQUARE"); 
        } 
        catch(Exception e) {
        System.out.println("please enter a digit to continue!"); 
        }; 
    } 
} 