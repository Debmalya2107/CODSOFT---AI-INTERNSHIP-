import java.util.*;
public class p5
{
    public static void main(String args[])
    {
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the sales value:");
    double s=sc.nextInt();
    double com;
    double na;
    if(s>10000)
    {
          com=(s*10)/100;
    }
    else if(s>=5000 && s<10000)
    {
          com=(s*8)/100;
    }
    else
    {
         com=(s*5)/100;
    }
    na=s+com;
    System.out.println("now the commission:"+com);
    System.out.println("now the net amount:"+na);
    }
}