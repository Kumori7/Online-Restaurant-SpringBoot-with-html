package com.ab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.Services.BasketServiceImpl;
import com.ab.Services.CheckOutServiceImpl;

@Controller
public class CheckOutController {

	@Autowired
	private CheckOutServiceImpl serviceImpl;

	@Autowired
	private BasketServiceImpl basketServiceImpl;

	@RequestMapping("/checkout")
	public String checkoutPage(Model model) {

		double totalCost = basketServiceImpl.getTotalPrice();

		double totalCostWithServiceCharge = serviceImpl.getTotalPriceWithService();

		double serviceCharge = serviceImpl.getServiceChargePrice();

		int cartSize = basketServiceImpl.totalCartSize();

		model.addAttribute("orderQuantity", cartSize);

		model.addAttribute("totalCost", totalCost);

		model.addAttribute("serviceCharge", serviceCharge);

		model.addAttribute("totalCostWithServiceCharge", totalCostWithServiceCharge);

		return "checkout_page";
	}

} // end of class
