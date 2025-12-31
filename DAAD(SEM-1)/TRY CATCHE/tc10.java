import java.util.*; 
class tc10  
 
{ 
    public static void main(String args[]) 
    { 
        Scanner sc=new Scanner(System.in); 
        int bp; 
        double dp,hp,da,hra,gp; 
        dp=hp=da=hra=gp=0.0d; 
        try 
        { 
            System.out.print("Enter Basic Pay : "); 
            bp=sc.nextInt(); 
            if(bp<=30000)  
            { 
                dp=58.5d; 
                hp=12.0d; 
            } 
            if(bp>=30001 && bp<=50000)  
            { 
                dp=65.0d; 
                hp=16.5d; 
            } 
            if(bp>50000)  
            { 
                dp=73.0d; 
                hp=24.8d; 
            } 
            da = (dp/100.0d)*bp; 
            hra = (hp/100.0d)*bp; 
            gp = bp+da+hra; 
            System.out.println("Gross Pay = "+gp); 
        } 
        catch(Exception e) {
        System.out.println("please enter in integer numbers !" ); 
        }; 
    } 
} 