package com.hoanghiep.service.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hoanghiep.service.dao.ClazzDAO;
import com.hoanghiep.service.model.Clazz;

@Controller
public class ClazzController {

	@Autowired
	private ClazzDAO clazzDAO;
	
	@RequestMapping(value="/class/addClass", method=RequestMethod.GET, produces=MediaType.APPLICATION_JSON_VALUE)
	public void addClazz(){
		System.out.println("chay vao day");
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendar= Calendar.getInstance();
		Clazz clazz = new Clazz();
		clazz.setId(1);
		clazz.setCode("KTLT");
		clazz.setClassName("Ky thuat lap tring");
		clazz.setCreateDate(dateFormat.format(calendar.getTime()));
		clazzDAO.add(clazz);
	}
}
