package Constructor;

public class CopyConstructor {
	
	String title;
	String Author;
	
	public CopyConstructor(String t, String a) {
		title = t;
		Author = a;
	}
	
	// Copy Constructor
	
	public CopyConstructor(CopyConstructor book) {
		this.title = book.title;
		this.Author = book.Author;
	}
	
	 void show() {
	        System.out.println(title + " by " + Author);
	    }
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CopyConstructor book1 = new CopyConstructor("Java Programming", "Alice");
		CopyConstructor book2 = new CopyConstructor(book1); // Using Copy Constructor
		
		book1.show();
		book2.show();

	}

}
