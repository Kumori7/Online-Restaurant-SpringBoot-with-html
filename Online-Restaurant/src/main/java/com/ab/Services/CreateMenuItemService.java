package com.ab.Services;

import com.ab.Entities.MenuItem;

public interface CreateMenuItemService {

	public MenuItem CreateStarterMenuItem(MenuItem menuItem);
	
	public MenuItem CreateMainMenuItem(MenuItem menuItem);
	
	public MenuItem CreateDrinkMenuItem(MenuItem menuItem);

	public MenuItem CreateDessertMenuItem(MenuItem menuItem);


}
