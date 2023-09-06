package com.pkg.Encapsulation;

import java.util.Objects;

public class Employee {
	private int id;
	private char grade;
	private String name;
	private double salary;

	
	
	@Override
	public int hashCode() {
		return Objects.hash(grade, id, name, salary);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return grade == other.grade && id == other.id && Objects.equals(name, other.name)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", grade=" + grade + ", name=" + name + ", salary=" + salary + "]";
	}

	public static void main(String[] arg) {
		Employee em = new Employee();
		em.setId(12345);
		em.setSalary(1000);
		//System.out.println(em.getId());
		//System.out.println(em.getSalary());
		System.out.println(em.hashCode());
		Employee em1 = new Employee();
		System.out.println(em1.hashCode());
		System.out.println(em1.toString());
		Employee em2 = new Employee();
		System.out.println(em1.equals(em2));
		
		
		
	}

	private int getId() {
		return id;
	}

	private void setId(int id) {
		this.id = id;
	}

	private char getGrade() {
		return grade;
	}

	private void setGrade(char grade) {
		this.grade = grade;
	}

	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	private double getSalary() {
		return salary;
	}

	private void setSalary(double salary) {
		this.salary = salary;
	}

}
