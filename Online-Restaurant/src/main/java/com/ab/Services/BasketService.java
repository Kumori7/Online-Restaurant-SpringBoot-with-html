package com.ab.Services;

import java.util.List;

import com.ab.Entities.MenuItem;

public interface BasketService {

	public void addToBasket(MenuItem menuItem);

	public void removeItemFromBasket(MenuItem menuItem);

	public void clearBasket();

	public List<MenuItem> displayBasket();

	public double getTotalPrice();

	public void setTotalPrice(double totalPrice);

	public int totalCartSize();

}
