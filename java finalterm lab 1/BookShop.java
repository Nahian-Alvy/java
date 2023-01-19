import java.lang.*;
public class BookShop
{
	private String name;
    private TextBook textBooks[]=new TextBook[100];
    private StoryBook storyBooks[]=new StoryBook[100];
	public BookShop()
	{
		System.out.println("Empty BookShop constructor");
	}
	public BookShop(String name)
	{
		System.out.println("perameterized BookShop Constructor");
		this.name=name;
		//textBooks= new TextBook[count];
		//storyBooks= new StoryBook[count];
	}
	
	public void setName(String name)
	{
		this.name=name;
	}
	public String getName()
	{
		return name;
	}
	public boolean insertTextBook(TextBook tb)
	{
		boolean flag=false;
		for(int i=0;i<textBooks.length;i++)
		{
			if(textBooks[i]==null)
			{
				textBooks[i]=tb;
				flag=true;
				break;
			}
			if(flag==true)
			{
				System.out.println("inserted");
			}
			else
			{
				System.out.println("inserted");
			}
		}
		return flag;
	}
	public boolean removeTextBook(TextBook tb)
	{
		boolean flag=false;
		for(int i=0;i<textBooks.length;i++)
		{
			if(textBooks[i]==tb)
			{
				textBooks[i]=null;
				flag=true;
				break;
			}
			if(flag==true)
			{
				System.out.println("Removed");
			}
			else
			{
				System.out.println("Removed");
			}
		}
		return flag;
	}
	public TextBook searchTextBook(String isbn)
	{
    int flag=0;
    for(int i=0;i<textBooks.length;i++)
	{
      if(textBooks[0].getIsbn()==isbn)
	  {
        flag=1;
        break;
      }
   }
   if(flag==1)
   {  
     System.out.println("***Text Book found!***");
   }

   else
   {
     System.out.println("TextBook Not found!");
   }
     return textBooks[0];
	}
	public void showAllTextBooks()
	{
		for(int i=0;i<textBooks.length;i++)
		{
			if(textBooks[i]!=null)
			{
				System.out.println("Store Name:"+name);
				textBooks[i].showDetails();
			}
			else{
				System.out.println("object " +textBooks[i]+ " Not available ");
			}
		}
	}
	public boolean insertStoryBook(StoryBook sb)
	{
		boolean flag=false;
		for(int i=0;i<storyBooks.length;i++)
		{
			if(storyBooks[i]==null)
			{
				storyBooks[i]=sb;
				flag=true;
				break;
			}
			if(flag==true)
			{
				System.out.println("inserted");
			}
			else
			{
				System.out.println("inserted");
			}
			
		}
		return flag;
	
	}
	public boolean removeStoryBook(StoryBook sb)
	{
		boolean flag=false;
		for(int i=0;i<storyBooks.length;i++)
		{
			if(storyBooks[i]==sb)
			{
				storyBooks[i]=null;
				flag=true;
				break;
			}
			if(flag==true)
			{
				System.out.println("Renoved");
			}
			else
			{
				System.out.println("Removed");
			}
		}
		return flag;
	}
	public StoryBook searchStoryBook(String isbn)
	{
    int flag=0;
    for(int i=0;i<storyBooks.length;i++)
	{
      if(storyBooks[0].getIsbn()==isbn)
	  {
        flag=1;
        break;
      }
   }
   if(flag==1)
   {  
     System.out.println("Story Book found!");
   }

   else
   {
     System.out.println("StoryBook Not found!");
   }
     return storyBooks[0];
	}
	public void showAllStoryBooks()
	{
		for(int i=0;i<storyBooks.length;i++)
		{
			if(storyBooks[i]!=null)
			{
				System.out.println("Store Name:"+name);
				storyBooks[i].showDetails();
			}
			else{
				System.out.println(" object " + storyBooks[i] + " Not available ");
			}
		}
	}
}
		
		
				
				