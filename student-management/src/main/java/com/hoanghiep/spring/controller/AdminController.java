package com.hoanghiep.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class AdminController {

	@RequestMapping("/login")
	public ModelAndView login (@RequestParam(required = false) boolean error){
		ModelAndView mav = new ModelAndView("login");
		if(error) mav.addObject("error", error);
		return mav;
	}
}
