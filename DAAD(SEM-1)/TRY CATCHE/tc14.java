import java.util.*; 
class tc14
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int m1,m2,m3; 
        double avg1=0.0d, avg2=0.0d; 
        try 
        { 
            System.out.print("Enter Marks of First Term : "); 
            m1=sc.nextInt(); 
            System.out.print("Enter Marks of Second Term : "); 
            m2=sc.nextInt(); 
            System.out.print("Enter Marks of Third Term : "); 
            m3=sc.nextInt(); 
            avg1=(m1+m2+m3)/3.0d; 
            avg2=(m2+m3)/2.0d; 
            System.out.println("Average of three terms = "+avg1); 
            System.out.println("Average of Second and third terms = "+avg2); 
            if(avg1>=50 || avg2>=63) 
            System.out.println("Pass"); 
            else 
            System.out.println("Fail"); 
        } 
        catch(Exception e) {
         System.out.println("Enter the marks in number to get the result");   
        }; 
    } 
} 