package com.vikhi.stream.model;

public class Person {
	
	private String firstName;
	
	private String lastName;
	
	private Integer age;
	
	private String city;
	
	private Boolean isAlive;

	public Person(String firstName, String lastName, Integer age, String city, Boolean isAlive) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.city = city;
		this.isAlive = isAlive;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Boolean getIsAlive() {
		return isAlive;
	}

	public void setIsAlive(Boolean isAlive) {
		this.isAlive = isAlive;
	}

	@Override
	public String toString() {
		return "[First Name : " + this.firstName + "; Last Name : " + this.lastName + 
				"; Age : " + this.age + "; Home town : " + this.city + "; Is Alive : " + 
				(isAlive ? "YES" : "NO") + "]";
	}
}
