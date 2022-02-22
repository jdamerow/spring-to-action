package edu.asu.diging.springaction.core.service;

import java.util.List;

import edu.asu.diging.simpleusers.core.model.IUser;
import edu.asu.diging.springaction.core.model.Book;

public interface BookManager {

	List<Book> all();

	Book store(String author, String title);

	void borrow(IUser user, Book book);

	Book get(Long id);

	List<Book> findByUser(IUser user);

	void returnBook(Book book);

}