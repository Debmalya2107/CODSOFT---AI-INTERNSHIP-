import java.util.*; 
class tc17
{ 
    public static void main(String args[]) 
    { 
 
        Scanner sc=new Scanner(System.in); 
        int n,i; 
        try  
        { 
            System.out.print("Enter number whose table you want to print : "); 
            n=sc.nextInt(); 
            for(i=1;i<=20;i++) 
            System.out.println(n + " x " + i + " = " +(n*i)); 
        } 
        catch(Exception e) {
        System.out.println("please enter the number whose table you want in numeric form !");
        }; 
    } 
} 