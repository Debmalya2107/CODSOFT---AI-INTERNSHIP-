//polymorphism in java - Mewthod Overloading
/*  class A
{
    void add()
    {
        int a=10,b=20,c=0;
        c=a+b;
        //System.out.println(c);
    }
    void add(int x,int y)
    {
        int c=x+y;
        //System.out.println(c);
    }
    void add(int x,double y)
    {
        double c=x+y;
        //System.out.println(c);
    }
    public static void main(String[] args) {
        A r=new A();
        r.add();
        r.add(100,200);
        r.add(100,2.00);
    }
}
/* */
//inheritance in java
/*
class shape{
    String color;
}
class triangle extends shape
{

}

/*
public class oops
{
    public static void main(String[] args) {
        triangle t=new triangle();
        t.color="red";
        System.out.println("Triangle color is: "+t.color);
    }
}
*/
//single inheritance
/* 
class Shape{
    public void area()
    {
        System.out.println("Displays area");
    }
}
class Triangle extends Shape
{
    public void area(int l,int h)
    {
        System.out.println("Area of triangle: "+(0.5*l*h));
    }
}
public class maths{
    public static void main(String args[])
    {
      Triangle t=new Triangle();
      t.area();
      t.area(10,20);
      
    }
}
//multilevel inheritance
    
class Shape{
    public void area()
    {
        System.out.println("Displays area");
    }
}
class Triangle extends Shape
{
    public void area(int l,int h)
    {
        System.out.println("Area of triangle: "+(0.5*l*h));
    }
}
class EquilateralTriangle extends Triangle
{
    public void area(int a)
    {
        System.out.println("Area of equilateral triangle: "+((1.73/4)*a*a));
    }
}
/*
public class maths{
    public static void main(String args[])
    {
      Triangle t=new Triangle();
      t.area();
      t.area(10,20);
      EquilateralTriangle e=new EquilateralTriangle();
      e.area();
    e.area(10);
    }
}/* */
//data abstraction
abstract class animal 
{
    abstract void walk();
    {
        System.out.println("Animal walks");
    }
}
class horse extends animal
{
    public void walk()
    {
        System.out.println("Horse walks on 4 legs");
    }
}
class tiger extends animal
{
    public void walk()
    {
        System.out.println("Tiger walks on 2 legs");
    }
}
public class oops 
{
    public static void main(String[] args) {
        horse h=new horse();
        h.walk();
        tiger t=new tiger();
        t.walk();
        
    }
}
