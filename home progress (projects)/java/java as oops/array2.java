import java.util.*;
class array2
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the array :");
        int n=sc.nextInt();
        int marks[]=new int[n];
        
        System.out.println("enter the items in the array");
        for(int i=0;i<=n;i++)
        marks[i]=sc.nextInt();
        System.out.println("enter the number you want to find out :");
        int x=sc.nextInt();
        for(int r=0;r<marks.length;r++)
        {
            if(marks[i]==x)
            {
                System.out.println("found at index "+i);
            }
        }
        
        
    }
}