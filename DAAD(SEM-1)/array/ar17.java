import java.util.*;
public class ar17
{
	public static void main(String args[])
    	{
        	int i,j=0,k=0;
        	Scanner sc=new Scanner(System.in);
        	int z[]=new int[18];
        	int x[]={5,-3,-2,1,0,12,14,16,25,13};
        	int y[]={6,5,10,15,18,20,22,30};
              	for(i=0;i<16;i+=2)
        	{
            		z[i]=x[j];
			j++;
	         }
            	for(i=1;i<16;i+=2)
        	{
            		z[i]=y[k];
			k++;
	         }
		System.out.println("\n the resulting array:"); 
		z[17]=x[9];
      		 for(i=0;i<18;i++)
		{
               	System.out.println("\n"+z[i]);
        	}
   	 }
}
