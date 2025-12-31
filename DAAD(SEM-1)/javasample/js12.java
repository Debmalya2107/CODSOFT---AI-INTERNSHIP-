import java.util.*;

class js12 
{
    public static void main()
    {
        String str,st=" ";
        int i,len;
        char chr;
        Scanner sc=new Scanner (System.in);
        System.out.println("enter the string = ");
        str = sc.nextLine();
        str = " "+str;
        len=str.length();
        for(i=0;i<len;i++)
        {
            chr=str.charAt(i);
            if(chr == ' ' )
            {
                st = st+Character.toUpperCase(str.charAt(i+1))+".";
            }
        }
        System.out.println(st);
    }
}