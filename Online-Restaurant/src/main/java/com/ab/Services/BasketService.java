package com.ab.Services;

import java.util.List;

import com.ab.Entities.MenuItem;

public interface BasketService {

	public void addToBasket(MenuItem menuItem);
	
	public void removeItemFromBasket(MenuItem menuItem);
	
	public List<MenuItem> displayBasket();
	
	public double getTotalPrice();
	
	public int totalCartSize();
	
}
