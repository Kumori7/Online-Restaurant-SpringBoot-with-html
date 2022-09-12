package com.ab.Services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ab.Entities.MenuItem;

@Service
public class BasketServiceImpl implements BasketService {

	private double totalPrice = 0.0;

	private List<MenuItem> cartList = new ArrayList<>();

	@Override
	public void addToBasket(MenuItem menuItem) {

		cartList.add(menuItem);
		

		
		totalPrice = totalPrice + menuItem.getPrice();

	} // end of addToBasket

	@Override
	public void removeItemFromBasket(MenuItem menuItem) {

		if (cartList.size() == 0) {

			System.out.println("The basket is empty cannot remove item!");

		} else {
			System.out.println("item: " + menuItem.getName() + " will be removed from basket");

			totalPrice = totalPrice - menuItem.getPrice();

			//cartList.remove(menuItem);
			
			cartList.clear();
		}
		
		
		

		//if (cartList.contains(menuItem)) {

//			System.out.println("item: " + menuItem.getName() + "will be removed from basket");
//
//			totalPrice = totalPrice - menuItem.getPrice();
//
//			cartList.remove(menuItem);
		//}

	} // end of removeItemFromBasket

	@Override
	public List<MenuItem> displayBasket() {

		return cartList;
	}

	@Override
	public double getTotalPrice() {

		return totalPrice;
	}

	@Override
	public int totalCartSize() {

		return cartList.size();
	}

} // end of class
