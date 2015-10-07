package com.hoanghiep.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import com.hoanghiep.spring.model.Class;

@Controller
public class ClassController extends CommonController {

	@RequestMapping(value = "/class/index", method = RequestMethod.GET)
	public ModelAndView index() {
		ModelAndView mav = new ModelAndView("/class/index", "command", new Class());
		return mav;
	}
}
