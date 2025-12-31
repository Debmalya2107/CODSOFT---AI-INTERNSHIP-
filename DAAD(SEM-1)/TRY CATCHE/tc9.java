import java.util.*; 
class tc9
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int sa,cp=0; 
        double cpaid=0.0d; 
        try 
        { 
            System.out.print("Enter Total Sales : "); 
            sa=sc.nextInt(); 
            if(sa<=10000) 
            cp=2; 
            if(sa>=10001 && sa<=20000) 
            cp=4; 
            if(sa>=20001 && sa<=50000) 
            cp=8; 
            if(sa>50000) 
            cp=15; 
            cpaid = (cp/100.0d)*sa; 
            System.out.println("Commission % = "+cp); 
            System.out.println("Commission Payable = "+cpaid); 
        } 
        catch(Exception e){
        System.out.println("please enter the number in digits :"); 
        }; 
    } 
} 