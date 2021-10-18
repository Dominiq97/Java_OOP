public class Sums
{
	int sum1(int[][] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
			sum=sum+arr[i][i];
		return sum;
	}
	
	int sum2(int[][] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
				sum=sum+arr[i][arr.length-1-i];
		return sum;			
	}
	
	int sum3(int[][] arr)
	{
		int sum=0;
		for(int i=1;i<arr.length;i++)
			for(int j=0;j<i;j++)
				sum=sum+arr[i][j];
		return sum;			
	}
	
	int sum4(int[][] arr)
	{
		int sum=0;
		for(int i=1;i<arr.length;i++)
			for(int j=0;j<i;j++)
					sum=sum+arr[j][i];
		return sum;		
	}
	
	int sum5(int[][] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		    for(int j=i;j<arr.length-i;j++)
				sum=sum+arr[i][j];
	}
}