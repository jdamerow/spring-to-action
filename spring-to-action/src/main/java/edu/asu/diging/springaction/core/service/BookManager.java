package edu.asu.diging.springaction.core.service;

import java.util.List;

import edu.asu.diging.springaction.core.model.Book;

public interface BookManager {

	List<Book> all();

	Book store(String author, String title);

}