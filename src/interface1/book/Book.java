package interface1.book;

// Data Transfer Object, Value Object class
public class Book {
	// 필드
	private int id;
	private String title;
	private String author;

	// 생성자
	public Book() {
		super();
	}

	public Book(int id, String title, String author) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
	}

	// getter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	// 메서드
	public String bookInfo() {
		String bookInfo = "[" + id + "] " + title + " by " + author;
		return bookInfo;

	}

}
