import java.util.*; 
class tc23
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,i,a; 
        double s=0.0d; 
        try 
        { 
            System.out.print("Enter value of N : "); 
            n=sc.nextInt(); 
            System.out.print("Enter value of A : "); 
            a=sc.nextInt(); 
            for(i=1;i<=n;i++) 
            s = s + (i/Math.pow(a,i)); 
            System.out.println("Sum of Series = "+s); 
        } 
        catch(Exception e) {
        System.out.println("please enter the values in integer only "); 
        }; 
    } 
 
} 