public class main
{
	public static void main(String args[])
	{
		Author a1 = new Author("Ion","Creanga");
		Author a2 = new Author("Mihai","Eminescu");
		Author a3 = new Author("Will","Shakespeare");
		Book b1 = new Book("aa","Memories","epic",new Author[]{a1},10.0);
		Book b2 = new Book("bb","Learning for BAC","school",new Author[]{a1,a2},20.0);
		Book b3 = new Book("cc","Hamlet","epic",new Author[]{a3},30.0);
		Library l = new Library();
		l.addBook(b1);
		l.addBook(b2);
		l.addBook(b3);
		l.display();
		System.out.println(l.getTotalValue());
		l.displayByType("epic");
		
	}
}