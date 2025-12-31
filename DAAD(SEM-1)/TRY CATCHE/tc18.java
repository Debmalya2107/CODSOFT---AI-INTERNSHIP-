import java.util.*; 
class tc18
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int n,i,pos,neg,ze,sev; 
        pos=neg=ze=sev=0; 
        try 
        { 
            for(i=1;i<=5;i++) 
            { 
                System.out.print("Enter any number : "); 
                n=sc.nextInt(); 
                if(n>0) 
                pos++; 
                if(n<0) 
                neg++; 
                if(n==0) 
                ze++; 
                if(n%10==7) 
                sev++; 
            } 
            System.out.println("Number of Positive Numbers = "+pos); 
            System.out.println("Number of Negative Numbers = "+neg); 
            System.out.println("Number of Zeros = "+ze);     
            System.out.println("Number of numbers Ending with 7 = "+sev); 
        } 
        catch(Exception e) {
        System.out.println("please enter all the numbers in numeric form! "); 
        }; 
    } 
} 