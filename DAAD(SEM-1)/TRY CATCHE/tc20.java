import java.util.*; 
    class tc20 
    { 
        public static void main(String args[]) 
        { 
            Scanner sc=new Scanner(System.in); 
            int n,i,x,ev=0,od=0; 
            try 
            { 
                System.out.print("How many numbers to input : "); 
                n=sc.nextInt();   
                for(i=1;i<=n;i++) 
                { 
                    System.out.print("Enter any number : "); 
                    x=sc.nextInt(); 
                    if(x%2==0) 
                    ev=ev+x; 
                    else 
                    od=od+x; 
                } 
                System.out.println("Sum of Even Numbers = "+ev); 
                System.out.println("Sum of Odd Numbers = "+od); 
            } 
            catch(Exception e){
            System.out.println("only integer inputs are proceedable"); 
            }; 
        } 
} 