import java.lang.*;

public class StartBook
{
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setIsbn("");
		b1.setBookTitle("");
		b1.setAuthorName("");
		b1.setPrice();
		b1.setAvailableQuantity();
		b1.addQuantity();
		b1.sellQuantity();

		Book b2 = new Book();
		b2.setIsbn("");
		b2.setBookTitle("");
		b2.setAuthorName("");
		b2.setPrice();
		b2.setAvailableQuantity();
		b2.addQuantity();
		b2.sellQuantity();

		Book b3 = new Book();
		b3.setIsbn("");
		b3.setBookTitle("");
		b3.setAuthorName("");
		b3.setPrice();
		b3.setAvailableQuantity();
		b3.addQuantity();
		b3.sellQuantity();

		Book b4 = new Book();
		b4.setIsbn("");
		b4.setBookTitle("");
		b4.setAuthorName("");
		b4.setPrice();
		b4.setAvailableQuantity();
		b4.addQuantity();
		b4.sellQuantity();

		Book b5 = new Book();
		b5.setIsbn("");
		b5.setBookTitle("");
		b5.setAuthorName("");
		b5.setPrice();
		b5.setAvailableQuantity();
		b5.addQuantity();
		b5.sellQuantity();


		Book books[] = new Book[] {b1,b2,b3,b4,b5};




		for (int i=0; i<books.length; i++) {

			System.out.println("\nBook "+i+" ISBN: "+books[i].getIsbn());
			System.out.println("\nBook "+i+" Title: "+books[i].getBookTitle());
			System.out.println("\nBook "+i+" Author name: "+books[i].getAuthorName());
			System.out.println("\nBook "+i+" Price: "+books[i].getPrice());
			System.out.println("\nBook "+i+" Available Quantity: "+books[i].getAvailableQuantity());

			System.out.println("\n************************************");


		
		}
	}
}



