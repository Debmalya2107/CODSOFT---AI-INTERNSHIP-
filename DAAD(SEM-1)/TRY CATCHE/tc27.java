import java.util.*; 
class tc27 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,i,f=0; 
        try 
        { 
            System.out.print("Enter any number : "); 
            n=sc.nextInt(); 
            for(i=1;i<=n;i++) 
            { 
                if(n%i==0) 
                f++; 
            } 
            if(f==2) 
            System.out.println("It is a Prime Number"); 
            else 
            System.out.println("It is NOT a Prime Number"); 
        } 
        catch(Exception e){
        System.out.println("please enter any integer number to check !"); 
        }; 
    } 
} 