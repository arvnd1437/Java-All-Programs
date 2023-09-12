package com.collection.pkg;

import java.util.ArrayList;

public class CollectionForUserDefinedType {

	public static void main(String[] args) {
		Employee e1=new Employee(123,"Ram",10000.0,'c');
		Employee e2=new Employee(124,"Raj",11000.0,'d');
		Employee e3=new Employee(125,"Rock",12000.0,'e');
		Student s1=new Student(12345,"Ara");
		Student s2=new Student(12346,"Arun");
		
		
		
		ArrayList al = new ArrayList();
		al.add(e1);
		al.add(e2);
		al.add(e3);
		al.add(s1);
		al.add(s2);
		
		System.out.println(al);

	}
	
}

class Employee
{
	int empId;
	String empName;
	double empSalary;
	char empGrade;

public Employee(int empId,String empName,double empSalary,char empGrade) {
	this.empId=empId;
	this.empName=empName;
	this.empSalary=empSalary;
	this.empGrade= empGrade;
	
}

@Override
public String toString() {
	return "Employee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empGrade=" + empGrade
			+ "]";
}

}

class Student{
	int rollNo;
	String name;
	public Student(int rollNo, String name) {
		super();
		this.rollNo = rollNo;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	
	
}