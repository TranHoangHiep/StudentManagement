package com.hoanghiep.service.dao;

import java.util.List;

import com.hoanghiep.service.model.Clazz;

public interface ClazzDAO {

	public void add(Clazz clazz);
	
	public List<Clazz> list();
}
