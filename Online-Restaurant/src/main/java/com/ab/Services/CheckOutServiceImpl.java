package com.ab.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckOutServiceImpl implements CheckOutService {

	@Autowired
	private BasketServiceImpl basketServiceImpl;

	@Override
	public double getTotalPriceWithService() {

		double orginalPrice = basketServiceImpl.getTotalPrice();

		System.out.println("orignalPrice before service charge: " + orginalPrice);

		double serviceCharge = 0.05;

		double newTotalPriceWithServiceCharge = orginalPrice + (orginalPrice * serviceCharge);

		System.out.println("total price with service charge :" + newTotalPriceWithServiceCharge);

		return newTotalPriceWithServiceCharge;
	}

	@Override
	public int totalCartSize() {

		return basketServiceImpl.totalCartSize();
	}

}
