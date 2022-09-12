package com.ab.Services;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ab.Entities.MenuItem;
import com.ab.Repositories.MenuItemRepository;

@Service
public class MenuItemServiceImpl implements MenuItemService {

	@Autowired
	private MenuItemRepository repository;

	@Override
	public List<MenuItem> displayMenuItems() {

		List<MenuItem> menuItems = repository.findAll();

		List<MenuItem> sortedByCategory = menuItems.stream().sorted(Comparator.comparing(MenuItem::getCategory))
				.collect(Collectors.toList());

		return sortedByCategory;
	}

	@Override
	public MenuItem updateMenuItem(MenuItem menuItem) {

		return repository.save(menuItem);
	}

	@Override
	public void deleteMenuItemById(int id) {

		repository.deleteById(id);
	}

}
