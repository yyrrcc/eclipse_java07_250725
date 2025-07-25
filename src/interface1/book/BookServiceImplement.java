package interface1.book;

import java.util.ArrayList;
import java.util.List;

public class BookServiceImplement implements BookService {
	private List<Book> books = new ArrayList<Book>();

	@Override
	public void addBook(Book book) {
		books.add(book);
	}

	@Override
	public Book findBookByTitle(String title) {
		for (Book book : books) {
			if (book.getTitle().equals(title)) {
				return book;
			}
		}
		return null;
	}

	@Override
	public List<Book> getAllBooks() {
		return books;
	}

}
