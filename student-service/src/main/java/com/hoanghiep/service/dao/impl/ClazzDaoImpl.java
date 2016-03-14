package com.hoanghiep.service.dao.impl;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.hoanghiep.service.dao.ClazzDAO;
import com.hoanghiep.service.mapper.ClazzMapper;
import com.hoanghiep.service.model.Clazz;

@Component
public class ClazzDaoImpl implements ClazzDAO{

	public static final String SQL_GET_LIST = "SELECT * FROM class";

	private static final String SQL_INSERT = "INSERT INTO class(id, code, className, createDate) values(?, ?, ?, ?)";

	private DataSource dataSource;
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		this.jdbcTemplate = new JdbcTemplate(dataSource);
	}

	@Override
	public void add(Clazz clazz) {
		System.out.println("code: " + clazz.getCode() + ", className: " + clazz.getClassName() + ", date"
				+ ": " + clazz.getCreateDate());
		jdbcTemplate.update(SQL_INSERT, new Object[]{clazz.getId(), clazz.getCode(), clazz.getClassName(), clazz.getCreateDate()});
	}

	@Override
	public List<Clazz> list() {
		List<Clazz> students = jdbcTemplate.query(SQL_GET_LIST, new ClazzMapper());
		return students;
	}

}
