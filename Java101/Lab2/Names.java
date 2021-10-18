import java.util.Scanner;
public class Names{
	public static void main(String args[]){
		System.out.println("What is your first and last name?");
		Scanner scan=new Scanner(System.in);
		String name=scan.nextLine();
		int posSpace=name.indexOf(" ");
		String first=name.substring(0,posSpace);
		String last=name.substring(posSpace+1); //if length-1 is not present it still goes to the end
		System.out.print("Hello "+first+" "+last.toUpperCase());
	}
}
//location of " " ->s.indexOf(" ")