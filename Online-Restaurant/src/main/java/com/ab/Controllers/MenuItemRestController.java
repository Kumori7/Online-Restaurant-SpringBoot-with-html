package com.ab.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ab.Entities.MenuItem;
import com.ab.Services.CreateMenuItemService;
import com.ab.Services.MenuItemServiceImpl;

@RestController
public class MenuItemRestController {

	@Autowired
	private MenuItemServiceImpl serviceImpl;

	@Autowired
	private CreateMenuItemService createMenuItemService;

	@GetMapping("/display-menu-items")
	public List<MenuItem> displayMenuItems() {

		return this.serviceImpl.displayMenuItems();
	}

	@PostMapping("/save-starter-menu-item")
	public MenuItem createStaterMenuItem(@RequestBody MenuItem menuItem) {

		return this.createMenuItemService.CreateStarterMenuItem(menuItem);
	}

	@PostMapping("/save-main-menu-item")
	public MenuItem createMainMenuItem(@RequestBody MenuItem menuItem) {

		return this.createMenuItemService.CreateMainMenuItem(menuItem);
	}

	@PostMapping("/save-drink-menu-item")
	public MenuItem createDrinkMenuItem(@RequestBody MenuItem menuItem) {

		return this.createMenuItemService.CreateDrinkMenuItem(menuItem);
	}

	@PostMapping("/save-dessert-menu-item")
	public MenuItem createDessertMenuItem(@RequestBody MenuItem menuItem) {

		return this.createMenuItemService.CreateDessertMenuItem(menuItem);
	}

	@DeleteMapping("/delete/{id}")
	public void deleteMenuItemById(@PathVariable("id") int id) {

		this.serviceImpl.deleteMenuItemById(id);
	}

	@PutMapping("/update")
	public MenuItem updateMenuItem(@RequestBody MenuItem menuItem) {

		return serviceImpl.updateMenuItem(menuItem);
	}

} // end of class
