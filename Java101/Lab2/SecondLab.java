import java.util.Scanner; //resurse
class SecondLab{
	public static  void main(String args[]){
		Scanner scan=new Scanner(System.in); //default input
		String s=scan.nextLine(); //stops when it receives 'ENTER' key or new line character
		System.out.println(s);
	}
}
//Declaring variables happens at compile time, allocating values happens at runtime
//You can only check the type at compile time
//nextLine returns STRING TYPES