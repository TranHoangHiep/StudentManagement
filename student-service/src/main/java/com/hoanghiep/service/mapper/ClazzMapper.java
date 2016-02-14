package com.hoanghiep.service.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.hoanghiep.service.model.Clazz;

public class ClazzMapper implements RowMapper<Clazz>{

	@Override
	public Clazz mapRow(ResultSet rs, int rowNum) throws SQLException {
		Clazz clazz = new Clazz();
		clazz.setId(rs.getInt("id"));
		clazz.setCode(rs.getString("code"));
		clazz.setClassName(rs.getString("className"));
		return clazz;
	}

}
