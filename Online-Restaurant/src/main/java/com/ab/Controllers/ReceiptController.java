package com.ab.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.Entities.Receipt;
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

		if (totalCost <= 0 && orderQuantity <= 0) {
			// if total cost is zero need to
			// stop it saving to db
			// so a receipt with zero items is not created
			return "empty_basket_failed_order";
		} else {

			// make sure receipt is only created if basket.size() > 0
			receiptServiceImpl.createReceipt(totalCost, orderQuantity);

			return "Order_success";

		}

	}

	@RequestMapping("/view-order-history")
	public String viewOrderHistory(Model model) {

		List<Receipt> receipts = receiptServiceImpl.displayReceipts();

		model.addAttribute("receiptsList", receipts);

		return "view_order_history";
	}

} // end of class
