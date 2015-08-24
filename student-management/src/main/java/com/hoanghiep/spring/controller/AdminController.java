package com.hoanghiep.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@RequestMapping(value="/login")
	public ModelAndView login (@RequestParam(required = false) boolean error){
		ModelAndView mav = new ModelAndView("login");
		if(error) mav.addObject("error", error);
		return mav;
	}
	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView index(){
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("message", "Administration");
		return mv;
	}
}
