package com.hoanghiep.service.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.hoanghiep.service.dao.ClazzDAO;
import com.hoanghiep.service.model.Clazz;

@Controller(value="class")
public class ClazzController {

	@Autowired
	public ClazzDAO clazzDao;
	
	@RequestMapping(value="/addClass", method=RequestMethod.GET)
	public void addClazz(){
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		Calendar calendar= Calendar.getInstance();
		Clazz clazz = new Clazz();
		clazz.setCode("KTLT");
		clazz.setClassName("Ky thuat lap tring");
		clazz.setCreateDate(dateFormat.format(calendar.getTime()));
		clazzDao.add(clazz);
	}
}
