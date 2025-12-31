import java.util.Scanner;
class js3
{
 public static void main(String args[])   
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a word: ");
        String s=sc.nextLine();
        System.out.println("Original word ");
        System.out.println(s);
        String n=" ";
        char prevchar = ' ';
        
        for(int i=0; i <s.length();i++)
        {
            if(prevchar != s.charAt(i))
                n=n+s.charAt(i);
                prevchar=s.charAt(i);
        }
        System.out.println("After removing letter redundancy ");
        System.out.println(n);
    }
}