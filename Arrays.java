class Book{
	String title;
	//constructor
	
	public Book(String title) {
		this.title= title;
	}
	//metthod
	public void displayInfo() {
		System.out.println( title);
	}
}
public class Arrays {

	public static void main(String[] args) {
		//create an array 
		Book Book1 = new Book ("");
		
		Book[] books = new Book[] {
				new Book("Harry Potter"),
				new Book("The Hobbit"),
				new Book("1984"),
				new Book("Pride and Prejudice"),
				new Book("The Catcher in the Rye"),
		};
// use loop to display the book's title's
		
		System.out.println("Booke in the library:");
		for(Book book : books) {
			book.displayInfo();
		}
		
	}

}
