package com.dvn.study.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class PageController {
	
	@RequestMapping("/")
	public String getIndexPage() {
		System.out.println("check");
		return "index";
	}

}
