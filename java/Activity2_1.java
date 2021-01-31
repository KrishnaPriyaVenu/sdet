abstract class Book{	
		String title;
		abstract void setTitle(String s);
		String getTitle() {
			return title;
		}
	}
	
	class MyBook extends Book{
		public void setTitle(String s) {
			title=s;
		}
	}
public class Activity2_1 {
		
	public static void main(String args[]) {
		Book newBook = new MyBook();
		newBook.setTitle("Alice in WonderLand");
		
		System.out.println("New Book Title is: "+newBook.title);
	}
	
}
