import java.io.*;

import java.util.*;

public class main_control

{
    public static void main(String args[]) throws IOException
    {

        variable v=new variable();
    
        buzz b=new buzz();
        
        neon n=new neon();
        
        palindrome_number pa=new palindrome_number();
        
        prime pr=new prime();
        
        armstrong ar=new armstrong();
        
        krishno_special kr=new krishno_special();
        
        automorphic au=new automorphic();
        
        duck_no du=new duck_no();
        
        magic_number ma=new magic_number();
        
        perfect_no pn=new perfect_no ();
        
        prime_Palindrome pp=new prime_Palindrome();
        
        circular_Prime cip=new circular_Prime();
        
        co_prime_number cp=new co_prime_number();
        
        digitToWord dw=new digitToWord();
        
        happyNumber hp=new happyNumber();
        
        niven_number nn=new niven_number();
        
        spy spy=new spy();
        
        twin_prime tp=new twin_prime();
        
        twistedPrime tsp=new twistedPrime();
        
        unique_no uin=new unique_no();
        
        disarium_no dn=new disarium_no();
        
        tech_number tn=new tech_number();
        
        pronic_number prn=new pronic_number();
        
        ugly_number un=new ugly_number();
        
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Scanner sc=new Scanner(System.in);
        System.out.println("\t\t \t Menu_Driven List of programs: \t \t \t"); 
        System.out.println("please select a condition which you want to use");
        System.out.println("Enter choice : \n 1.BUZZ NUMBER \n 2.NEON NUMBER \n 3. PALINDROME NUMBER \n 4.PRIME NUMBER \n 5.ARMSTRONG NUMBER \n 6. KRISHNAMURTY NUMBER \n 7. AUTOMORPHIC NUMBER \n 8. DUCK NUMBER \n 9.MAGIC NUMBER \n 10. PERFECT NUMBER \n 11. PRIME PALINDROME NUMBER \n 12.CIRCULAR PRIME NUMBER \n 13. CO-PRIME NUMBER \n 14. CONVERTING DIGIT TO WORD \n 15.HAPPY NUMBER \n 16.NIVEN NUMBER \n 17.SPY NUMBER \n 18. TWIN PRIME NUMBER \n 19. TWISTED PRIME NUMBER \n 20.UNIQUE NUMBER \n 21.DISARIUM NUMBER \n 22.TECH NUMBER \n 23. PRONIC NUMBER \n 24. UGLY NUMBER \n");
        v.ch = sc.nextInt();

        switch (v.ch) {
            case 1:
                System.out.println("Enter 1st number");
                v.num1=sc.nextDouble(); 
                v.result = b.result(v.num1);
                break;
            case 2:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble(); 
                v.result = n.result(v.num1);
                break;
            case 3:
                System.out.println("Enter 1st number");
                v.num1=sc.nextDouble(); 
                v.result = pa.result(v.num1, v.rem,v.rev,v.temp);
                break;
            case 4:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble(); 
                v.result = pr.result(v.num1);
                break;
            case 5:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble(); 
                v.result = ar.result(v.num1);
                break;
            case 6:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble(); 
                v.result = kr.result(v.num1);
                break;
            case 7:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = au.result(v.num1);
                break;
            case 8:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble(); 
                v.result = du.result(v.num1);
                break;
            case 9:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = ma.result(v.num1);
                break;
            case 10:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = pn.result(v.num1);
                break;
            case 11:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = pp.result(v.num1);
                break;
            case 12:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = cip.result(v.num1);
                break;
            case 13:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                System.out.print("Enter a number: ");
                v.num2=sc.nextDouble();
                v.result = cp.result(v.num1,v.num2);
                break;
            case 14:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = dw.result(v.num1);
                break;
            case 15:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = hp.result(v.num1);
                break;
            case 16:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = nn.result(v.num1);
                break;
            case 17:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = spy.result(v.num1);
                break;
            case 18:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = tp.result(v.num1);
                break;
            case 19:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = tsp.result(v.num1);
                break;
            case 20:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = uin.result(v.num1);
                break;
            case 21:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = dn.result(v.num1);
                break;
            case 22:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = tn.result(v.num1);
                break;
            case 23:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = prn.result(v.num1);
                break;
            case 24:
                System.out.print("Enter a number: ");
                v.num1=sc.nextDouble();
                v.result = un.result(v.num1);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }
    }
}