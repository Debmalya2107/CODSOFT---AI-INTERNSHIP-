import java.util.Scanner;
class js6
{
    public static void main(String args[])
    {
        js6 obj=new js6();
    }
    public js6()
    {
        Scanner sc=new Scanner (System.in);
        int dec,rem;
        char[] hexa={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
        String hexval= " ";
        System.out.println("Enet any number to convert to hexavalue: ");
        dec=sc.nextInt();
        while(dec>0)
        {
        rem=dec%16;
        hexval=hexa[rem]+hexval;
        dec=dec/16;
        }
        System.out.println("Hexa value is :"+hexval);
    }
}