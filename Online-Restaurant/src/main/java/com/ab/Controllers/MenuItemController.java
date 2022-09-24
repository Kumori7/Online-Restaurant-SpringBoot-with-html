package com.ab.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ab.Entities.MenuItem;
import com.ab.Services.MenuItemServiceImpl;

@Controller
public class MenuItemController {

	@Autowired
	private MenuItemServiceImpl serviceImpl;

	// for testing purposes
	@RequestMapping("/test")
	public String test() {

		return "test";
	}

	@RequestMapping("/")
	public String startPage() {

		return "start_page";
	}

	@RequestMapping("/display")
	public String displayMenuItems(Model model) {

		List<MenuItem> list = serviceImpl.displayMenuItems();

		model.addAttribute("list", list);

		return "display_items";
	}

} // end of class
