import java.util.Scanner;
class test
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any Character : ");
        char ch=sc.next().charAt(0);
        if(ch>='A' && ch<='Z')
            System.out.println("It is Upper Case Alphabet");
        else if(ch>='a' && ch<='z')
            System.out.println("It is Lower Case Alphabet");
        else if(ch>='0' && ch<='9')
            System.out.println("It is Digit");
        else
            System.out.println("It is Special Symbol");
    }
}
