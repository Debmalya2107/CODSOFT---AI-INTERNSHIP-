import java.util.*; 
class tc4 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int a,b; 
        try 
        { 
            System.out.print("Enter First Number : "); 
            a=sc.nextInt(); 
            System.out.print("Enter Second Number : ");  
            b=sc.nextInt(); 
            if(a>b) 
            { 
                System.out.println("Greater Number is : "+a); 
                System.out.println("Double of the Greater Number is : "+(a*2)); 
            } 
            else 
            { 
                System.out.println("Smaller Number is : "+a); 
                System.out.println("Square Root of Smaller Number is : "+Math.sqrt(a)); 
            } 
        } 
        catch(Exception e) {
        System.out.println("please enter a digit to run the program"); 
        }; 
    } 
} 
