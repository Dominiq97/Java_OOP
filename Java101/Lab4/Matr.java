import java.util.*;
public class Matr{
	public static void main(String args[]){
		int m[][]=new int[5][5];
		int sumONLine[]=new int[m.length];
		int sumONCol[]=new int[m.length];
		Random r=new Random();
		for(int i=0;i<m.length;i++)
			for(int j=0;j<m[i].length;j++)
			{
				m[i][j]=r.nextInt(100);
			}
				
		for(int i=0;i<m.length;i++)
		{
		    for(int j=0;j<m[i].length;j++)
				System.out.print(m[i][j]+" ");
			System.out.println();
		}	
			
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m[i].length;j++)
				sumONLine[i]=sumONLine[i]+m[i][j];
		}
		
		for(int i=0;i<m.length;i++)
		{
			for(int j=0;j<m.length;j++)
				sumONCol[j]=sumONCol[j]+m[i][j];
		}
		
		for(int i=0;i<sumONLine.length;i++)
			System.out.print(sumONLine[i]+" ");
		System.out.println();
		
		for(int i=0;i<sumONCol.length;i++)
			System.out.print(sumONCol[i]+" ");
	}
}