package com.assesement;

public class Employee {
	private String empName;
	private double salary;
	private String email;

	private String location;

	public Employee(String empName, double salary, String email, String location, String gender) {
		super();
		this.empName = empName;
		this.salary = salary;
		this.email = email;
		this.location = location;
		this.gender = gender;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	private String gender;

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", salary=" + salary + ", email=" + email + ", location=" + location
				+ ", gender=" + gender + "]";
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
