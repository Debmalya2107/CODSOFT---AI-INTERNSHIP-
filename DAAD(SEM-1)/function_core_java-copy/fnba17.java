//parameterised function
import java.util.*;
public class fnba17
{
    void input()
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter any charecter:");
        ch=sc.next().charAt(0);
        display (ch);
    }
    void display(char ch)
    {
        System.out.println("\n ASCII CODE:"+(int)ch);
    }
    
}
