import java.util.*;
public class p4
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("\n ENTER THE LETTER FROM VIBGVOR :");
        int ch=sc.next().charAt(0);
        double na;
        switch(ch)
        {
            case 'V':   System.out.println("VIOLET");
                        break;
            case 'I':   System.out.println("INDIGO");
                        break;
            case 'B':   System.out.println("BLUE");
                        break;
            case 'G':   System.out.println("GREEN");
                        break;
            case 'Y':   System.out.println("YELLOW");
                        break;
            case 'O':   System.out.println("ORANGE");
                        break;
            case 'R':   System.out.println("RED");
                        break;
        default:    System.out.println("wrong input");
       }
    }
}

