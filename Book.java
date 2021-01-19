public class Book {
	public String title;
	public int index;
	
	public Book(String title) {
		this.title = title;
	}
	
	public Book(int index, String title) {
		this.index = index;
		this.title = title;
	}
	
	public Book() {
		
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return title;
	}
}