package com.example.ems.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table (name = "employee")
public class Employee {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name = "employee_id")
	private int employeeID;
	
	@Column(name ="first_name")
	private String firstname;
	
	@Column(name = "last_name")
	private String lastName;
	
	
	@ManyToOne
	@JoinColumn(name = "department_id")
	private Department department;
	
	public Employee() {
		
	}

	public Employee(String firstname, String lastName, Department department) {
		super();
		this.firstname = firstname;
		this.lastName = lastName;
		this.department = department;
	}

	public int getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	@Override
	public String toString() {
		return String.format("Employee[employeeID = %d, firstName = %s, lastName = %s, department_ID =%d, employeeID, firstName, lastName,department.getDepartment_ID());");
	}
	
	
	

	
}
