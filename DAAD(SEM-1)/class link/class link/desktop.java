public class desktop
{
    double discount(double amt)
    {
        pro_vari pv=new pro_vari();
        if(amt>10000)
            pv.disc=(amt*10)/100;
        else if(amt>5701 && amt<10000)
            pv.disc=(amt*7.5)/100;
        else if(amt>2501 && amt<5700)
            pv.disc=(amt*5)/100;
        else
            pv.disc=(amt*0)/100;
        return pv.disc;
    }
}