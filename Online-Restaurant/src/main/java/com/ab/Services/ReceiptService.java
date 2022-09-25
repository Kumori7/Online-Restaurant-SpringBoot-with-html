package com.ab.Services;

import java.util.List;

import com.ab.Entities.Receipt;

public interface ReceiptService {

	public String creationTimeOfReceipt();

	public void createReceipt(double totalCost, int orderQuantity);

	public List<Receipt> displayReceipts();

	public void deleteReceipt(int id);

	public int getTotalReceiptAmount();

} // end of interface
