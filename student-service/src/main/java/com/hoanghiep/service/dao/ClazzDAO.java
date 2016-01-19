package com.hoanghiep.service.dao;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ClazzDAO {

	private DataSource dataSource;
	private JdbcTemplate templateObject;

	private String insertSQL;

	public void setDataSource(DataSource dataSource){
		this.dataSource = dataSource;
		this.templateObject = new JdbcTemplate(dataSource);
	}
	
	public void insert()
}
