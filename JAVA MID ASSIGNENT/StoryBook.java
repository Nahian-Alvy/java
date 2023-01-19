import java.lang.*;

public class StoryBook extends Book {

	private String category;

	public StoryBook() {
		System.out.println("StoryBook empty Constructor  Called");

	}

	public StoryBook(String isbn, String bookTitle, String authorName, double price, int availableQuantity,
			String category) {

		super(isbn, bookTitle, authorName, price, availableQuantity);
		System.out.println("StoryBook parametarized Constructor  Called");
		this.category = category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCategory() {
		return category;
	}

	public void showDetails() {
		super.showDetails();
		System.out.println("Category:" + category);
	}
}