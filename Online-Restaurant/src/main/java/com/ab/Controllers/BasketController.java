package com.ab.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.Entities.MenuItem;
import com.ab.Repositories.MenuItemRepository;
import com.ab.Services.BasketServiceImpl;

@Controller
public class BasketController {

	@Autowired
	private BasketServiceImpl serviceImpl;

	@Autowired
	private MenuItemRepository repository;

	// get request
	@RequestMapping("/view-basket")
	public String basketPage(Model model) {

		List<MenuItem> basketList = serviceImpl.displayBasket();

		double value = serviceImpl.getTotalPrice();

		int size = serviceImpl.totalCartSize();

		// method responsible for sending list, price and size data for displaying
		// information in basket html page
		model.addAttribute("list", basketList);
		model.addAttribute("price", value);
		model.addAttribute("size", size);

		// could have separate controller for price and size and
		// can't figure out how to have multiple endpoints point
		// to same html page and have content displayed
		return "basket";
	}

	// get request
	@RequestMapping("/view-price")
	public void b(Model model) {

		int size = serviceImpl.totalCartSize();

		model.addAttribute("food", size);

		// could have separate controller for price and size and
		/// just return redirect:/view-basket
		// this should work
	}

	// post request
	@RequestMapping("/add/{id}")
	public String add(@PathVariable("id") int id) {

		// finding menuItem object based on id
		MenuItem menuItem = repository.findById(id).orElse(null);

		serviceImpl.addToBasket(menuItem);

		// redirects "/display" endpoint found in MenuItem controller
		return "redirect:/display";
	}

	// basket remove feature works now
	// delete request
	@RequestMapping("/remove/{id}")
	public String removeItem(@PathVariable("id") int id) {

		// remove menuItem object based on id
		MenuItem menuItem = repository.findById(id).orElse(null);

		serviceImpl.removeItemFromBasket(menuItem);

		return "redirect:/view-basket";

	}

} // end of class
