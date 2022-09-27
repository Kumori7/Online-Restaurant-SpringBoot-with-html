package com.ab.Services;

import java.math.RoundingMode;
import java.text.DecimalFormat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CheckOutServiceImpl implements CheckOutService {

	@Autowired
	private BasketServiceImpl basketServiceImpl;

	private double serviceCharge = 0.05;

	private static final DecimalFormat df = new DecimalFormat("0.00");

	@Override
	public double getServiceChargePrice() {

		if (basketServiceImpl.totalCartSize() > 0) {

			return serviceCharge * basketServiceImpl.getTotalPrice();

		} else {

			return 0.0;

		}
	}

	@Override
	public double getTotalPriceWithService() {

		double orginalPrice = basketServiceImpl.getTotalPrice();

		System.out.println("orignalPrice before service charge: " + orginalPrice);

		double newTotalPriceWithServiceCharge = orginalPrice + (orginalPrice * serviceCharge);

		System.out.println("total price with service charge :" + newTotalPriceWithServiceCharge);

		df.setRoundingMode(RoundingMode.UP);

		String result = df.format(newTotalPriceWithServiceCharge);

		double output = Double.parseDouble(result);

		return output;
	}

} // end of class
