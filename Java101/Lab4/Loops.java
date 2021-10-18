import java.util.*;
public class Loops{
	public static void main(String args[]){
		int m[][]=new int[4][4];
		int k=1;
		
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m[i].length;j++)
				m[i][j]=k++;
			
		for(int i=0;i<m.length;i++)
		{
		    for(int j=0;j<m[i].length;j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}	
		
		System.out.println();
		
		for(int i=0;i<m.length;i++)
		{
		    for(int j=0;j<m[i].length;j++)
				System.out.print(m[j][i]+" ");
			System.out.println();
		}	
		
		System.out.println();
		
		for(int i=0;i<m.length;i++)
		{
			if(i%2==0)
			{
		    for(int j=0;j<m[i].length;j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
			}
			else
			{
			for(int j=m[i].length-1;j>=0;j--)
				System.out.print(m[i][j]+" ");
			System.out.println();
			}
		}	
		
		System.out.println();
		
		for(int i=0;j<m.length;j++)
		{
			
		    for(int j=0;j<m[i].length;j++)
		
				System.out.print(m[i][j]+" ");
			System.out.println();
			}
			else
			{
			for(int j=m[i].length-1;j>=0;j--)
				System.out.print(m[i][j]+" ");
			System.out.println();
			}
		}
			
	}
}