package com.ab.Services;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.Entities.Receipt;
import com.ab.Repositories.ReceiptRepository;
import com.ab.utils.ItemCode;

@Service
public class ReceiptServiceImpl implements ReceiptService {

	@Autowired
	private ReceiptRepository receiptRepository;

	@Autowired
	private ItemCode itemCode;

	// the format want to use to display receipt item creation date
	private static final String CreatonTimeOfReceipt = "dd/MM/yyyy: HH:mm";

	@Override
	public String creationTimeOfReceipt() {

		// gets to get current time of local machine
		Calendar cal = Calendar.getInstance();

		// uses the pattern we will provide
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(CreatonTimeOfReceipt);

		// format local time with pattern and convert to string
		return simpleDateFormat.format(cal.getTime());
	}

	@Override
	public void createReceipt(double totalCost, int orderQuantity) {

		String generatedCode = itemCode.generateItemCode();

		String creationTime = creationTimeOfReceipt();

		Receipt receipt = new Receipt();

		receipt.setReceiptCode(generatedCode);

		receipt.setDateCreated(creationTime);

		receipt.setTotalPriceWithServiceCharge(totalCost);

		receipt.setOrderQuantity(orderQuantity);

		// need to save to db now

		receiptRepository.save(receipt);

	}

	@Override
	public List<Receipt> displayReceipts() {

		List<Receipt> receipts = receiptRepository.findAll();

		List<Receipt> sortedByCreationDate = receipts.stream().sorted(Comparator.comparing(Receipt::getDateCreated))
				.collect(Collectors.toList());

		return sortedByCreationDate;
	}

	@Override
	public void deleteReceipt(int id) {

		receiptRepository.deleteById(id);

	}

	@Override
	public int getTotalReceiptAmount() {

		List<Receipt> receipts = receiptRepository.findAll();

		return receipts.size();
	}

} // end of class
