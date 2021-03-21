package com.katalyst.one;

public class Employee implements Comparable<Employee> {

	int empid;
	String name;
	int salary;

	public Employee() {

	}

	public Employee(int empid, String name, int salary) {

		this.empid = empid;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "[empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		if (this.salary > e.salary)
			return 1;
		else if (this.salary < e.salary)
			return -1;
		else
			return 0;
	}

}
