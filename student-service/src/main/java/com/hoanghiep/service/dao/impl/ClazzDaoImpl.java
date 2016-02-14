package com.hoanghiep.service.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.hoanghiep.service.dao.ClazzDAO;
import com.hoanghiep.service.mapper.ClazzMapper;
import com.hoanghiep.service.model.Clazz;

public class ClazzDaoImpl implements ClazzDAO{
	
	public static final String SQL_GET_LIST = "SELECT * FROM class";

	private DataSource dataSource;
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void add(Clazz clazz) {
		// TODO Auto-generated method stub
	}

	@Override
	public List<Clazz> list() {
		// TODO Auto-generated method stub
		List<Clazz> students = jdbcTemplate.query(SQL_GET_LIST, new ClazzMapper());
		return students;
	}

}
