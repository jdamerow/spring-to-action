package edu.asu.diging.springaction.core.data;

import org.springframework.data.repository.PagingAndSortingRepository;

import edu.asu.diging.springaction.core.model.impl.BookImpl;

public interface BookRepository extends PagingAndSortingRepository<BookImpl, Long> {

}
