package com.ab.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ab.Entities.MenuItem;

@Service
public class BasketServiceImpl implements BasketService, BasketServiceTwo {

	private double totalPrice = 0.0;

	private List<MenuItem> cartList = new ArrayList<>();

	@Override
	public void addToBasket(MenuItem menuItem) {

//		if (cartList.contains(menuItem.getId())) {
//			System.out.println("the item : " + menuItem + " already in basket");
//
//		} else {
//			cartList.add(menuItem);
//
//			totalPrice = totalPrice + menuItem.getPrice();
//		}

		cartList.add(menuItem);

		totalPrice = totalPrice + menuItem.getPrice();

	} // end of addToBasket

	@Override
	public void removeItemFromBasket(MenuItem menuItem) {

		if (cartList.size() == 0) {

			System.out.println("The basket is empty cannot remove item!");

		} else {
			System.out.println("item: " + menuItem.getName() + " will be removed from  basket");

			totalPrice = totalPrice - menuItem.getPrice();

			for (int i = 0; i < cartList.size(); i++) {
				if (cartList.get(i).getId() == menuItem.getId()) {
					cartList.remove(i);
				}
			} // loop

		} // else

		if (cartList.isEmpty()) {
			totalPrice = 0.0;
		}

	} // end of removeItemFromBasket

	@Override
	public void clearBasket() {

		cartList.clear();

	}

	@Override
	public List<MenuItem> displayBasket() {

		return cartList;
	}

	@Override
	public double getTotalPrice() {

		return totalPrice;
	}

	@Override
	public void setTotalPrice(double totalPrice) {

		this.totalPrice = totalPrice;
	}

	@Override
	public int totalCartSize() {

		return cartList.size();
	}

} // end of class
