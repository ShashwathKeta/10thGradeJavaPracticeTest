package com.shashwath;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Persons {
	public static void printPersons (ArrayList<Person> persons) {
		for (int i = 0; i < persons.size(); i++) {
			System.out.println();
			System.out.println("Name:   " + persons.get(i).getFirstNameLastName());
			System.out.println("Age:    " + persons.get(i).getAge());
			System.out.println("Grade:  " + persons.get(i).getGradeLevel());
			System.out.println();
		}
	}
	public static void main(String args[]) {
		ArrayList<Person> persons = new ArrayList<Person>();
		
		try 
		{
			Scanner input = new Scanner(new File("Persons.Text"));
			
			while (input.hasNextLine()) {
				String firstName = input.nextLine();
				String lastName = input.nextLine();
				int age = input.nextInt();
				input.nextLine();
				int gradeLevel = input.nextInt();
				input.nextLine();
				input.nextLine();
				
				Person person = new Person(firstName, lastName, age, gradeLevel);
				
				persons.add(person);
			}
			printPersons(persons);
		}
		catch (Exception e) {
			System.out.println("Your file Persons.text could not be read properly");
			System.out.println(e.getMessage());
		}
	}
}