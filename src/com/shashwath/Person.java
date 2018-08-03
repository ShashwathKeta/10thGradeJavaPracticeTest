package com.shashwath;

public class Person {
	
	private String firstName;
	private String lastName;
	private int age;
	private int gradeLevel;
	
	public Person (String firstName, String lastName, int age, int gradeLevel) {
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.gradeLevel = gradeLevel;
	}
	
	public String getFirstNameLastName() {
		return firstName + " " + lastName;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getGradeLevel() {
		return gradeLevel;
	}
}