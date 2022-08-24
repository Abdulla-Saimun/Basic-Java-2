package hash.set.example;

import java.util.HashSet;

public class BookExampleWithHashSet {
	
	private int id;
	private String name;
	private String author;
	
	

	public BookExampleWithHashSet(int id, String name, String author) {
		
		this.id = id;
		this.name = name;
		this.author = author;
	}
	
	



	public String getName() {
		return name;
	}





	public void setName(String name) {
		this.name = name;
	}





	public String getAuthor() {
		return author;
	}





	public void setAuthor(String author) {
		this.author = author;
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BookExampleWithHashSet b1 = new BookExampleWithHashSet(100, "mocking jay", "suzan");
		BookExampleWithHashSet b2 = new BookExampleWithHashSet(101, "new One", "salam");
		BookExampleWithHashSet b3 = new BookExampleWithHashSet(102, "huaa", "euuuuu");
		
		HashSet<BookExampleWithHashSet> hashlist = new HashSet<>();
		hashlist.add(b1);
		hashlist.add(b2);
		hashlist.add(b3);
		
		for(BookExampleWithHashSet one: hashlist) {
			System.out.println(one.getName());
		}

	}

}
