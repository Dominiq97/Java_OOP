//ALWAYS DECLARE VARIABLES
//ALWAYS INITIALISE i INSIDE THE FOR, IF USING
//AVOID MAGIC NUMBERS
//INITIALISE MIN AND MAX TO THE FIRST ELEMENT
//Integer.MIN_VALUE; Integer.MAX_VALUE;
import java.util.*;
public class Oddeven{
	public static void main(String args[]){
		int v[] = new int[10];
		Random r=new Random();
		int sum=0;
		 int nr=0;
		 int maxodd=0;
		 int mineven=101;
		for(int i=0;i<v.length;i++)
		{
		v[i]=r.nextInt(100); 
		System.out.print(v[i]+" ");
	    if(v[i]%2==0)
		   {
			sum=sum+v[i];
			if(v[i]<mineven)
			  {
				mineven=v[i];
			  }
		   }
		  else 
		    {
			  nr++;
			  if(v[i]>maxodd)
				  maxodd=v[i];
			}
		}
		  System.out.println();
		  System.out.print
		  System.out.println(maxodd);
		  System.out.print(mineven);     
	}
}