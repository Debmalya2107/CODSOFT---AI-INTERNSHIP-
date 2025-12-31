import java.util.*; 
class tc12
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int a,b,c,max=0; 
        try 
        { 
            System.out.println("Enter 3 Numbers : "); 
            a=sc.nextInt(); 
            b=sc.nextInt(); 
            c=sc.nextInt(); 
            if(a>b && a>c)   
            max=a; 
            if(b>a && b>c) 
            max=b; 
            if(c>a && c>b) 
            max=c; 
            System.out.println("Maximun Number is "+max); 
        } 
        catch(Exception e){
         System.out.println("please enter any three digits of integer "); 
        }; 
    } 
} 