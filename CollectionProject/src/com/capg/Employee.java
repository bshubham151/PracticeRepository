package com.capg;

public class Employee {
	private int employeeId;
	private String employeeName;
	private int employeeAge;
	private String department;
	private char gender;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int employeeId, String employeeName, int employeeAge, String department, char gender) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeAge = employeeAge;
		this.department = department;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeAge=" + employeeAge
				+ ", department=" + department + ", gender=" + gender + "]";
	}
	public int getEmployeeId() {
		
		return employeeId;
	}

}
