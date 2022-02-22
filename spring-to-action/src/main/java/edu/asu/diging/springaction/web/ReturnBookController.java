package edu.asu.diging.springaction.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import edu.asu.diging.springaction.core.model.Book;
import edu.asu.diging.springaction.core.service.BookManager;

@Controller
public class ReturnBookController {

	@Autowired
	private BookManager bookManager;
	
	@RequestMapping(value="/auth/book/{bookId}/return", method=RequestMethod.POST)
	public String borrow(@PathVariable("bookId") String bookId, Principal principal, RedirectAttributes redirectAttrs) {
		Book book = bookManager.get(new Long(bookId));
		if (book != null) {
			if (book.isAvailable()) {
				redirectAttrs.addFlashAttribute("msg", "Book cannot be returned as it is not borrowed.");
			} else  {
				bookManager.returnBook(book);
				redirectAttrs.addFlashAttribute("msg", "You succesfully returned the book \"" + book.getTitle() + "\".");
			}
		}
		return "redirect:/auth/books";
	}
}
