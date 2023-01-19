import java.lang.*;

public class StartBook
{
	public static void main(String[] args) {
		
		Book b1 = new Book();
		b1.setIsbn("jhkjh-hkjhj1");
		b1.setBookTitle("Gitanjoli");
		b1.setAuthorName("Thakur");
		b1.setPrice(500);
		b1.setAvailableQuantity(100);
		b1.addQuantity(50);
		b1.sellQuantity(40);

		Book b2 = new Book();
		b2.setIsbn("ghkjg-jgjyh8-j");
		b2.setBookTitle("pother pacghali");
		b2.setAuthorName("bangkim");
		b2.setPrice(500);
		b2.setAvailableQuantity(100);
		b2.addQuantity(100);
		b2.sellQuantity(90);

		Book b3 = new Book();
		b3.setIsbn("hkjl-lkj-1");
		b3.setBookTitle("himu");
		b3.setAuthorName("humayun");
		b3.setPrice(300);
		b3.setAvailableQuantity(100);
		b3.addQuantity(20);
		b3.sellQuantity(10);

		Book b4 = new Book();
		b4.setIsbn("jhukh-ikuhi");
		b4.setBookTitle("chol chol");
		b4.setAuthorName("kazi");
		b4.setPrice(300);
		b4.setAvailableQuantity(50);
		b4.addQuantity(20);
		b4.sellQuantity(10);

		Book b5 = new Book();
		b5.setIsbn("kjghk-lkjhiu");
		b5.setBookTitle("biral");
		b5.setAuthorName("bangkim");
		b5.setPrice(500);
		b5.setAvailableQuantity(30);
		b5.addQuantity(20);
		b5.sellQuantity(10);


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