package com.ab.Services;

import java.util.List;

import com.ab.Entities.MenuItem;

public interface MenuItemService {

	public List<MenuItem> displayMenuItems();

	public MenuItem updateMenuItem(MenuItem menuItem);

	public void deleteMenuItemById(int id);

} // end of interface
