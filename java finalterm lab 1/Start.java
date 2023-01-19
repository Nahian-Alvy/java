import java.lang.*;
public class Start
{
	public static void main(String[]args)
	{
		

		StoryBook s1 = new StoryBook("hioh-lji0", "pother pachali", "bongkim", 500, 300, "thriller");
		StoryBook s2 = new StoryBook("jkk-iu-8","BigBang Theory","Stephen",1000,200,"Science");
		StoryBook s3 = new StoryBook("hjgkk-kjhki-8", "Nineteen Eighty-four", "George", 500, 300, "thriller");
		StoryBook s4 = new StoryBook("hkjgkuyiou-908", "Beloved", "toni morrision", 500, 300, "thriller");
		StoryBook s5 = new StoryBook("878ghji-iuyiu", "pride and prejudice", "jane Austin", 500, 300, "thriller");

		TextBook t1 = new TextBook("hgj-hgbhkj8-99", "bangla", "NCTB", 50, 100, 10);
		TextBook t2 = new TextBook("ytjyt980-iuyiu", "bangla 2nd", "NCTB", 80, 100, 10);
		TextBook t3 = new TextBook("hjgju-uuyt", "english", "NCTB", 70, 100, 10);
		TextBook t4 = new TextBook("uyiuyhk-hjiou", "english 2nd", "NCTB", 90, 100, 10);
		TextBook t5 = new TextBook("hgiuy8io-uiu-9", "math", "NCTB", 60, 100, 10);
		BookShop bs=new BookShop("Ma-Babar Dowa Store");
        System.out.println("-------TextBook-------");
		bs.insertTextBook(t1);
		bs.insertTextBook(t2);
		bs.insertTextBook(t3);
		bs.insertTextBook(t4);
		bs.insertTextBook(t5);
		bs.removeTextBook(t2);
		bs.searchTextBook("hgj-hgbhkj8-99");
		bs.showAllTextBooks();
		System.out.println("-------StoryBook-------");
		bs.insertStoryBook(s1);
		bs.insertStoryBook(s2);
		bs.insertStoryBook(s3);
		bs.insertStoryBook(s4);
		bs.insertStoryBook(s5);
		bs.removeStoryBook(s2);
		bs.searchStoryBook("hjgkk-kjhki-8");
		bs.showAllStoryBooks();
	}
}
		
		