import java.util.*; 
class tc26
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,i,f=1; 
        try 
        { 
            System.out.print("Enter any number : "); 
            n=sc.nextInt(); 
            for(i=1;i<=n;i++) 
            f=f*i; 
            System.out.println("Factorial of the number : "+n +" is = "+f); 
        } 
 
        catch(Exception e){
        System.out.println("please use any integer as a input"); 
        }; 
    } 
} 