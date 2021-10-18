import java.util.*;
public class Exercise1{
	public static void main(String args[]){
		String[] letters={"a","bc","e","i"};
		int number=0;
		for(int i=0;i<letters.length;i++)
			if(letters[i].contains("a") || letters[i].contains("e") || letters[i].contains("i") || letters[i].contains("o") || letters[i].contains("u"))
				number++;
		System.out.println("The number of vowels is "+number);		
	}
}