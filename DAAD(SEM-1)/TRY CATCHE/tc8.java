import java.util.*; 
class tc8
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int phy,chem,bio; 
        double avg=0.0d; 
        char gr= ' '; 
        try 
        { 
            System.out.print("Enter Physics Marks : "); 
            phy=sc.nextInt(); 
            System.out.print("Enter Chemistry Marks : "); 
            chem=sc.nextInt(); 
            System.out.print("Enter Biology Marks : "); 
            bio=sc.nextInt(); 
            avg=(phy+chem+bio)/3.0d; 
            if(avg>=0 && avg<=50) 
            gr='C'; 
            if(avg>=51 && avg<=70) 
            gr='B'; 
 
            if(avg>=71 && avg<=90) 
            gr='A'; 
            if(avg>=91 && avg<=100) 
            gr='*'; 
            System.out.println("Average : "+avg); 
            System.out.println("Grade : "+gr); 
        } 
        catch(Exception e) {
        System.out.println("please enter the marks in integer properly to get your grades"); 
        }; 
    } 
} 