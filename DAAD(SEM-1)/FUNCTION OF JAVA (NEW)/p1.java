//function overloading
public class p1

{
    void fun(int a, int b)
    {
        System.out.println("First number: "+a);
        System.out.println("Second number: "+b);
    }
    void fun(int a, char b)
    {
        System.out.println("First number: "+a);
        System.out.println("Second value: "+b);
    }
    void fun(int a, String b)
    {
        System.out.println("First number: "+a);
        System.out.println("Second value: "+b);
    }
    void fun(String a, char b, double c, int d)
    {
        System.out.println("First number: "+a);
        System.out.println("Second value: "+b);
        System.out.println("third value: "+c);
        System.out.println("fourth value: "+d);
    }
    public static void main()
        {
            p1 obj=new p1();
            obj.fun(2,3);
            obj.fun(2, 'a');
            obj.fun(2, "abc");
            obj.fun("abc", 'k', 6.7,4);
        }
    }

