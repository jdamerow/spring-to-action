package edu.asu.diging.springaction.web;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import edu.asu.diging.simpleusers.core.service.IUserManager;
import edu.asu.diging.springaction.core.service.BookManager;

@Controller
public class ListUserBooksController {

	@Autowired
	private BookManager bookManager;
	
	@Autowired
	private IUserManager userManager;
	
	@RequestMapping("/auth/books")
	public String showBooks(Model model, Principal principal) {
		
		model.addAttribute("books", bookManager.findByUser(userManager.findByUsername(principal.getName())));
		return "books/list";
	}
}
