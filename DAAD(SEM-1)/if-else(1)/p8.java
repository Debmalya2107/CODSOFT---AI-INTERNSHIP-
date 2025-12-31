import java.util.*;
public class p8
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        double clp,dise,np;
	char ch;
        System.out.println(" m/M for mill cloth:");
        System.out.println("\n h/H for handloom cloth");
        System.out.println("\n ENTER your choice :");
        ch =sc.next().charAt(0);
        if(ch=='m' || ch=='M')
        {       
            System.out.println("\n ENTER THE CLOTH PRICES:" );
	    clp=sc.nextDouble();
            if(clp>10000)
		dise=(clp*50)/100;	
	    else if(clp>5001 && clp>10000)
		dise=(clp*40)/100;	
	    else if(clp>1000 && clp>5000)
		dise=(clp*20)/100;
	    else
		dise=(clp*2)/100;
	 	np=clp-dise;
    		System.out.println("now the net amount :"+np);
        }
     	else if(ch=='h' || ch=='H')
        {       
            System.out.println("\n ENTER THE CLOTH PRICES:" );
	    clp=sc.nextDouble();
            if(clp>10000)
		dise=(clp*60)/100;	
	    else if(clp>5001 && clp>10000)
		dise=(clp*50)/100;	
	    else if(clp>1000 && clp>5000)
		dise=(clp*25)/100;
	    else
		dise=(clp*5)/100;
	 	np=clp-dise;
    		System.out.println("now the net amount :"+np);

    }
}
}


