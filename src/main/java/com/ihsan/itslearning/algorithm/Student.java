package com.ihsan.itslearning.algorithm;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	private String name;
	private int ID;
	private double GPA;
	private String department;
	
	public List<Course> courseList = new ArrayList<>();

	public void setCourseList(List<Course> courseList) {
		this.courseList = courseList;
	}
	
	public Student () {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public double getGPA() {
		return GPA;
	}

	public void setGPA(double gPA) {
		GPA = gPA;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	@Override
	public String toString() {
		String list = "";
		
		for (int i = 0; i < courseList.size(); i++) {
			list += courseList.get(i).getName();
		}
		
		return "Student [name=" + name + ", ID=" + ID + ", GPA=" + GPA + ", department=" + department + ", courseList="
				+ list + "]";
	}
	
	public double calculateGPA () {
		double totalCredits = 0;
		double totalPoints = 0;
		
		for (int i = 0; i < courseList.size(); i++) {
			totalCredits += courseList.get(i).getCredit();
			//totalCredits = totalCredits + courseList.get(i).getCredit();
			totalPoints += (courseList.get(i).calculateGrade() 
					* courseList.get(i).getCredit());
		}
		
		double result = totalPoints / totalCredits;
		return result;	
		
	}

	public static void main(){
		Course c = new Course();
		c.setName("math");
		c.setCredit(10);
		c.setGrade("B");

		Student s1 = new Student();
		s1.setID(1);
		s1.setName("ihsan");
		s1.setGPA(3.5);
		s1.setDepartment("IT");

		s1.setCourseList(List.of(c));

		var a = s1.calculateGPA();
		System.out.println("calculated value:" + a);
		System.out.println(s1.toString());


	}
	
	
	
	
	
	

}
