import java.util.*;
public class Library
{
	private Book[] books=new Book[50];
	private int noBooks=0;
	
	public void addBook(Book b)
	{
		books[noBooks] = b;
		noBooks++;
 	}
	
	public void display()
	{
		for(int i=0;i<noBooks;i++)
			System.out.println(books[i].getTitle());
	}
	
	public double getTotalValue()
	{
		int s=0;
		for(int i=0;i<noBooks;i++)
			s+=books[i].getPrice();
		return s;
	}
	
	public void displayByType(String type)
	{
		for(int i=0;i<noBooks;i++)
			if(books[i].getType().equals(type))
				System.out.println(books[i].getTitle());
	}
	
	//public void displayByAuthor(String name)
	//{
		//for(int i=0;i<noBooks;i++)
		//{
			//Author[] authors = books[i].getAuthors();
			//for(int j=0;j<authors.length;j++)
			//{
				//if(name.equals(authors[j].getName())
				//{
				//	System.out.println(books[i].getTitle());
				//	break
				//}
			//}
		//}
		//}	
	}
