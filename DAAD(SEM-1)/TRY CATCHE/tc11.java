import java.util.*; 
class tc11
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        char ch; 
        String x; 
        try 
        { 
            System.out.print("Enter Any Character : "); 
            ch=sc.next().charAt(0); 
            x=sc.nextLine(); 
            if(ch>='A' && ch<='Z') 
            System.out.println("It is Upper Case Alphabet"); 
            if(ch>='a' && ch<='z') 
            System.out.println("It is Lower Case Alphabet"); 
            if(ch>='0' && ch<='9') 
            System.out.println("It is Digit"); 
 
        } 
        catch(Exception e){
        System.out.println("please enter any digit or any alphabet from the keeyboard !"); 
        }; 
    } 
} 