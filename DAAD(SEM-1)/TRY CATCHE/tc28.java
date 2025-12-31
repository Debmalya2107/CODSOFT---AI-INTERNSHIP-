import java.util.*; 
class tc28
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,i; 
        try 
        { 
            System.out.print("Enter any number : "); 
            n=sc.nextInt(); 
            System.out.println("Factors of the number are :-"); 
            for(i=1;i<=n;i++) 
            { 
                if(n%i==0) 
                System.out.print(i+"\t"); 
            } 
        } 
        catch(Exception e){
        System.out.print("please enter any integer number");
        }; 
    } 
}