package com.ab.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ab.Services.ReceiptServiceImpl;

@RestController
public class ReceiptRestController {

	@Autowired
	private ReceiptServiceImpl receiptServiceImpl;

	@DeleteMapping("/receipt/delete/{id}")
	public void deleteReceiptById(@PathVariable("id") int id) {

		receiptServiceImpl.deleteReceipt(id);

	}

} // end of class
