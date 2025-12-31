import java.util.*; 
class tc7
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int nb,dp=0; 
        double dis=0.0d,amt=0.0d; 
        try 
        { 
            System.out.print("Enter Net Bill : "); 
            nb=sc.nextInt(); 
            if(nb<5000) 
            dp=5; 
            if(nb>=5000 && nb<10000) 
            dp=10; 
            if(nb>=10000) 
            dp=15; 
            dis = (dp/100.0d)*nb; 
            amt = nb - dis; 
            System.out.println("Discount % = "+dp); 
            System.out.println("Discount Amount = "+dis); 
            System.out.println("Amount Payable after Discount = "+amt); 
        } 
        catch(Exception e) {
        System.out.println("please enter a digit value"); 
        }; 
    } 
} 