package com.vikhi.stream.model;

public class Employee {

	private Long employeeId;
	
	private Person employeeDetails;
	
	private Long managerId;
	
	private Boolean isActive;

	public Employee(Long employeeId, Person employeeDetails, Long managerId, Boolean isActive) {
		super();
		this.employeeId = employeeId;
		this.employeeDetails = employeeDetails;
		this.managerId = managerId;
		this.isActive = isActive;
	}

	public Long getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}

	public Person getEmployeeDetails() {
		return employeeDetails;
	}

	public void setEmployeeDetails(Person employeeDetails) {
		this.employeeDetails = employeeDetails;
	}

	public Long getManagerId() {
		return managerId;
	}

	public void setManagerId(Long managerId) {
		this.managerId = managerId;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}
	
	@Override
	public String toString() {
		return "[Employee Id : " + this.employeeId + "; Person : " + this.employeeDetails + 
				"; Manager Id : " + this.managerId + "; Is Active : " + (this.isActive ? "YES" : "NO") + "]";
	}
}
