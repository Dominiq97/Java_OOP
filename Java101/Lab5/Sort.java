public class Sort{
	static void sort(int[] arr)
	{
		boolean changed = false;
		do{
			changed=false;
		for(int i=0;i<arr.length-1;i++)
			{
			if(arr[i]>arr[i+1])
				{
				int aux=arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=aux;
				changed=true;
				}
			}	
		}while(changed);
		
	}
	public static void main(String args[])
	{
		int[] x = {3,1,7,100,15,8,9};
		int[] y = {1,2,3,4,5,6,7,8,9};
		sort(x);
		display(x);
		int[] z = concat(x,y);
		System.out.println();
		display(z);
		int[] pr = primes(x);
		System.out.println();
		display(pr);
		
	}
	static void display(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
			System.out.print(arr[i]+" ");
	}
	static int[] concat(int[] a, int[] b)
	{
		int[] c = new int[a.length+b.length];
		for(int i=0;i<a.length;i++)
			c[i]=a[i];
		for(int i=0;i<b.length;i++)
			c[i+a.length]=b[i];
		return c;
			
	}
	static boolean checkPrime(int a)
	{
		int nrd=0;
		for(int i=2;i<=a/2;i++)
			if(a%i==0)
				nrd++;
		if(nrd==0)
			return true;
		else 
			return false;
	}
	static int[] primes(int arr[])
	{
		int k=0;
		int[] mult=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			if(checkPrime(arr[i]))
				mult[k++]=arr[i];
		}
		int[] pr=new int[k];
		for(int i=0;i<k;i++)
			pr[i]=mult[i];
		return pr;
	}
}