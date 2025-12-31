import java.util.*; 
class tc2 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int cp,sp,p=0,l=0; 
        double pp=0.0d,lp=0.0d;  
        try 
        { 
            System.out.print("Enter cost Price : "); 
            cp=sc.nextInt(); 
            System.out.print("Enter Selling Price : "); 
            sp=sc.nextInt(); 
            if(sp>cp) 
            { 
                p=sp-cp; 
                pp=(p*100.0d)/cp; 
                System.out.println("Profit = "+p); 
                System.out.println("Profit % = "+pp); 
            } 
            if(cp>sp) 
            { 
                l=cp-sp; 
                lp=(l*100.0d)/cp; 
                System.out.println("Loss = "+l); 
                System.out.println("Loss % = "+lp);  
            } 
            if(cp==sp) 
            System.out.println("NO PROFIT - NO LOSS"); 
 
        } 
        catch(Exception e) {
        System.out.println("No profit - No Loss");
        }; 
    } 
} 