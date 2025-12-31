import java.util.*; 
class tc24
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,i,a,x=1; 
        double s=0.0d; 
        try 
        { 
            System.out.print("Enter value of N : "); 
            n=sc.nextInt(); 
            System.out.print("Enter value of A : "); 
            a=sc.nextInt(); 
            for(i=1;i<=n;i++) 
            { 
                s = s + (x/Math.pow(a,(x+1))); 
 
                x=x+2; 
            } 
            System.out.println("Sum of Series = "+s); 
        } 
        catch(Exception e){
        System.out.println("please enter only integer values! "); 
        }; 
    } 
 
} 