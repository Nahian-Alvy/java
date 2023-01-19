import java.lang.*;
public class Start
{
	public static void main(String[] args)
	{
		System.out.println("-----ID:22-46036-1-----");
		System.out.println("-------StoryBook-------");
		StoryBook s1 = new StoryBook();
		s1.setIsbn("qhkj-886hn-jse");
		s1.setBookTitle("devDas");
		s1.setAuthorName("Sarat Chandra");
		s1.setPrice(350);
		s1.setAvaileableQuantity(500);
		s1.setCategory("Roamnce");
		s1.setDeiscountRate(15);
		s1.addQuantity(40);
		s1.sellQuantity(30);
		System.out.println("ISBN:"+s1.getIsbn());
		System.out.println("BOOKTITLE:"+s1.getBookTitle());
		System.out.println("AUTHORNAME:"+s1.getAuthorName());
		System.out.println("PRICE:"+s1.getPrice());
		System.out.println("AVAILABLEQUANTITY:"+s1.getAvailableQuantity());
		System.out.println("DISCOUNT:"+s1.getDiscountRate());
		StoryBook s2=new StoryBook("oukhiu-15323-13kh","Gitanjoli","rabindranath",305.50,500,"Romance");
		s2.showDetails();
		System.out.println("-------TextBook-------");
		TextBook t1=new TextBook();
		t1.setIsbn("qhkj-886hn-jse");
		t1.setBookTitle("Physics");
		t1.setAuthorName("Halliday");
		t1. setPrice(400);
		t1.setAvailableQuantity(500);
		t1.addQuantity(50);
		t1.sellQuantity(30);
		t1. setStandard(8);
		t1.setDiscountRate(15);
		System.out.println("ISBN:"+t1.getIsbn());
		System.out.println("BOOKTITLE:"+t1.getBookTitle());
		System.out.println("AUTHORNAME:"+t1.getAuthorName());
		System.out.println("PRICE:"+t1.getPrice());
		System.out.println("AVAILABLEQUANTITY:"+t1.getAvailableQuantity());
		System.out.println("STANDARD:"+t1.getStandard());
		System.out.println("DISCOUNT:"+t1.getDiscountRate());
		TextBook t2=new TextBook("oukhiu-15323-13kh","Calculus","james steward",305.50,500,7);
		t2.showDetails();
		
	}
}