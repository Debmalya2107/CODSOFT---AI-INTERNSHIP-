import java.util.*; 
class tc16
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,i; 
        try 
        { 
            System.out.print("Enter number of terms : "); 
            n=sc.nextInt(); 
            for(i=1;i<=n;i++) 
            System.out.print((i*10)+"\t"); 
        } 
        catch(Exception e){
        System.out.println("please enter the number of terms on numeric form");
        }; 
    } 
}