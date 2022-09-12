package com.ab.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ab.Entities.MenuItem;
import com.ab.Repositories.MenuItemRepository;
import com.ab.utils.ItemCode;

@Service
public class CreateMenuItemServiceImpl implements CreateMenuItemService {

	@Autowired
	private MenuItemRepository repository;

	@Autowired
	private ItemCode itemCode;

	@Override
	public MenuItem CreateStarterMenuItem(MenuItem menuItem) {

		String generatedCode = itemCode.generateItemCode();

		String itemCode = "Starter:" + generatedCode;

		menuItem.setItemCode(itemCode);

		return repository.save(menuItem);
	}

	@Override
	public MenuItem CreateMainMenuItem(MenuItem menuItem) {
		
		String generatedCode = itemCode.generateItemCode();

		String itemCode = "Main:" + generatedCode;

		menuItem.setItemCode(itemCode);

		return repository.save(menuItem);
	}

	@Override
	public MenuItem CreateDrinkMenuItem(MenuItem menuItem) {
		
		String generatedCode = itemCode.generateItemCode();

		String itemCode = "Drink:" + generatedCode;

		menuItem.setItemCode(itemCode);

		return repository.save(menuItem);
	}

	@Override
	public MenuItem CreateDessertMenuItem(MenuItem menuItem) {
		
		String generatedCode = itemCode.generateItemCode();

		String itemCode = "Dessert:" + generatedCode;

		menuItem.setItemCode(itemCode);

		return repository.save(menuItem);
	}

}
