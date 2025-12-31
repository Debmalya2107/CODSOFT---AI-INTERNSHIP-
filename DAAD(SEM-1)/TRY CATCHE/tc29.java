import java.util.*; 
class tc29
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,i,s=0; 
        try 
        { 
            System.out.print("Enter any number : "); 
            n=sc.nextInt(); 
            for(i=1;i<=n/2;i++) 
            { 
                if(n%i==0) 
                s=s+i; 
            } 
            if(n==s) 
            System.out.println("It is a Perfect Number"); 
            else 
            System.out.println("It is NOT a Perfect Number"); 
        } 
        catch(Exception e){
        System.out.println("please anter any integer number to get results! "); 
        }; 
    } 
} 