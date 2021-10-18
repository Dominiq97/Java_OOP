public class Exercise3{
	public static void main(String args[]){
		int num=99;
		int sum=0;
		for(num=99;num>=3;num--)
			if(num%3==0)
				sum=sum+num;
		System.out.println("The sum of numbers divisible by 3 is "+sum);	
	}
}