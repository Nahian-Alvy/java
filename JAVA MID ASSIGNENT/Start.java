import java.lang.*;

public class Start {
	public static void main(String[] args) {

		System.out.println("-------StoryBook-------");

		StoryBook b1 = new StoryBook();
		b1.setIsbn("khjkj-kjhkj9078-hyg");
		b1.setBookTitle("Big bang");
		b1.setAuthorName("hawking");
		b1.setPrice(1500);
		b1.setAvailableQuantity(210);
		b1.setCategory("science");
		b1.addQuantity(100);
		b1.sellQuantity(99);
		System.out.println("\nISBN : " + b1.getIsbn());
		System.out.println("\nBook Title: " + b1.getBookTitle());
		System.out.println("\nAuthor Name: " + b1.getAuthorName());
		System.out.println("\nPrice of the book is : " + b1.getPrice());
		System.out.println("\nAvailable Quantity: " + b1.getAvailableQuantity());
		System.out.println("\nCategory:" + b1.getCategory());

		StoryBook b2 = new StoryBook("hioh-lji0", "pother pachali", "bongkim", 500, 300, "thriller");
		b2.showDetails();
		System.out.println("-------TextBook-------");

		TextBook b3 = new TextBook();
		b3.setIsbn("gjhlhjl-kjhiou-98");
		b3.setBookTitle("himu");
		b3.setAuthorName("humayun");
		b3.setPrice(300);
		b3.setAvailableQuantity(200);
		b3.setStandard(11);
		b3.addQuantity(50);
		b3.sellQuantity(40);
		System.out.println("\nISBN : " + b3.getIsbn());
		System.out.println("\nBook Title: " + b3.getBookTitle());
		System.out.println("\nAuthor Name: " + b3.getAuthorName());
		System.out.println("\nPrice of the book is : " + b3.getPrice());
		System.out.println("\nAvailable Quantity: " + b3.getAvailableQuantity());
		System.out.println("\nStandard:" + b3.getStandard());
		TextBook b4 = new TextBook("hgj-hgbhkj8-99", "Gitanjali", "thakur", 500, 100, 10);
		b4.showDetails();

	}
}
