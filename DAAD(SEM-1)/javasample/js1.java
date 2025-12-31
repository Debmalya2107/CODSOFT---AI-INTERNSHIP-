import java.util.Scanner;
class js1
{
    public static void main ()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the words to remove redundancy");
        String s=sc.next();
        int l = s.length();
        String s2= " ";
        char ch;
        for(int i=0 ; i< l ; i++)
        {
            ch=s.charAt(i);
            if(s2.indexOf(ch)<0)
            s2=s2+ch;
        }
        System.out.println(s2);
    }
}
