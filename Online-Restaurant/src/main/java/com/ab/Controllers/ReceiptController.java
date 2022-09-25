package com.ab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.Services.BasketServiceImpl;
import com.ab.Services.CheckOutServiceImpl;
import com.ab.Services.ReceiptServiceImpl;

@Controller
public class ReceiptController {

	@Autowired
	private ReceiptServiceImpl receiptServiceImpl;

	@Autowired
	private CheckOutServiceImpl checkOutServiceImpl;

	@Autowired
	private BasketServiceImpl basketServiceImpl;

	@RequestMapping("/create_receipt")
	public String createReceipt(Model model) {

		double totalCost = checkOutServiceImpl.getTotalPriceWithService();

		int orderQuantity = basketServiceImpl.totalCartSize();

		receiptServiceImpl.createReceipt(totalCost, orderQuantity);

		// will return success page for creation of receipt
		return "test";
	}

} // end of class
