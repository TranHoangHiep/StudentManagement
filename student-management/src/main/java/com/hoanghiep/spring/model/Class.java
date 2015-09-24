package com.hoanghiep.spring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "class", catalog = "student_management", uniqueConstraints = {
		@UniqueConstraint(columnNames = "CODE"),
		@UniqueConstraint(columnNames = "NAME")
})
public class Class {

	private int id;
	private String code;
	private String name;
	private Date createdDate;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public int getId() {return id;}
	public void setId(int id) {this.id = id;}
	
	@Column(name = "code", nullable = false)
	public String getCode() {return code;}
	public void setCode(String code) {this.code = code;}

	@Column(name = "name", nullable = false)
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}

	@Column(name = "createdDate")
	public Date getCreatedDate() {return createdDate;}
	public void setCreatedDate(Date createdDate) {this.createdDate = createdDate;}

}
