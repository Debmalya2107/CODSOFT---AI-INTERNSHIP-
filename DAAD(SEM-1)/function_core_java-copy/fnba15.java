import java.util.*;
public class fnba15
{
    void input()
    {
            int bs;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter a basic salary:");
            bs=sc.nextInt();
            cal(bs);
    }
    void cal(int bs)
       {
        double HRA=(bs*10)/100;
        double DA=(bs*5)/100;
        double TA=(bs*15)/100;
        double PF=(bs*20)/100;
        double GS=HRA+DA+TA+bs;
        double NP=GS-PF;
        display (HRA,DA,TA,PF,GS,NP);
    }
    void display(double HRA, double DA, double TA, double PF, double GS, double NP)
    {
        System.out.println("\n HRA="+HRA+"\n DA="+DA+"\n TA="+TA+"\n PF="+PF+"\n GS="+GS+"\n NP="+NP);
        }
}
        
