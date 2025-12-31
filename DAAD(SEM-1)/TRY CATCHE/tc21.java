import java.util.*; 
class tc21
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int a,b,c,n,i; 
        a=0; 
 
        b=1; 
        try 
        { 
            System.out.print("Enter number of terms : "); 
            n=sc.nextInt(); 
            System.out.print(a+"\t"+b+"\t"); 
            for(i=3;i<=n;i++) 
            { 
                c = a + b; 
                System.out.print(c+"\t"); 
                a=b; 
                b=c; 
            } 
        } 
        catch(Exception e){
        System.out.print("only integer inputs are acceptable"); 
        }; 
    } 
} 