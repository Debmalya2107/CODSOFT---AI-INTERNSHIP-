import java.util.*; 
class tc1
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n; 
        try 
        { 
            System.out.print("Enter Any Number : "); 
            n=sc.nextInt(); 
            if(n>0) 
                System.out.println("POSITIVE NUMBER"); 
            if(n<0) 
                System.out.println("NEGATIVE NUMBER"); 
            if(n==0) 
                System.out.println("ZERO"); 
         } 
         catch(Exception e) { 
             System.out.println("please enter a digit to continue"); 
            }; 
    } 
} 