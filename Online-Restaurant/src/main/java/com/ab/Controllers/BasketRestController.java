package com.ab.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ab.Entities.MenuItem;
import com.ab.Repositories.MenuItemRepository;
import com.ab.Services.BasketServiceImpl;

@RestController
public class BasketRestController {

	@Autowired
	private MenuItemRepository repository;

	@Autowired
	private BasketServiceImpl serviceImpl;

	// works
	@PostMapping("/add/rest/{id}")
	public void addToBasket(@PathVariable("id") int id) {

		// finding menuItem object based on id
		MenuItem menuItem = repository.findById(id).orElse(null);

		// System.out.println("add to basket: " + menuItem.getId() + " " +
		// menuItem.getName());

		// once we got the object want to pass into add to basket method
		serviceImpl.addToBasket(menuItem);
	}

	// work
	@DeleteMapping("/remove/rest/{id}")
	public void removeItemFromBasket(@PathVariable("id") int id) {

		MenuItem menuItem = repository.findById(id).orElse(null);

		serviceImpl.removeItemFromBasket(menuItem);

	}

	// works
	@GetMapping("/view-basket/rest")
	public List<MenuItem> displayBasket() {

		return serviceImpl.displayBasket();
	}

	// works
	@GetMapping("/total-price/rest")
	public double getTotalPrice() {

		return serviceImpl.getTotalPrice();
	}

	// works
	@GetMapping("/basket-size/rest")
	public int getBasketSize() {

		return serviceImpl.totalCartSize();
	}

} // end of class
