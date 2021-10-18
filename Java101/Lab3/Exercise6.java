import java.util.*;
public class Exercise6{
	public static void main(String args[]){
		int v[] = new int[10];
		Random r=new Random();
		int sum=0;
		for(int i=0;i<v.length;i++)
		{v[i]=r.nextInt(100);
		System.out.print(v[i]+" ");}
		System.out.println(" ");
		for(int i=0;i<v.length;i++)
			for(int j=i+1;j<v.length;j++)
			{
				if(v[i]>v[j])
				  {int aux=v[i]; v[i]=v[j]; v[j]=aux;}
			    
			}
			for(int i=0;i<v.length;i++)
			System.out.print(v[i]+" ");
}
}