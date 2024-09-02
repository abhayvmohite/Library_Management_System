class Library
{
	private static final String Author = null;
	String[]books;
	int numberOfBooks;
	Library()
	{
		this.books=new String[100];
		this.numberOfBooks=0;
		
	}
	void addBook(String book,String Author)
	{
		this.books[numberOfBooks]=book;
		numberOfBooks++;
		
		System.out.println(book+" Has Been Succesfully Added !!");
		System.out.println("Author :: "+Author);
		System.out.println("--------------------------------");
	}
	void showAvailableBooks()
	{
		
		System.out.println("The Available Books Are :: ");
		for(String book : this.books)
		{
			if(book==null)
			{
				continue;
			}
			System.out.println("--> "+book);

		}
		System.out.println("--------------------------------");

	}
	void issueBook(String book)
	{
		for(int i=0;i<this.books.length;i++)
		{
			if(this.books[i].equals(book))
			{
				System.out.println("Book "+book+" Has Been Issued");
				this.books[i]=null;
				return;
			}
		}System.out.println("This Book Does Not Exist in Our Library");
		
	}
	void returnBook(String book,String Author)
	{
		addBook(book,Author);
}
}
	
public class LibraryManagement 
{

	public static void main(String[] args)
	{
		Library target=new Library();
		target.addBook("Let US C","Yashwant Kanitkar");
		target.addBook("Java","Herbert Schildt");
		target.addBook("The Python","Rob Mastrodomenico");
		target.issueBook("Java");
		target.showAvailableBooks();
		target.returnBook("Java","Herbert Schildt");
		target.returnBook("My Experiments With Truth","Mahatma Gandhi");
		target.showAvailableBooks();

		
	}
}

