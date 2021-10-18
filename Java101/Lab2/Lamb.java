public class Lamb{
	public static void main(String args[]){
		String t="Mary had a little lamb";
		System.out.println(t.indexOf("r")); //returns the index of the first occurence of 'r' ->2
		System.out.println(t.indexOf("had")); //->5
		System.out.println(t.substring(5,8)); //string that starts at 5 and ends at 7 -> "had"
		System.out.println(t.substring(18)); //lamb (from 18 to the end)
		System.out.println(t.toUpperCase()); //capslock
		System.out.println(t.toLowerCase()); //fara capslock
		System.out.println(t.substring(5,8).toUpperCase()); //"HAD"
		System.out.println(t.substring(4,9).trim()); //" had " -> "had"
		System.out.println(t.substring(0,t.length())); //starts at 0 and goes to end -> returns t
	}
}
