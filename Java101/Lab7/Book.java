import java.util.*;
public class Book
{
	private String ISBN;
	private String title;
	private String type;
	private Author[] authors;
	private double price;
	
	public Book(String ISBN, String title, String type, Author[] authors, double price)
	{
		this.ISBN = ISBN;
		this.title = title;
		this.type = type;
		this.authors = authors;
		this.price = price;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public String getISBN()
	{
		return ISBN;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public String getType()
	{
		return type;
	}
	
	public Author[] getAuthors()
	{
		return authors;
	}
	
	public void setISBN(String ISBN)
	{
		this.ISBN = ISBN;
	}
	
	public void setTitle(String title)
	{
		this.title = title;
	}
	
	public void setType(String type)
	{
		this.type = type;
	}
	
	public void setAuthors(Author[] authors)
	{
		this.authors = authors;
	}
}