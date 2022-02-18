package edu.asu.diging.springaction.core.model;

public interface Book {

	Long getId();

	void setId(Long id);

	String getTitle();

	void setTitle(String title);

	String getAuthor();

	void setAuthor(String author);

	void setAvailable(boolean available);

	boolean isAvailable();

}