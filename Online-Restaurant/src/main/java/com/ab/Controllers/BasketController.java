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

	@RequestMapping("/view-basket")
	public String basketPage(Model model) {

		List<MenuItem> basketList = serviceImpl.displayBasket();

		model.addAttribute("list", basketList);

		return "basket";
	}

	@RequestMapping("/add/{id}")
	public String add(@PathVariable("id") int id) {

		// finding menuItem object based on id
		MenuItem menuItem = repository.findById(id).orElse(null);

		serviceImpl.addToBasket(menuItem);

		return "redirect:/display";
	}
	
	// need to fix 
	@RequestMapping("/total/price")
	public String  totalPrice(Model model) {
		
	// will delete 	
	double s =	 serviceImpl.getTotalPrice();
	
	String result = String.valueOf(s);
	// will delete
	model.addAttribute("result",result);
		
		return "basket";

	}

} // end of class
