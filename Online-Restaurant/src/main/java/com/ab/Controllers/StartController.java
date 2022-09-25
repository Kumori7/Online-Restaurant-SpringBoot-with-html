package com.ab.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StartController {

	// for testing purposes
	@RequestMapping("/test")
	public String test() {

		return "test";
	}

	@RequestMapping("/")
	public String startPage() {

		return "start_page";
	}

} // end of class
