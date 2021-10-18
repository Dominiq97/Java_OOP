import java.util.*;
public class Exercise7{
	public static void main(String args[]){
		int m[][]=new int[5][6];
		Random r=new Random();
		int sum=0;
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m[i].length;j++)
			{m[i][j]=r.nextInt(100); sum=sum+m[i][j];}
		
		for(int i=0;i<m.length;i++)
		{{for(int j=0;j<m[i].length;j++)
		System.out.print(m[i][j]+" ");}
	System.out.println();
		}
	System.out.print(sum);		   	
	}
}