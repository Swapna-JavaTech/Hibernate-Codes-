package com.mouritech.hibernateinheritanceexample.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "pemployee123")
@PrimaryKeyJoinColumn(name = "eid")
public class PermanentEmployee extends Employee {
	
	@Column(name="emp_designation")
	private String designation;
	
	@Column(name="emp_dept")
	private String department;
	
	public PermanentEmployee() {
		// TODO Auto-generated constructor stub
	}
	
	

	public PermanentEmployee(String designation, String department) {
		super();
		this.designation = designation;
		this.department = department;
	}



	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	
}
