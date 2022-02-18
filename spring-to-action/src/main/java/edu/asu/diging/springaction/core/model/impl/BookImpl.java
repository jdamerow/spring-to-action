package edu.asu.diging.springaction.core.model.impl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import edu.asu.diging.springaction.core.model.Book;

@Entity
public class BookImpl implements Book {

	@Id
	@GeneratedValue
	private Long id;
	
	private String title;
	private String author;
	
	private boolean available;
	
	/* (non-Javadoc)
	 * @see edu.asu.diging.springaction.core.model.impl.Book#getId()
	 */
	@Override
	public Long getId() {
		return id;
	}
	/* (non-Javadoc)
	 * @see edu.asu.diging.springaction.core.model.impl.Book#setId(java.lang.Long)
	 */
	@Override
	public void setId(Long id) {
		this.id = id;
	}
	/* (non-Javadoc)
	 * @see edu.asu.diging.springaction.core.model.impl.Book#getTitle()
	 */
	@Override
	public String getTitle() {
		return title;
	}
	/* (non-Javadoc)
	 * @see edu.asu.diging.springaction.core.model.impl.Book#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		this.title = title;
	}
	/* (non-Javadoc)
	 * @see edu.asu.diging.springaction.core.model.impl.Book#getAuthor()
	 */
	@Override
	public String getAuthor() {
		return author;
	}
	/* (non-Javadoc)
	 * @see edu.asu.diging.springaction.core.model.impl.Book#setAuthor(java.lang.String)
	 */
	@Override
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public boolean isAvailable() {
		return available;
	}
	@Override
	public void setAvailable(boolean available) {
		this.available = available;
	}
}
