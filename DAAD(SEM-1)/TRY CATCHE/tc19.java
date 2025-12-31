import java.util.*; 
class tc19
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int x=0,n=53,i; 
        try 
 
        { 
            System.out.print("How many even numbers to print : "); 
            x=sc.nextInt(); 
            for(i=1;i<=x;) 
            { 
                if(n%2==0) 
                { 
                    System.out.print(n+"\t"); 
                    i++; 
                } 
                n++; 
            } 
        } 
        catch(Exception e) {
        System.out.print("please enter thr input in integer"); 
        }; 
    } 
} 