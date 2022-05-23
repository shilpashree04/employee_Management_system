package com.example.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "department")
public class Department {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "department")
	private int department_ID;
	private String short_Name;
	private String department_Name;
	
	public Department() {
		
	}

	public Department(int department_ID, String short_Name, String department_Name) {
		super();
		this.department_ID = department_ID;
		this.short_Name = short_Name;
		this.department_Name = department_Name;
	}

	public int getDepartment_ID() {
		return department_ID;
	}

	public void setDepartment_ID(int department_ID) {
		this.department_ID = department_ID;
	}

	public String getShort_Name() {
		return short_Name;
	}

	public void setShort_Name(String short_Name) {
		this.short_Name = short_Name;
	}

	public String getDepartment_Name() {
		return department_Name;
	}

	public void setDepartment_Name(String department_Name) {
		this.department_Name = department_Name;
	}
	
	

}
