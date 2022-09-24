package com.ab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.Services.BasketServiceImpl;
import com.ab.Services.CheckOutServiceImpl;
import com.ab.utils.CheckOut;

@Controller
public class CheckOutController {

	@Autowired
	private CheckOutServiceImpl serviceImpl;

	@RequestMapping("/checkout")
	public String checkoutPage(Model model) {

		double totalPrice = serviceImpl.getTotalPriceWithService();

		int cartSize = serviceImpl.totalCartSize();

		// todo for code 
		// will put in add to list method ill create
		// s0 i can easily add to list and remove if user not happy with checkout items
		// this will clear basket list as well 
		
		// create controller methods for checkout service layer
		CheckOut checkOutItem = new CheckOut(totalPrice, cartSize);  

		// may display list of checkOut objects to easily remove it with inbuilt methods
		// instead of passing checkOut object it self into html for displaying data

		// will display checkout object here

		return "checkout_page";
	}

} // end of class
