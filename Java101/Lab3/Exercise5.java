import java.util.*;
public class Exercise5{
	public static void main(String args[]){
		int v[] = new int[10];
		Random r=new Random();
		int sum=0;
		for(int i=0;i<10;i++)
			v[i]=r.nextInt(100);
		for(int i=0;i<10;i++)
			if(v[i]%3==0)
				sum=sum+v[i];
		System.out.println("The sum is "+sum);	
	}
}