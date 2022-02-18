package edu.asu.diging.springaction.core.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

import edu.asu.diging.springaction.core.data.BookRepository;
import edu.asu.diging.springaction.core.model.Book;
import edu.asu.diging.springaction.core.model.impl.BookImpl;
import edu.asu.diging.springaction.core.service.BookManager;

@Service
public class BookManagerImpl implements BookManager {
	
	@Autowired
	private BookRepository bookRepo;

	/* (non-Javadoc)
	 * @see edu.asu.diging.springaction.core.service.impl.BookManager#all()
	 */
	@Override
	public List<Book> all() {
		return Streamable.of(bookRepo.findAll()).stream().collect(Collectors.toList());
	}
	
	@Override
	public Book store(String author, String title) {
		Book book = new BookImpl();
		book.setAuthor(author);
		book.setTitle(title);
		book.setAvailable(true);
		return bookRepo.save((BookImpl)book);
	}
}
